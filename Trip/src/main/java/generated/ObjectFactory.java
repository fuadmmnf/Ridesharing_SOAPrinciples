//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.28 at 07:40:45 PM BDT 
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
     * Create an instance of {@link CreateTripRequest }
     * 
     */
    public CreateTripRequest createCreateTripRequest() {
        return new CreateTripRequest();
    }

    /**
     * Create an instance of {@link UpdateTripRequest }
     * 
     */
    public UpdateTripRequest createUpdateTripRequest() {
        return new UpdateTripRequest();
    }

    /**
     * Create an instance of {@link UpdateTripStateRequest }
     * 
     */
    public UpdateTripStateRequest createUpdateTripStateRequest() {
        return new UpdateTripStateRequest();
    }

    /**
     * Create an instance of {@link AdjustTripMetricsRequest }
     * 
     */
    public AdjustTripMetricsRequest createAdjustTripMetricsRequest() {
        return new AdjustTripMetricsRequest();
    }

    /**
     * Create an instance of {@link GetTripSummaryRequest }
     * 
     */
    public GetTripSummaryRequest createGetTripSummaryRequest() {
        return new GetTripSummaryRequest();
    }

}
