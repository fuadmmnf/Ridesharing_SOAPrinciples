//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.29 at 06:56:59 PM BDT 
//


package generated;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the generated package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: generated
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegisterCustomerRequest }
     * 
     */
    public RegisterCustomerRequest createRegisterCustomerRequest() {
        return new RegisterCustomerRequest();
    }

    /**
     * Create an instance of {@link UpdateProfileRequest }
     * 
     */
    public UpdateProfileRequest createUpdateProfileRequest() {
        return new UpdateProfileRequest();
    }

    /**
     * Create an instance of {@link BanCustomerRequest }
     * 
     */
    public BanCustomerRequest createBanCustomerRequest() {
        return new BanCustomerRequest();
    }

    /**
     * Create an instance of {@link GetDetailsRequest }
     * 
     */
    public GetDetailsRequest createGetDetailsRequest() {
        return new GetDetailsRequest();
    }

    /**
     * Create an instance of {@link GetPaymentMediumRequest }
     * 
     */
    public GetPaymentMediumRequest createGetPaymentMediumRequest() {
        return new GetPaymentMediumRequest();
    }

    /**
     * Create an instance of {@link StorePaymentInfoRequest }
     * 
     */
    public StorePaymentInfoRequest createStorePaymentInfoRequest() {
        return new StorePaymentInfoRequest();
    }

}
