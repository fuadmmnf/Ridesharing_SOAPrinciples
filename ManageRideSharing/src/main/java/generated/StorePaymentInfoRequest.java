//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.29 at 08:23:47 PM BDT 
//


package generated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.example.rideshare.gen.PaymentHeader;


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
 *         &lt;element name="PaymentHeader" type="{http://www.example.com/rideshare/gen}PaymentHeader"/&gt;
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
    "paymentHeader"
})
@XmlRootElement(name = "StorePaymentInfoRequest")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T08:23:47+06:00", comments = "JAXB RI v2.2.11")
public class StorePaymentInfoRequest {

    @XmlElement(name = "PaymentHeader", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T08:23:47+06:00", comments = "JAXB RI v2.2.11")
    protected PaymentHeader paymentHeader;

    /**
     * Gets the value of the paymentHeader property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentHeader }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T08:23:47+06:00", comments = "JAXB RI v2.2.11")
    public PaymentHeader getPaymentHeader() {
        return paymentHeader;
    }

    /**
     * Sets the value of the paymentHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentHeader }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T08:23:47+06:00", comments = "JAXB RI v2.2.11")
    public void setPaymentHeader(PaymentHeader value) {
        this.paymentHeader = value;
    }

}
