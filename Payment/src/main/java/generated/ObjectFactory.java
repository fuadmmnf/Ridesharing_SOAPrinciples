//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.28 at 09:41:03 AM BDT 
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
     * Create an instance of {@link InitiatePaymentRequest }
     * 
     */
    public InitiatePaymentRequest createInitiatePaymentRequest() {
        return new InitiatePaymentRequest();
    }

    /**
     * Create an instance of {@link HandlePaymentSuccessRequest }
     * 
     */
    public HandlePaymentSuccessRequest createHandlePaymentSuccessRequest() {
        return new HandlePaymentSuccessRequest();
    }

    /**
     * Create an instance of {@link HandlePaymentFailureRequest }
     * 
     */
    public HandlePaymentFailureRequest createHandlePaymentFailureRequest() {
        return new HandlePaymentFailureRequest();
    }

    /**
     * Create an instance of {@link GetTransactionsRequest }
     * 
     */
    public GetTransactionsRequest createGetTransactionsRequest() {
        return new GetTransactionsRequest();
    }

    /**
     * Create an instance of {@link GetTransactionsResponse }
     * 
     */
    public GetTransactionsResponse createGetTransactionsResponse() {
        return new GetTransactionsResponse();
    }

}
