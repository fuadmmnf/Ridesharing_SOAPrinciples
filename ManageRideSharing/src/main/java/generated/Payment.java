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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Payment complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Payment"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="header" type="{http://www.example.com/rideshare/gen}PaymentHeader"/&gt;
 *         &lt;element name="status" type="{http://www.example.com/rideshare/gen}PaymentStatus"/&gt;
 *         &lt;element name="model" type="{http://www.example.com/rideshare/gen}PaymentReferer"/&gt;
 *         &lt;element name="trx_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="store_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Payment", propOrder = {
    "header",
    "status",
    "model",
    "trxId",
    "storeId"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:56:08+06:00", comments = "JAXB RI v2.2.11")
public class Payment {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:56:08+06:00", comments = "JAXB RI v2.2.11")
    protected PaymentHeader header;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:56:08+06:00", comments = "JAXB RI v2.2.11")
    protected PaymentStatus status;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:56:08+06:00", comments = "JAXB RI v2.2.11")
    protected PaymentReferer model;
    @XmlElement(name = "trx_id", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:56:08+06:00", comments = "JAXB RI v2.2.11")
    protected String trxId;
    @XmlElement(name = "store_id", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:56:08+06:00", comments = "JAXB RI v2.2.11")
    protected String storeId;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentHeader }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:56:08+06:00", comments = "JAXB RI v2.2.11")
    public PaymentHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentHeader }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:56:08+06:00", comments = "JAXB RI v2.2.11")
    public void setHeader(PaymentHeader value) {
        this.header = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:56:08+06:00", comments = "JAXB RI v2.2.11")
    public PaymentStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatus }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:56:08+06:00", comments = "JAXB RI v2.2.11")
    public void setStatus(PaymentStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the model property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentReferer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:56:08+06:00", comments = "JAXB RI v2.2.11")
    public PaymentReferer getModel() {
        return model;
    }

    /**
     * Sets the value of the model property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentReferer }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:56:08+06:00", comments = "JAXB RI v2.2.11")
    public void setModel(PaymentReferer value) {
        this.model = value;
    }

    /**
     * Gets the value of the trxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:56:08+06:00", comments = "JAXB RI v2.2.11")
    public String getTrxId() {
        return trxId;
    }

    /**
     * Sets the value of the trxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:56:08+06:00", comments = "JAXB RI v2.2.11")
    public void setTrxId(String value) {
        this.trxId = value;
    }

    /**
     * Gets the value of the storeId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:56:08+06:00", comments = "JAXB RI v2.2.11")
    public String getStoreId() {
        return storeId;
    }

    /**
     * Sets the value of the storeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T02:56:08+06:00", comments = "JAXB RI v2.2.11")
    public void setStoreId(String value) {
        this.storeId = value;
    }

}
