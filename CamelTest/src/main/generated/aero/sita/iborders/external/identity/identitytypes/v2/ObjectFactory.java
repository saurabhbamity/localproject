
package aero.sita.iborders.external.identity.identitytypes.v2;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the aero.sita.iborders.external.identity.identitytypes.v2 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: aero.sita.iborders.external.identity.identitytypes.v2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ReferenceDataType }
     * 
     */
    public ReferenceDataType createReferenceDataType() {
        return new ReferenceDataType();
    }

    /**
     * Create an instance of {@link TravelDocumentType }
     * 
     */
    public TravelDocumentType createTravelDocumentType() {
        return new TravelDocumentType();
    }

    /**
     * Create an instance of {@link IdentityType }
     * 
     */
    public IdentityType createIdentityType() {
        return new IdentityType();
    }

}
