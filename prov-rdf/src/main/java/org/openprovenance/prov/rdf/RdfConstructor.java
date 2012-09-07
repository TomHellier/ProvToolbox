package org.openprovenance.prov.rdf;

import org.openprovenance.prov.notation.TreeConstructor;
import org.openprovenance.prov.xml.ProvFactory;
import org.openprovenance.prov.xml.ProvUtilities;
import org.openrdf.elmo.ElmoManager;
import javax.xml.namespace.QName;
import java.util.Hashtable;
import java.util.List;
import java.net.URI;
import javax.xml.datatype.XMLGregorianCalendar;

import org.openrdf.model.impl.URIImpl;
import org.openrdf.model.impl.LiteralImpl;
import org.openrdf.model.impl.StatementImpl;

/**
 * Initial convertor to rdf. 
 */
public class RdfConstructor implements TreeConstructor {
	final ProvFactory pFactory;
	final ElmoManager manager;
	final ProvUtilities pUtil;

	Hashtable<String, String> namespaceTable = new Hashtable<String, String>();

	public RdfConstructor(ProvFactory pFactory, ElmoManager manager) {
		this.pFactory = pFactory;
		this.pUtil = new ProvUtilities();
		this.manager = manager;
		pFactory.setNamespaces(namespaceTable);
	}

	public Object convertActivity(Object id, Object startTime, Object endTime,
			Object aAttrs) {
		QName qname = getQName(id);
		Activity a = (Activity) manager.designate(qname, Activity.class);
		processAttributes(qname, (List<?>) aAttrs);
		return a;
	}

	public Object convertEntity(Object id, Object attrs) {
		QName qname = getQName(id);
		Entity e = (Entity) manager.designate(qname, Entity.class);
		processAttributes(qname, (List<?>) attrs);
		return e;
	}

	public Object convertAgent(Object id, Object attrs) {
		QName qname = getQName(id);
		Agent ag = (Agent) manager.designate(qname, Agent.class);
		processAttributes(qname, (List<?>) attrs);
		return ag;
	}

	public Object convertBundle(Object nss, List<Object> records,
			List<Object> bundles) {
		return null;
	}

	public Object convertNamedBundle(Object id, Object nss, List<Object> records) {
		return null;
	}

	public Object convertAttributes(List<Object> attributes) {
		return attributes;
	}

	public Object convertId(String id) {
		return id;
	}

	public Object convertAttribute(Object name, Object value) {
		return new Object[] { name, value };
	}

	public Object convertStart(String start) {
		return null;
	}

	public Object convertEnd(String end) {
		return null;
	}

	public Object convertString(String s) {
		s = unwrap(s);
		return s;
	}

	public Object convertString(String s, String lang) {
		s = unwrap(s);
		return s + "@" + lang;
	}

	public Object convertInt(int s) {
		return s;
	}

	public void processAttributes(QName a, List<?> aAttrs) {
		if (aAttrs == null)
			return;
		if (a == null)
			return; // TODO, mmh, it might have been autogenerated.

		org.openrdf.model.Resource r = new URIImpl(a.getNamespaceURI()
				+ a.getLocalPart());

		for (Object entry : aAttrs) {
			Object[] pair = (Object[]) entry;

			Object[] typedLit = null;

			if (pair[1] instanceof Object[]) {
				typedLit = (Object[]) pair[1];
				typedLit[0] = unwrap((String) typedLit[0]);
			} else if (pair[1] instanceof String) {
				typedLit = new Object[] { pair[1], "xsd:string" };
			} else {
				throw new UnsupportedOperationException();
			}

			QName pred = getQName(pair[0]);
			String typeAsString=(String) (typedLit[1]);
			QName type = getQName(typeAsString);
			String value = (String) (typedLit[0]);
			
			if (pair[0].equals("prov:type")) {
				if (typeAsString.equals("xsd:QName")) {  //TODO: this should become prov:qualified name
					System.out.println("----> " + value);
					Class cl=reservedClass(value);
					if (cl!=null) manager.designate(a,cl);
					
				}
			}

			org.openrdf.model.Statement stmnt = new StatementImpl(r,
					new URIImpl(pred.getNamespaceURI() + pred.getLocalPart()),
					new LiteralImpl(value, new URIImpl(type.getNamespaceURI()
							+ type.getLocalPart())));

			try {
				((org.openrdf.elmo.sesame.SesameManager) manager)
						.getConnection().add(stmnt);
			} catch (org.openrdf.repository.RepositoryException e) {
			}

		}
	}

	private Class reservedClass(String value) {
		if (value.equals("prov:Plan")) return Plan.class;
		if (value.equals("prov:SoftwareAgent")) return SoftwareAgent.class;
		if (value.equals("prov:Person")) return Person.class;
		if (value.equals("prov:Organization")) return Organization.class;
		if (value.equals("prov:Bundle")) return Bundle.class;
		return null;
	}

	public <INFLUENCE, TYPE> INFLUENCE addEntityInfluence(Object id, TYPE e2,
			Entity e1, Object time, Object aAttrs, Object other,
			Class<INFLUENCE> cl) {

		INFLUENCE infl = null;

		if ((id != null) || (time != null)
				|| ((aAttrs != null) && !(((List<?>) aAttrs).isEmpty()))
				|| (other != null)) {
			QName qname = getQName(id);
			infl = manager.designate(qname, cl);
			EntityInfluence qi = (EntityInfluence) infl;
			qi.getEntities().add(e1);
			addQualifiedInfluence(e2, infl);

			if (time != null) {
				String s = (String) time;
				XMLGregorianCalendar t = pFactory.newISOTime(s);
				((InstantaneousEvent) infl).getAtTime().add(t);
			}
			processAttributes(qname, (List<?>) aAttrs);
		}
		return infl;
	}

	public <INFLUENCE> INFLUENCE addUnknownInfluence(Object id,
			ActivityOrAgentOrEntity e2, ActivityOrAgentOrEntity e1,
			Object aAttrs, Class<INFLUENCE> cl) {

		INFLUENCE infl = null;

		if ((id != null)
				|| ((aAttrs != null) && !(((List<?>) aAttrs).isEmpty()))) {
			QName qname = getQName(id);
			infl = manager.designate(qname, cl);
			Influence qi = (Influence) infl;
			qi.getInfluencers().add(e1);
			addQualifiedInfluence(e2, infl);

			processAttributes(qname, (List<?>) aAttrs);
		}
		return infl;
	}

	public <INFLUENCE, TYPE> INFLUENCE addActivityInfluence(Object id, TYPE e2,
			Activity a1, Object time, Object aAttrs, Class<INFLUENCE> cl) {

		INFLUENCE infl = null;

		if ((id != null) || (time != null)
				|| ((aAttrs != null) && !(((List<?>) aAttrs).isEmpty()))) {
			QName qname = getQName(id);
			infl = manager.designate(qname, cl);
			ActivityInfluence qi = (ActivityInfluence) infl;
			qi.getActivities().add(a1);
			addQualifiedInfluence(e2, infl);

			if (time != null) {
				String s = (String) time;
				XMLGregorianCalendar t = pFactory.newISOTime(s);
				((InstantaneousEvent) infl).getAtTime().add(t);
			}
			processAttributes(qname, (List<?>) aAttrs);
		}
		return infl;
	}

	public <INFLUENCE, TYPE> INFLUENCE addAgentInfluence(Object id, TYPE e2,
			Agent a1, Object time, Object aAttrs, Object other,
			Class<INFLUENCE> cl) {

		INFLUENCE infl = null;

		if ((id != null) || (time != null)
				|| ((aAttrs != null) && !(((List<?>) aAttrs).isEmpty()))
				|| (other != null)) {
			QName qname = getQName(id);
			infl = manager.designate(qname, cl);
			AgentInfluence qi = (AgentInfluence) infl;
			qi.getAgents().add(a1);
			addQualifiedInfluence(e2, infl);

			if (time != null) {
				String s = (String) time;
				XMLGregorianCalendar t = pFactory.newISOTime(s);
				((InstantaneousEvent) infl).getAtTime().add(t);
			}
			processAttributes(qname, (List<?>) aAttrs);
		}
		return infl;
	}

	public Object convertUsed(Object id, Object id2, Object id1, Object time,
			Object aAttrs) {
		QName qn2 = getQName(id2);
		QName qn1 = getQName(id1);

		Entity e1 = (Entity) manager.find(qn1);
		Activity a2 = (Activity) manager.find(qn2);
		Usage u = addEntityInfluence(id, a2, e1, time, aAttrs, null,
				Usage.class);

		a2.getUsed().add(e1);

		return u;
	}

	public <INFLUENCE, TYPE1> INFLUENCE test(INFLUENCE foo, TYPE1 foo1) {
		return foo;
	}

	// not pretty

	public <INFLUENCE, EFFECT> void addQualifiedInfluence(EFFECT e2, INFLUENCE g) {
		if (g != null) {
			if (g instanceof Generation) {
				((Entity) e2).getQualifiedGeneration().add((Generation) g);
			} else if (g instanceof Invalidation) {
				((Entity) e2).getQualifiedInvalidation().add((Invalidation) g);
			} else if (g instanceof Communication) {
				((Activity) e2).getQualifiedCommunication().add(
						(Communication) g);
			} else if (g instanceof Usage) {
				((Activity) e2).getQualifiedUsage().add((Usage) g);
			} else if (g instanceof Start) {
				((Activity) e2).getQualifiedStart().add((Start) g);
			} else if (g instanceof End) {
				((Activity) e2).getQualifiedEnd().add((End) g);
			} else if (g instanceof Attribution) {
				((Entity) e2).getQualifiedAttribution().add((Attribution) g);
			} else if (g instanceof Association) {
				((Activity) e2).getQualifiedAssociation().add((Association) g);
			} else if (g instanceof Delegation) {
				((Agent) e2).getQualifiedDelegation().add((Delegation) g);
			} else if (g instanceof Derivation) {
				((Entity) e2).getQualifiedDerivation().add((Derivation) g);
			} else if (g instanceof Influence) {
				((ActivityOrAgentOrEntity) e2).getQualifiedInfluence().add(
						(Influence) g);
			} else {
				throw new UnsupportedOperationException();
			}
		}
	}

	public Object convertWasGeneratedBy(Object id, Object id2, Object id1,
			Object time, Object aAttrs) {
		QName qn2 = getQName(id2);
		QName qn1 = getQName(id1);

		Entity e2 = (Entity) manager.find(qn2);
		Activity a1 = (Activity) manager.find(qn1);

		Generation g = addActivityInfluence(id, e2, a1, time, aAttrs,
				Generation.class);

		e2.getWasGeneratedBy().add(a1);
		return g;
	}

	public Object convertWasStartedBy(Object id, Object id2, Object id1,
			Object id3, Object time, Object aAttrs) {
		QName qn2 = getQName(id2);
		QName qn1 = getQName(id1);
		QName qn3 = getQName(id3);

		Entity e1 = (Entity) manager.find(qn1);
		Activity a2 = (Activity) manager.find(qn2);
		Start s = addEntityInfluence(id, a2, e1, time, aAttrs, id3, Start.class);

		if (qn3 != null) {
			Activity a3 = (Activity) manager.find(qn3);
			s.getHadActivity().add(a3);
		}

		a2.getWasStartedBy().add(e1);

		return s;
	}

	public Object convertWasEndedBy(Object id, Object id2, Object id1,
			Object id3, Object time, Object aAttrs) {
		QName qn2 = getQName(id2);
		QName qn1 = getQName(id1);
		QName qn3 = getQName(id3);

		Entity e1 = (Entity) manager.find(qn1);
		Activity a2 = (Activity) manager.find(qn2);
		End s = addEntityInfluence(id, a2, e1, time, aAttrs, id3, End.class);

		if (qn3 != null) {
			Activity a3 = (Activity) manager.find(qn3);
			s.getHadActivity().add(a3);
		}

		a2.getWasEndedBy().add(e1);

		return s;
	}

	public Object convertWasInvalidatedBy(Object id, Object id2, Object id1,
			Object time, Object aAttrs) {
		QName qn2 = getQName(id2);
		QName qn1 = getQName(id1);

		Entity e2 = (Entity) manager.find(qn2);
		Activity a1 = (Activity) manager.find(qn1);

		Invalidation g = addActivityInfluence(id, e2, a1, time, aAttrs,
				Invalidation.class);

		e2.getWasInvalidatedBy().add(a1);
		return g;
	}

	public Object convertWasInformedBy(Object id, Object id2, Object id1,
			Object aAttrs) {
		QName qn2 = getQName(id2);
		QName qn1 = getQName(id1);

		Activity e2 = (Activity) manager.find(qn2);
		Activity a1 = (Activity) manager.find(qn1);

		Communication g = addActivityInfluence(id, e2, a1, null, aAttrs,
				Communication.class);

		e2.getWasInformedBy().add(a1);
		return g;
	}

	public Object convertWasAttributedTo(Object id, Object id2, Object id1,
			Object aAttrs) {
		QName qn2 = getQName(id2);
		QName qn1 = getQName(id1);

		Entity e2 = (Entity) manager.find(qn2);
		Agent a1 = (Agent) manager.find(qn1);

		Attribution g = addAgentInfluence(id, e2, a1, null, aAttrs, null,
				Attribution.class);

		e2.getWasAttributedTo().add(a1);
		return g;
	}

	public Object convertWasDerivedFrom(Object id, Object id2, Object id1,
			Object a, Object gen2, Object use1, Object dAttrs) {
		QName qn2 = getQName(id2);
		QName qn1 = getQName(id1);
		QName qn3 = getQName(a);

		QName qn4 = getQName(use1);
		QName qn5 = getQName(gen2);

		Entity e2 = (Entity) manager.find(qn2);
		Entity e1 = (Entity) manager.find(qn1);

		Object other = a;
		if (qn4 != null) {
			other = qn4;
		} else {
			if (qn5 != null)
				other = qn5;
		}

		Derivation d = addEntityInfluence(id, e2, e1, null, dAttrs, other,
				Derivation.class);

		if (d != null) {
			if (qn3 != null) {
				Activity a3 = (Activity) manager.find(qn3);
				d.getHadActivity().add(a3);
			}
		}

		e2.getWasDerivedFrom().add(e1);

		return d;

	}

	public Object convertWasRevisionOf(Object id, Object id2, Object id1,
			Object pe, Object q2, Object q1, Object dAttrs) {
		// todo
		throw new UnsupportedOperationException();
	}

	public Object convertWasQuotedFrom(Object id, Object id2, Object id1,
			Object pe, Object q2, Object q1, Object dAttrs) {
		// todo
		throw new UnsupportedOperationException();
	}

	public Object convertHadPrimarySource(Object id, Object id2, Object id1,
			Object pe, Object q2, Object q1, Object dAttrs) {
		// todo
		throw new UnsupportedOperationException();
	}

	public Object convertWasInfluencedBy(Object id, Object id2, Object id1,
			Object aAttrs) {
		QName qn2 = getQName(id2);
		QName qn1 = getQName(id1);

		ActivityOrAgentOrEntity e1 = (ActivityOrAgentOrEntity) manager
				.find(qn1);
		ActivityOrAgentOrEntity e2 = (ActivityOrAgentOrEntity) manager
				.find(qn2);

		Influence u = addUnknownInfluence(id, e2, e1, aAttrs, Influence.class);

		e2.getWasInfluencedBy().add(e1);

		return u;

	}

	public Object convertAlternateOf(Object id2, Object id1) {
		QName qn2 = getQName(id2);
		QName qn1 = getQName(id1);

		Entity e2 = (Entity) manager.find(qn2);
		Entity e1 = (Entity) manager.find(qn1);

		e2.getAlternateOf().add(e1);
		return null;
	}

	public Object convertSpecializationOf(Object id2, Object id1) {
		QName qn2 = getQName(id2);
		QName qn1 = getQName(id1);

		Entity e2 = (Entity) manager.find(qn2);
		Entity e1 = (Entity) manager.find(qn1);

		e2.getSpecializationOf().add(e1);
		return null;
	}

	public Object convertActedOnBehalfOf(Object id, Object id2, Object id1,
			Object a, Object aAttrs) {
		QName qn2 = getQName(id2);
		QName qn1 = getQName(id1);
		QName qn3 = getQName(a);

		Agent ag2 = (Agent) manager.find(qn2);
		Agent ag1 = (Agent) manager.find(qn1);

		Delegation g = addAgentInfluence(id, ag2, ag1, null, aAttrs, a,
				Delegation.class);

		if (qn3 != null) {
			Activity a3 = (Activity) manager.find(qn3);
			g.getHadActivity().add(a3);
		}

		ag2.getActedOnBehalfOf().add(ag1);

		return g;
	}

	public Object convertWasAssociatedWith(Object id, Object id2, Object id1,
			Object pl, Object aAttrs) {
		QName qn2 = getQName(id2);
		QName qn1 = getQName(id1);
		QName qn3 = getQName(pl);

		Activity a2 = (Activity) manager.find(qn2);
		Agent ag1 = (Agent) manager.find(qn1);

		Association ass = addAgentInfluence(id, a2, ag1, null, aAttrs, pl,
				Association.class);

		if (qn3 != null) {
			Plan plan = (Plan) manager.designate(qn3,Plan.class); // will declare it as Plan if not already done
			ass.getHadPlan().add(plan);
		}

		a2.getWasAssociatedWith().add(ag1);

		return ass;
	}

	public Object convertExtension(Object name, Object id, Object args,
			Object dAttrs) {
		return null;
	}

	public Object convertQualifiedName(String qname) {
		return qname;
	}

	public Object convertIRI(String iri) {
		iri = unwrap(iri);
		return URI.create(iri);
	}

	public Object convertTypedLiteral(String datatype, Object value) {
		return new Object[] { value, datatype };
	}

	public Object convertNamespace(Object pre, Object iri) {
		String s_pre = (String) pre;
		String s_iri = (String) iri;
		s_iri = unwrap(s_iri);
		namespaceTable.put(s_pre, s_iri);
		return null;
	}

	public Object convertDefaultNamespace(Object iri) {
		String s_iri = (String) iri;
		s_iri = unwrap(s_iri);
		namespaceTable.put("_", s_iri);
		return null;
	}

	public Object convertNamespaces(List<Object> namespaces) {
		pFactory.setNamespaces(namespaceTable);
		return namespaceTable;
	}

	public Object convertPrefix(String pre) {
		return pre;
	}

	public QName getQName(Object id) {
		if (id == null) {
			return null;
		}
		String idAsString = (String) id;
		return pFactory.stringToQName(idAsString);
	}

	public String unwrap(String s) {
		return s.substring(1, s.length() - 1);
	}

	/* Component 5 */

	public Object convertInsertion(Object id, Object id2, Object id1,
			Object map, Object dAttrs) {
		// todo
		throw new UnsupportedOperationException();
	}

	public Object convertEntry(Object o1, Object o2) {
		// todo
		throw new UnsupportedOperationException();
	}

	public Object convertKeyEntitySet(List<Object> o) {
		// todo
		throw new UnsupportedOperationException();
	}

	public Object convertRemoval(Object id, Object id2, Object id1,
			Object keys, Object dAttrs) {
		// todo
		throw new UnsupportedOperationException();
	}

	public Object convertDictionaryMemberOf(Object id, Object id2, Object map,
			Object complete, Object dAttrs) {
		// todo
		throw new UnsupportedOperationException();
	}

	public Object convertCollectionMemberOf(Object id, Object id2, Object map,
			Object complete, Object dAttrs) {
		// todo
		throw new UnsupportedOperationException();
	}

	public Object convertKeys(List<Object> keys) {
		// todo
		throw new UnsupportedOperationException();
	}

	/* Component 6 */

	public Object convertMentionOf(Object id2, Object bu, Object id1) {
		QName qn2 = getQName(id2);
		QName qn1 = getQName(id1);

		QName qn3 = getQName(bu);

		Entity e2 = (Entity) manager.find(qn2);
		Entity e1 = (Entity) manager.find(qn1);
		Bundle e3 = (Bundle) manager.designate(qn3, Bundle.class); // will declare it as plan if not already done

		e2.getMentionOf().add(e1);
		e2.getAsInBundle().add(e3);

		return null;
	}

}
