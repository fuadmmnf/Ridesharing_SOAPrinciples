//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.30 at 02:16:15 PM BDT 
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
 *         &lt;element name="customer" type="{http://www.example.com/rideshare/gen}Customer"/&gt;
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
    "customer"
})
@XmlRootElement(name = "CustomerDocument")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:16:15+06:00", comments = "JAXB RI v2.2.11")
public class CustomerDocument {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:16:15+06:00", comments = "JAXB RI v2.2.11")
    protected Customer customer;

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link Customer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:16:15+06:00", comments = "JAXB RI v2.2.11")
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Customer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:16:15+06:00", comments = "JAXB RI v2.2.11")
    public void setCustomer(Customer value) {
        this.customer = value;
    }

}
