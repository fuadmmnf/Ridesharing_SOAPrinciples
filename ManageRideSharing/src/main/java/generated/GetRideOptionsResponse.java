//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.29 at 09:28:18 PM BDT 
//


package generated;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.example.rideshare.gen.RideMode;


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
 *         &lt;element name="RideMode" type="{http://www.example.com/rideshare/gen}RideMode" maxOccurs="unbounded"/&gt;
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
    "rideMode"
})
@XmlRootElement(name = "GetRideOptionsResponse")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T09:28:18+06:00", comments = "JAXB RI v2.2.11")
public class GetRideOptionsResponse {

    @XmlElement(name = "RideMode", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T09:28:18+06:00", comments = "JAXB RI v2.2.11")
    protected List<RideMode> rideMode;

    /**
     * Gets the value of the rideMode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rideMode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRideMode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RideMode }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T09:28:18+06:00", comments = "JAXB RI v2.2.11")
    public List<RideMode> getRideMode() {
        if (rideMode == null) {
            rideMode = new ArrayList<RideMode>();
        }
        return this.rideMode;
    }

}
