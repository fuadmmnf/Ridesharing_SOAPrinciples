//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.27 at 04:46:21 PM BDT 
//


package com.example.rideshare.gen;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tripheader" type="{http://www.example.com/rideshare/gen}TripHeader"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tripheader"
})
@XmlRootElement(name = "TripHeaderDocument")
public class TripHeaderDocument {

    @XmlElement(required = true)
    protected TripHeader tripheader;

    /**
     * Gets the value of the tripheader property.
     * 
     * @return
     *     possible object is
     *     {@link TripHeader }
     *     
     */
    public TripHeader getTripheader() {
        return tripheader;
    }

    /**
     * Sets the value of the tripheader property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripHeader }
     *     
     */
    public void setTripheader(TripHeader value) {
        this.tripheader = value;
    }

}
