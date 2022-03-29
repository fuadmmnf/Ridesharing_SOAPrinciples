//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.28 at 09:13:10 PM BDT 
//


package com.example.rideshare.gen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RideSharingTrip complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RideSharingTrip"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="trip" type="{http://www.example.com/rideshare/gen}TripIdentifier"/&gt;
 *         &lt;element name="customer" type="{http://www.example.com/rideshare/gen}CustomerIdentifier"/&gt;
 *         &lt;element name="driver" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="payment" type="{http://www.example.com/rideshare/gen}PaymentIdentifier"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RideSharingTrip", propOrder = {
    "trip",
    "customer",
    "driver",
    "payment"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T09:13:10+06:00", comments = "JAXB RI v2.2.11")
public class RideSharingTrip {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T09:13:10+06:00", comments = "JAXB RI v2.2.11")
    protected TripIdentifier trip;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T09:13:10+06:00", comments = "JAXB RI v2.2.11")
    protected CustomerIdentifier customer;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T09:13:10+06:00", comments = "JAXB RI v2.2.11")
    protected String driver;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T09:13:10+06:00", comments = "JAXB RI v2.2.11")
    protected PaymentIdentifier payment;

    /**
     * Gets the value of the trip property.
     * 
     * @return
     *     possible object is
     *     {@link TripIdentifier }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T09:13:10+06:00", comments = "JAXB RI v2.2.11")
    public TripIdentifier getTrip() {
        return trip;
    }

    /**
     * Sets the value of the trip property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripIdentifier }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T09:13:10+06:00", comments = "JAXB RI v2.2.11")
    public void setTrip(TripIdentifier value) {
        this.trip = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIdentifier }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T09:13:10+06:00", comments = "JAXB RI v2.2.11")
    public CustomerIdentifier getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIdentifier }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T09:13:10+06:00", comments = "JAXB RI v2.2.11")
    public void setCustomer(CustomerIdentifier value) {
        this.customer = value;
    }

    /**
     * Gets the value of the driver property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T09:13:10+06:00", comments = "JAXB RI v2.2.11")
    public String getDriver() {
        return driver;
    }

    /**
     * Sets the value of the driver property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T09:13:10+06:00", comments = "JAXB RI v2.2.11")
    public void setDriver(String value) {
        this.driver = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentIdentifier }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T09:13:10+06:00", comments = "JAXB RI v2.2.11")
    public PaymentIdentifier getPayment() {
        return payment;
    }

    /**
     * Sets the value of the payment property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentIdentifier }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T09:13:10+06:00", comments = "JAXB RI v2.2.11")
    public void setPayment(PaymentIdentifier value) {
        this.payment = value;
    }

}