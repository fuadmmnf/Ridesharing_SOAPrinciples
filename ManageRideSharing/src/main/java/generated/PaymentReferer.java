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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentReferer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentReferer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="model_type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="model_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentReferer", propOrder = {
    "modelType",
    "modelId"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:16:15+06:00", comments = "JAXB RI v2.2.11")
public class PaymentReferer {

    @XmlElement(name = "model_type", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:16:15+06:00", comments = "JAXB RI v2.2.11")
    protected String modelType;
    @XmlElement(name = "model_id", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:16:15+06:00", comments = "JAXB RI v2.2.11")
    protected String modelId;

    /**
     * Gets the value of the modelType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:16:15+06:00", comments = "JAXB RI v2.2.11")
    public String getModelType() {
        return modelType;
    }

    /**
     * Sets the value of the modelType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:16:15+06:00", comments = "JAXB RI v2.2.11")
    public void setModelType(String value) {
        this.modelType = value;
    }

    /**
     * Gets the value of the modelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:16:15+06:00", comments = "JAXB RI v2.2.11")
    public String getModelId() {
        return modelId;
    }

    /**
     * Sets the value of the modelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:16:15+06:00", comments = "JAXB RI v2.2.11")
    public void setModelId(String value) {
        this.modelId = value;
    }

}
