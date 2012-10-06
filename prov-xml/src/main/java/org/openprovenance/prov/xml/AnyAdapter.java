//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-792 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.12.05 at 11:52:42 PM GMT 
//


package org.openprovenance.prov.xml;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.namespace.QName;

public class AnyAdapter
    extends XmlAdapter<Object,Attribute>
{

    ProvFactory pFactory=new ProvFactory();

    public Attribute unmarshal(Object value) {
        System.out.println("AnyAdapter2 unmarshalling for " + value);
        System.out.println("AnyAdapter2 unmarshalling for " + value.getClass());
        if (value instanceof org.w3c.dom.Element) {
            org.w3c.dom.Element el=(org.w3c.dom.Element)value;
            String prefix=el.getPrefix();
            String namespace=el.getNamespaceURI();
            String local=el.getLocalName();
            String child=el.getTextContent();
            return pFactory.newAttribute(namespace,local,prefix, child);
        } 
        if (value instanceof JAXBElement) {
            JAXBElement<?> je=(JAXBElement<?>) value;
            return pFactory.newAttribute(je.getName(),je.getValue());
        }
        return null;
    }

    public Object marshal(Attribute value) {
        System.out.println("AnyAdapter2 marshalling for " + value);
        System.out.println("AnyAdapter2 marshalling for " + value
                        .getClass());
        //TODO: this call creates a DOM but does not encode the type as xsi:type
	return pFactory.newElement(value.getElementName(), value.getValue().toString());
        //JAXBElement<?> je=new JAXBElement(value.getElementName(),value.getValue().getClass(),value.getValue());
        //return je;
    }

   

}
