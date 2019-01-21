//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.06 at 02:49:01 PM IST 
//


package io.mosip.registration.dto.cbeff.jaxbclasses;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the genclasses package. 
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

    private final static QName _BIR_QNAME = new QName("http://docs.oasis-open.org/bias/ns/biaspatronformat-1.0/", "BIR");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: genclasses
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BIRType }
     * 
     */
    public BIRType createBIRType() {
        return new BIRType();
    }

    /**
     * Create an instance of {@link VersionType }
     * 
     */
    public VersionType createVersionType() {
        return new VersionType();
    }

    /**
     * Create an instance of {@link BDBInfoType }
     * 
     */
    public BDBInfoType createBDBInfoType() {
        return new BDBInfoType();
    }

    /**
     * Create an instance of {@link BIRInfoType }
     * 
     */
    public BIRInfoType createBIRInfoType() {
        return new BIRInfoType();
    }

    /**
     * Create an instance of {@link SBInfoType }
     * 
     */
    public SBInfoType createSBInfoType() {
        return new SBInfoType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BIRType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://docs.oasis-open.org/bias/ns/biaspatronformat-1.0/", name = "BIR")
    public JAXBElement<BIRType> createBIR(BIRType value) {
        return new JAXBElement<BIRType>(_BIR_QNAME, BIRType.class, null, value);
    }

}
