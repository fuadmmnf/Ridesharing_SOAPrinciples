//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.30 at 02:56:08 PM BDT 
//


package generated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TripIdentifier" type="{http://www.example.com/rideshare/gen}TripIdentifier"/&gt;
 *         &lt;element name="Feedback" type="{http://www.example.com/rideshare/gen}Feedback"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tripIdentifier",
    "feedback"
})
@XmlRootElement(name = "StoreFeedbackRequest", namespace = "")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:56:08+06:00", comments = "JAXB RI v2.2.11")
public class StoreFeedbackRequest {

    @XmlElement(name = "TripIdentifier", namespace = "", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:56:08+06:00", comments = "JAXB RI v2.2.11")
    protected TripIdentifier tripIdentifier;
    @XmlElement(name = "Feedback", namespace = "", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:56:08+06:00", comments = "JAXB RI v2.2.11")
    protected Feedback feedback;

    /**
     * Gets the value of the tripIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link TripIdentifier }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:56:08+06:00", comments = "JAXB RI v2.2.11")
    public TripIdentifier getTripIdentifier() {
        return tripIdentifier;
    }

    /**
     * Sets the value of the tripIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripIdentifier }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:56:08+06:00", comments = "JAXB RI v2.2.11")
    public void setTripIdentifier(TripIdentifier value) {
        this.tripIdentifier = value;
    }

    /**
     * Gets the value of the feedback property.
     * 
     * @return
     *     possible object is
     *     {@link Feedback }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:56:08+06:00", comments = "JAXB RI v2.2.11")
    public Feedback getFeedback() {
        return feedback;
    }

    /**
     * Sets the value of the feedback property.
     * 
     * @param value
     *     allowed object is
     *     {@link Feedback }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:56:08+06:00", comments = "JAXB RI v2.2.11")
    public void setFeedback(Feedback value) {
        this.feedback = value;
    }

}
