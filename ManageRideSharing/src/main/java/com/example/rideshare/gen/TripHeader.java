//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.29 at 09:03:52 PM BDT 
//


package com.example.rideshare.gen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TripHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TripHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TripIdentifier" type="{http://www.example.com/rideshare/gen}TripIdentifier"/&gt;
 *         &lt;element name="status" type="{http://www.example.com/rideshare/gen}Status"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TripHeader", propOrder = {
    "tripIdentifier",
    "status"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T09:03:52+06:00", comments = "JAXB RI v2.2.11")
public class TripHeader {

    @XmlElement(name = "TripIdentifier", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T09:03:52+06:00", comments = "JAXB RI v2.2.11")
    protected TripIdentifier tripIdentifier;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T09:03:52+06:00", comments = "JAXB RI v2.2.11")
    protected Status status;

    /**
     * Gets the value of the tripIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link TripIdentifier }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T09:03:52+06:00", comments = "JAXB RI v2.2.11")
    public TripIdentifier getTripIdentifier() {
        return tripIdentifier;
    }

    /**
     * Sets the value of the tripIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripIdentifier }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T09:03:52+06:00", comments = "JAXB RI v2.2.11")
    public void setTripIdentifier(TripIdentifier value) {
        this.tripIdentifier = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link Status }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T09:03:52+06:00", comments = "JAXB RI v2.2.11")
    public Status getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link Status }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T09:03:52+06:00", comments = "JAXB RI v2.2.11")
    public void setStatus(Status value) {
        this.status = value;
    }

}
