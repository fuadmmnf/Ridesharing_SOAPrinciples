//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.30 at 01:04:09 PM BDT 
//


package generated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.example.rideshare.gen.DateRange;


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
 *         &lt;element name="DateRange" type="{http://www.example.com/rideshare/gen}DateRange"/&gt;
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
    "dateRange"
})
@XmlRootElement(name = "GetTransactionsRequest")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T01:04:09+06:00", comments = "JAXB RI v2.2.11")
public class GetTransactionsRequest {

    @XmlElement(name = "DateRange", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T01:04:09+06:00", comments = "JAXB RI v2.2.11")
    protected DateRange dateRange;

    /**
     * Gets the value of the dateRange property.
     * 
     * @return
     *     possible object is
     *     {@link DateRange }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T01:04:09+06:00", comments = "JAXB RI v2.2.11")
    public DateRange getDateRange() {
        return dateRange;
    }

    /**
     * Sets the value of the dateRange property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRange }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T01:04:09+06:00", comments = "JAXB RI v2.2.11")
    public void setDateRange(DateRange value) {
        this.dateRange = value;
    }

}
