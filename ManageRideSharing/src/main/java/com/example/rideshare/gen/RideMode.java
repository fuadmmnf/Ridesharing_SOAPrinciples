//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.30 at 04:38:34 AM BDT 
//


package com.example.rideshare.gen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RideMode complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RideMode"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
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
@XmlType(name = "RideMode", propOrder = {
    "medium",
    "fare"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T04:38:34+06:00", comments = "JAXB RI v2.2.11")
public class RideMode {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T04:38:34+06:00", comments = "JAXB RI v2.2.11")
    protected String medium;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T04:38:34+06:00", comments = "JAXB RI v2.2.11")
    protected double fare;

    /**
     * Gets the value of the medium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T04:38:34+06:00", comments = "JAXB RI v2.2.11")
    public String getMedium() {
        return medium;
    }

    /**
     * Sets the value of the medium property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T04:38:34+06:00", comments = "JAXB RI v2.2.11")
    public void setMedium(String value) {
        this.medium = value;
    }

    /**
     * Gets the value of the fare property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T04:38:34+06:00", comments = "JAXB RI v2.2.11")
    public double getFare() {
        return fare;
    }

    /**
     * Sets the value of the fare property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-30T04:38:34+06:00", comments = "JAXB RI v2.2.11")
    public void setFare(double value) {
        this.fare = value;
    }

}
