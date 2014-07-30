//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.11.14 at 09:56:36 PM GMT 
//


package org.openprovenance.prov.xml;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import org.openprovenance.prov.model.LangString;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.openprovenance.prov.xml package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _HadPrimarySource_QNAME = new QName("http://www.w3.org/ns/prov#", "hadPrimarySource");
    private final static QName _Collection_QNAME = new QName("http://www.w3.org/ns/prov#", "collection");
    private final static QName _WasDerivedFrom_QNAME = new QName("http://www.w3.org/ns/prov#", "wasDerivedFrom");
    private final static QName _Used_QNAME = new QName("http://www.w3.org/ns/prov#", "used");
    private final static QName _Type_QNAME = new QName("http://www.w3.org/ns/prov#", "type");
    private final static QName _WasInformedBy_QNAME = new QName("http://www.w3.org/ns/prov#", "wasInformedBy");
    private final static QName _ActedOnBehalfOf_QNAME = new QName("http://www.w3.org/ns/prov#", "actedOnBehalfOf");
    private final static QName _EmptyDictionary_QNAME = new QName("http://www.w3.org/ns/prov#", "emptyDictionary");
    private final static QName _WasAssociatedWith_QNAME = new QName("http://www.w3.org/ns/prov#", "wasAssociatedWith");
    private final static QName _SoftwareAgent_QNAME = new QName("http://www.w3.org/ns/prov#", "softwareAgent");
    private final static QName _Person_QNAME = new QName("http://www.w3.org/ns/prov#", "person");
    private final static QName _WasRevisionOf_QNAME = new QName("http://www.w3.org/ns/prov#", "wasRevisionOf");
    private final static QName _Location_QNAME = new QName("http://www.w3.org/ns/prov#", "location");
    private final static QName _WasInfluencedBy_QNAME = new QName("http://www.w3.org/ns/prov#", "wasInfluencedBy");
    private final static QName _Entity_QNAME = new QName("http://www.w3.org/ns/prov#", "entity");
    private final static QName _EmptyCollection_QNAME = new QName("http://www.w3.org/ns/prov#", "emptyCollection");
    private final static QName _Role_QNAME = new QName("http://www.w3.org/ns/prov#", "role");
    private final static QName _Bundle_QNAME = new QName("http://www.w3.org/ns/prov#", "bundle");
    private final static QName _Value_QNAME = new QName("http://www.w3.org/ns/prov#", "value");
    private final static QName _AlternateOf_QNAME = new QName("http://www.w3.org/ns/prov#", "alternateOf");
    private final static QName _Activity_QNAME = new QName("http://www.w3.org/ns/prov#", "activity");
    private final static QName _HadDictionaryMember_QNAME = new QName("http://www.w3.org/ns/prov#", "hadDictionaryMember");
    private final static QName _WasEndedBy_QNAME = new QName("http://www.w3.org/ns/prov#", "wasEndedBy");
    private final static QName _Document_QNAME = new QName("http://www.w3.org/ns/prov#", "document");
    private final static QName _Organization_QNAME = new QName("http://www.w3.org/ns/prov#", "organization");
    private final static QName _HadMember_QNAME = new QName("http://www.w3.org/ns/prov#", "hadMember");
    private final static QName _Dictionary_QNAME = new QName("http://www.w3.org/ns/prov#", "dictionary");
    private final static QName _Label_QNAME = new QName("http://www.w3.org/ns/prov#", "label");
    private final static QName _Agent_QNAME = new QName("http://www.w3.org/ns/prov#", "agent");
    private final static QName _WasInvalidatedBy_QNAME = new QName("http://www.w3.org/ns/prov#", "wasInvalidatedBy");
    private final static QName _MentionOf_QNAME = new QName("http://www.w3.org/ns/prov#", "mentionOf");
    private final static QName _Others_QNAME = new QName("http://www.w3.org/ns/prov#", "others");
    private final static QName _WasAttributedTo_QNAME = new QName("http://www.w3.org/ns/prov#", "wasAttributedTo");
    private final static QName _SpecializationOf_QNAME = new QName("http://www.w3.org/ns/prov#", "specializationOf");
    private final static QName _WasStartedBy_QNAME = new QName("http://www.w3.org/ns/prov#", "wasStartedBy");
    private final static QName _DerivedByRemovalFrom_QNAME = new QName("http://www.w3.org/ns/prov#", "derivedByRemovalFrom");
    private final static QName _DerivedByInsertionFrom_QNAME = new QName("http://www.w3.org/ns/prov#", "derivedByInsertionFrom");
    private final static QName _WasQuotedFrom_QNAME = new QName("http://www.w3.org/ns/prov#", "wasQuotedFrom");
    private final static QName _KeyEntityPair_QNAME = new QName("http://www.w3.org/ns/prov#", "keyEntityPair");
    private final static QName _Plan_QNAME = new QName("http://www.w3.org/ns/prov#", "plan");
    private final static QName _WasGeneratedBy_QNAME = new QName("http://www.w3.org/ns/prov#", "wasGeneratedBy");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.openprovenance.prov.xml
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EmptyDictionary }
     * 
     */
    public EmptyDictionary createEmptyDictionary() {
        return new EmptyDictionary();
    }

    /**
     * Create an instance of {@link Person }
     * 
     */
    public Person createPerson() {
        return new Person();
    }

    /**
     * Create an instance of {@link SoftwareAgent }
     * 
     */
    public SoftwareAgent createSoftwareAgent() {
        return new SoftwareAgent();
    }

    /**
     * Create an instance of {@link WasAssociatedWith }
     * 
     */
    public WasAssociatedWith createWasAssociatedWith() {
        return new WasAssociatedWith();
    }

    /**
     * Create an instance of {@link WasInfluencedBy }
     * 
     */
    public WasInfluencedBy createWasInfluencedBy() {
        return new WasInfluencedBy();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link Revision }
     * 
     */
    public Revision createRevision() {
        return new Revision();
    }

    /**
     * Create an instance of {@link EmptyCollection }
     * 
     */
    public EmptyCollection createEmptyCollection() {
        return new EmptyCollection();
    }

    /**
     * Create an instance of {@link Entity }
     * 
     */
    public Entity createEntity() {
        return new Entity();
    }

    /**
     * Create an instance of {@link PrimarySource }
     * 
     */
    public PrimarySource createPrimarySource() {
        return new PrimarySource();
    }

    /**
     * Create an instance of {@link Collection }
     * 
     */
    public Collection createCollection() {
        return new Collection();
    }

    /**
     * Create an instance of {@link WasDerivedFrom }
     * 
     */
    public WasDerivedFrom createWasDerivedFrom() {
        return new WasDerivedFrom();
    }

    /**
     * Create an instance of {@link Used }
     * 
     */
    public Used createUsed() {
        return new Used();
    }

    /**
     * Create an instance of {@link Type }
     * 
     */
    public Type createType() {
        return new Type();
    }

    /**
     * Create an instance of {@link ActedOnBehalfOf }
     * 
     */
    public ActedOnBehalfOf createActedOnBehalfOf() {
        return new ActedOnBehalfOf();
    }

    /**
     * Create an instance of {@link WasInformedBy }
     * 
     */
    public WasInformedBy createWasInformedBy() {
        return new WasInformedBy();
    }

    /**
     * Create an instance of {@link DictionaryMembership }
     * 
     */
    public DictionaryMembership createDictionaryMembership() {
        return new DictionaryMembership();
    }

    /**
     * Create an instance of {@link Document }
     * 
     */
    public Document createDocument() {
        return new Document();
    }

    /**
     * Create an instance of {@link Organization }
     * 
     */
    public Organization createOrganization() {
        return new Organization();
    }

    /**
     * Create an instance of {@link WasEndedBy }
     * 
     */
    public WasEndedBy createWasEndedBy() {
        return new WasEndedBy();
    }

    /**
     * Create an instance of {@link HadMember }
     * 
     */
    public HadMember createHadMember() {
        return new HadMember();
    }

    /**
     * Create an instance of {@link Value }
     * 
     */
    public Value createValue() {
        return new Value();
    }

    /**
     * Create an instance of {@link Bundle }
     * 
     */
    public Bundle createBundle() {
        return new Bundle();
    }

    /**
     * Create an instance of {@link Role }
     * 
     */
    public Role createRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link AlternateOf }
     * 
     */
    public AlternateOf createAlternateOf() {
        return new AlternateOf();
    }

    /**
     * Create an instance of {@link Activity }
     * 
     */
    public Activity createActivity() {
        return new Activity();
    }

    /**
     * Create an instance of {@link Others }
     * 
     */
    public Others createOthers() {
        return new Others();
    }

    /**
     * Create an instance of {@link SpecializationOf }
     * 
     */
    public SpecializationOf createSpecializationOf() {
        return new SpecializationOf();
    }

    /**
     * Create an instance of {@link WasAttributedTo }
     * 
     */
    public WasAttributedTo createWasAttributedTo() {
        return new WasAttributedTo();
    }

    /**
     * Create an instance of {@link LangString }
     * 
     */
    public InternationalizedString createInternationalizedString() {
        return new InternationalizedString();
    }

    /**
     * Create an instance of {@link Dictionary }
     * 
     */
    public Dictionary createDictionary() {
        return new Dictionary();
    }

    /**
     * Create an instance of {@link MentionOf }
     * 
     */
    public MentionOf createMentionOf() {
        return new MentionOf();
    }

    /**
     * Create an instance of {@link WasInvalidatedBy }
     * 
     */
    public WasInvalidatedBy createWasInvalidatedBy() {
        return new WasInvalidatedBy();
    }

    /**
     * Create an instance of {@link Agent }
     * 
     */
    public Agent createAgent() {
        return new Agent();
    }

    /**
     * Create an instance of {@link DerivedByInsertionFrom }
     * 
     */
    public DerivedByInsertionFrom createDerivedByInsertionFrom() {
        return new DerivedByInsertionFrom();
    }

    /**
     * Create an instance of {@link DerivedByRemovalFrom }
     * 
     */
    public DerivedByRemovalFrom createDerivedByRemovalFrom() {
        return new DerivedByRemovalFrom();
    }

    /**
     * Create an instance of {@link Plan }
     * 
     */
    public Plan createPlan() {
        return new Plan();
    }

    /**
     * Create an instance of {@link Entry }
     * 
     */
    public Entry createEntry() {
        return new Entry();
    }

    /**
     * Create an instance of {@link Quotation }
     * 
     */
    public Quotation createQuotation() {
        return new Quotation();
    }

    /**
     * Create an instance of {@link WasGeneratedBy }
     * 
     */
    public WasGeneratedBy createWasGeneratedBy() {
        return new WasGeneratedBy();
    }

    /**
     * Create an instance of {@link WasStartedBy }
     * 
     */
    public WasStartedBy createWasStartedBy() {
        return new WasStartedBy();
    }

    /**
     * Create an instance of {@link TypedValue }
     * 
     */
    public TypedValue createTypedValue() {
        return new TypedValue();
    }

    /**
     * Create an instance of {@link NamedBundle }
     * 
     */
    public NamedBundle createNamedBundle() {
        return new NamedBundle();
    }

    /**
     * Create an instance of {@link IDRef }
     * 
     */
    public IDRef createIDRef() {
        return new IDRef();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimarySource }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "hadPrimarySource")
    public JAXBElement<PrimarySource> createHadPrimarySource(PrimarySource value) {
        return new JAXBElement<PrimarySource>(_HadPrimarySource_QNAME, PrimarySource.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Collection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "collection")
    public JAXBElement<Collection> createCollection(Collection value) {
        return new JAXBElement<Collection>(_Collection_QNAME, Collection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WasDerivedFrom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "wasDerivedFrom")
    public JAXBElement<WasDerivedFrom> createWasDerivedFrom(WasDerivedFrom value) {
        return new JAXBElement<WasDerivedFrom>(_WasDerivedFrom_QNAME, WasDerivedFrom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Used }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "used")
    public JAXBElement<Used> createUsed(Used value) {
        return new JAXBElement<Used>(_Used_QNAME, Used.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "type")
    public JAXBElement<Type> createType(Type value) {
        return new JAXBElement<Type>(_Type_QNAME, Type.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WasInformedBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "wasInformedBy")
    public JAXBElement<WasInformedBy> createWasInformedBy(WasInformedBy value) {
        return new JAXBElement<WasInformedBy>(_WasInformedBy_QNAME, WasInformedBy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActedOnBehalfOf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "actedOnBehalfOf")
    public JAXBElement<ActedOnBehalfOf> createActedOnBehalfOf(ActedOnBehalfOf value) {
        return new JAXBElement<ActedOnBehalfOf>(_ActedOnBehalfOf_QNAME, ActedOnBehalfOf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyDictionary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "emptyDictionary")
    public JAXBElement<EmptyDictionary> createEmptyDictionary(EmptyDictionary value) {
        return new JAXBElement<EmptyDictionary>(_EmptyDictionary_QNAME, EmptyDictionary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WasAssociatedWith }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "wasAssociatedWith")
    public JAXBElement<WasAssociatedWith> createWasAssociatedWith(WasAssociatedWith value) {
        return new JAXBElement<WasAssociatedWith>(_WasAssociatedWith_QNAME, WasAssociatedWith.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SoftwareAgent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "softwareAgent")
    public JAXBElement<SoftwareAgent> createSoftwareAgent(SoftwareAgent value) {
        return new JAXBElement<SoftwareAgent>(_SoftwareAgent_QNAME, SoftwareAgent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Person }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "person")
    public JAXBElement<Person> createPerson(Person value) {
        return new JAXBElement<Person>(_Person_QNAME, Person.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Revision }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "wasRevisionOf")
    public JAXBElement<Revision> createWasRevisionOf(Revision value) {
        return new JAXBElement<Revision>(_WasRevisionOf_QNAME, Revision.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Location }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "location")
    public JAXBElement<Location> createLocation(Location value) {
        return new JAXBElement<Location>(_Location_QNAME, Location.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WasInfluencedBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "wasInfluencedBy")
    public JAXBElement<WasInfluencedBy> createWasInfluencedBy(WasInfluencedBy value) {
        return new JAXBElement<WasInfluencedBy>(_WasInfluencedBy_QNAME, WasInfluencedBy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "entity")
    public JAXBElement<Entity> createEntity(Entity value) {
        return new JAXBElement<Entity>(_Entity_QNAME, Entity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmptyCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "emptyCollection")
    public JAXBElement<EmptyCollection> createEmptyCollection(EmptyCollection value) {
        return new JAXBElement<EmptyCollection>(_EmptyCollection_QNAME, EmptyCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Role }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "role")
    public JAXBElement<Role> createRole(Role value) {
        return new JAXBElement<Role>(_Role_QNAME, Role.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Bundle }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "bundle")
    public JAXBElement<Bundle> createBundle(Bundle value) {
        return new JAXBElement<Bundle>(_Bundle_QNAME, Bundle.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Value }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "value")
    public JAXBElement<Value> createValue(Value value) {
        return new JAXBElement<Value>(_Value_QNAME, Value.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AlternateOf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "alternateOf")
    public JAXBElement<AlternateOf> createAlternateOf(AlternateOf value) {
        return new JAXBElement<AlternateOf>(_AlternateOf_QNAME, AlternateOf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Activity }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "activity")
    public JAXBElement<Activity> createActivity(Activity value) {
        return new JAXBElement<Activity>(_Activity_QNAME, Activity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DictionaryMembership }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "hadDictionaryMember")
    public JAXBElement<DictionaryMembership> createHadDictionaryMember(DictionaryMembership value) {
        return new JAXBElement<DictionaryMembership>(_HadDictionaryMember_QNAME, DictionaryMembership.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WasEndedBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "wasEndedBy")
    public JAXBElement<WasEndedBy> createWasEndedBy(WasEndedBy value) {
        return new JAXBElement<WasEndedBy>(_WasEndedBy_QNAME, WasEndedBy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Document }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "document")
    public JAXBElement<Document> createDocument(Document value) {
        return new JAXBElement<Document>(_Document_QNAME, Document.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Organization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "organization")
    public JAXBElement<Organization> createOrganization(Organization value) {
        return new JAXBElement<Organization>(_Organization_QNAME, Organization.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HadMember }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "hadMember")
    public JAXBElement<HadMember> createHadMember(HadMember value) {
        return new JAXBElement<HadMember>(_HadMember_QNAME, HadMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Dictionary }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "dictionary")
    public JAXBElement<Dictionary> createDictionary(Dictionary value) {
        return new JAXBElement<Dictionary>(_Dictionary_QNAME, Dictionary.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LangString }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "label")
    public JAXBElement<InternationalizedString> createLabel(InternationalizedString value) {
        return new JAXBElement<InternationalizedString>(_Label_QNAME, InternationalizedString.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Agent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "agent")
    public JAXBElement<Agent> createAgent(Agent value) {
        return new JAXBElement<Agent>(_Agent_QNAME, Agent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WasInvalidatedBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "wasInvalidatedBy")
    public JAXBElement<WasInvalidatedBy> createWasInvalidatedBy(WasInvalidatedBy value) {
        return new JAXBElement<WasInvalidatedBy>(_WasInvalidatedBy_QNAME, WasInvalidatedBy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MentionOf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "mentionOf")
    public JAXBElement<MentionOf> createMentionOf(MentionOf value) {
        return new JAXBElement<MentionOf>(_MentionOf_QNAME, MentionOf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Others }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "others")
    public JAXBElement<Others> createOthers(Others value) {
        return new JAXBElement<Others>(_Others_QNAME, Others.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WasAttributedTo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "wasAttributedTo")
    public JAXBElement<WasAttributedTo> createWasAttributedTo(WasAttributedTo value) {
        return new JAXBElement<WasAttributedTo>(_WasAttributedTo_QNAME, WasAttributedTo.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SpecializationOf }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "specializationOf")
    public JAXBElement<SpecializationOf> createSpecializationOf(SpecializationOf value) {
        return new JAXBElement<SpecializationOf>(_SpecializationOf_QNAME, SpecializationOf.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WasStartedBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "wasStartedBy")
    public JAXBElement<WasStartedBy> createWasStartedBy(WasStartedBy value) {
        return new JAXBElement<WasStartedBy>(_WasStartedBy_QNAME, WasStartedBy.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DerivedByRemovalFrom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "derivedByRemovalFrom")
    public JAXBElement<DerivedByRemovalFrom> createDerivedByRemovalFrom(DerivedByRemovalFrom value) {
        return new JAXBElement<DerivedByRemovalFrom>(_DerivedByRemovalFrom_QNAME, DerivedByRemovalFrom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DerivedByInsertionFrom }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "derivedByInsertionFrom")
    public JAXBElement<DerivedByInsertionFrom> createDerivedByInsertionFrom(DerivedByInsertionFrom value) {
        return new JAXBElement<DerivedByInsertionFrom>(_DerivedByInsertionFrom_QNAME, DerivedByInsertionFrom.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Quotation }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "wasQuotedFrom")
    public JAXBElement<Quotation> createWasQuotedFrom(Quotation value) {
        return new JAXBElement<Quotation>(_WasQuotedFrom_QNAME, Quotation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Entry }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "keyEntityPair")
    public JAXBElement<Entry> createKeyEntityPair(Entry value) {
        return new JAXBElement<Entry>(_KeyEntityPair_QNAME, Entry.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Plan }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "plan")
    public JAXBElement<Plan> createPlan(Plan value) {
        return new JAXBElement<Plan>(_Plan_QNAME, Plan.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WasGeneratedBy }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.w3.org/ns/prov#", name = "wasGeneratedBy")
    public JAXBElement<WasGeneratedBy> createWasGeneratedBy(WasGeneratedBy value) {
        return new JAXBElement<WasGeneratedBy>(_WasGeneratedBy_QNAME, WasGeneratedBy.class, null, value);
    }

}
