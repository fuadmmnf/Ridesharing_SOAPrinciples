//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.28 at 07:40:29 PM BDT 
//


package com.example.rideshare.gen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PlaceIdentifier complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlaceIdentifier"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="latitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="longitude" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceIdentifier", propOrder = {
    "latitude",
    "longitude"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T07:40:29+06:00", comments = "JAXB RI v2.2.11")
public class PlaceIdentifier {

    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T07:40:29+06:00", comments = "JAXB RI v2.2.11")
    protected double latitude;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T07:40:29+06:00", comments = "JAXB RI v2.2.11")
    protected double longitude;

    /**
     * Gets the value of the latitude property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T07:40:29+06:00", comments = "JAXB RI v2.2.11")
    public double getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T07:40:29+06:00", comments = "JAXB RI v2.2.11")
    public void setLatitude(double value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the longitude property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T07:40:29+06:00", comments = "JAXB RI v2.2.11")
    public double getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T07:40:29+06:00", comments = "JAXB RI v2.2.11")
    public void setLongitude(double value) {
        this.longitude = value;
    }

}
