//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.28 at 07:40:29 PM BDT 
//


package generated;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *       &lt;sequence maxOccurs="unbounded"&gt;
 *         &lt;element name="medium" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="fare" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
    "mediumAndFare"
})
@XmlRootElement(name = "GetRideOptionsResponse")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T07:40:29+06:00", comments = "JAXB RI v2.2.11")
public class GetRideOptionsResponse {

    @XmlElements({
        @XmlElement(name = "medium", required = true, type = String.class),
        @XmlElement(name = "fare", required = true, type = Double.class)
    })
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T07:40:29+06:00", comments = "JAXB RI v2.2.11")
    protected List<Serializable> mediumAndFare;

    /**
     * Gets the value of the mediumAndFare property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the mediumAndFare property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMediumAndFare().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * {@link Double }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T07:40:29+06:00", comments = "JAXB RI v2.2.11")
    public List<Serializable> getMediumAndFare() {
        if (mediumAndFare == null) {
            mediumAndFare = new ArrayList<Serializable>();
        }
        return this.mediumAndFare;
    }

}
