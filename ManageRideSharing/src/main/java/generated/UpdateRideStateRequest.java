//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.28 at 01:38:19 PM BDT 
//


package generated;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.example.rideshare.gen.TripHeader;


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
 *         &lt;element name="TripHeader" type="{http://www.example.com/rideshare/gen}TripHeader"/&gt;
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
    "tripHeader"
})
@XmlRootElement(name = "UpdateRideStateRequest")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T01:38:19+06:00", comments = "JAXB RI v2.2.11")
public class UpdateRideStateRequest {

    @XmlElement(name = "TripHeader", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T01:38:19+06:00", comments = "JAXB RI v2.2.11")
    protected TripHeader tripHeader;

    /**
     * Gets the value of the tripHeader property.
     * 
     * @return
     *     possible object is
     *     {@link TripHeader }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T01:38:19+06:00", comments = "JAXB RI v2.2.11")
    public TripHeader getTripHeader() {
        return tripHeader;
    }

    /**
     * Sets the value of the tripHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripHeader }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T01:38:19+06:00", comments = "JAXB RI v2.2.11")
    public void setTripHeader(TripHeader value) {
        this.tripHeader = value;
    }

}
