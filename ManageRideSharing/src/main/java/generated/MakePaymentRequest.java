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
 *         &lt;element name="Payment" type="{http://www.example.com/rideshare/gen}Payment"/&gt;
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
    "payment"
})
@XmlRootElement(name = "MakePaymentRequest", namespace = "")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:56:08+06:00", comments = "JAXB RI v2.2.11")
public class MakePaymentRequest {

    @XmlElement(name = "TripIdentifier", namespace = "", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:56:08+06:00", comments = "JAXB RI v2.2.11")
    protected TripIdentifier tripIdentifier;
    @XmlElement(name = "Payment", namespace = "", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:56:08+06:00", comments = "JAXB RI v2.2.11")
    protected Payment payment;

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
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link Payment }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:56:08+06:00", comments = "JAXB RI v2.2.11")
    public Payment getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payment }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:56:08+06:00", comments = "JAXB RI v2.2.11")
    public void setPayment(Payment value) {
        this.payment = value;
    }

}
