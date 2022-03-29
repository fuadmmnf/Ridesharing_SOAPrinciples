//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.29 at 09:28:18 PM BDT 
//


package com.example.rideshare.gen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Trip complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Trip"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="header" type="{http://www.example.com/rideshare/gen}TripHeader"/&gt;
 *         &lt;element name="RouteHeader" type="{http://www.example.com/rideshare/gen}RouteHeader"/&gt;
 *         &lt;element name="fare" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="estTime" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="medium" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="feedback" type="{http://www.example.com/rideshare/gen}Feedback"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Trip", propOrder = {
    "header",
    "routeHeader",
    "fare",
    "estTime",
    "medium",
    "feedback"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T09:28:18+06:00", comments = "JAXB RI v2.2.11")
public class Trip {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T09:28:18+06:00", comments = "JAXB RI v2.2.11")
    protected TripHeader header;
    @XmlElement(name = "RouteHeader", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T09:28:18+06:00", comments = "JAXB RI v2.2.11")
    protected RouteHeader routeHeader;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T09:28:18+06:00", comments = "JAXB RI v2.2.11")
    protected double fare;
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T09:28:18+06:00", comments = "JAXB RI v2.2.11")
    protected double estTime;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T09:28:18+06:00", comments = "JAXB RI v2.2.11")
    protected String medium;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T09:28:18+06:00", comments = "JAXB RI v2.2.11")
    protected Feedback feedback;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link TripHeader }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T09:28:18+06:00", comments = "JAXB RI v2.2.11")
    public TripHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link TripHeader }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T09:28:18+06:00", comments = "JAXB RI v2.2.11")
    public void setHeader(TripHeader value) {
        this.header = value;
    }

    /**
     * Gets the value of the routeHeader property.
     * 
     * @return
     *     possible object is
     *     {@link RouteHeader }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T09:28:18+06:00", comments = "JAXB RI v2.2.11")
    public RouteHeader getRouteHeader() {
        return routeHeader;
    }

    /**
     * Sets the value of the routeHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteHeader }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T09:28:18+06:00", comments = "JAXB RI v2.2.11")
    public void setRouteHeader(RouteHeader value) {
        this.routeHeader = value;
    }

    /**
     * Gets the value of the fare property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T09:28:18+06:00", comments = "JAXB RI v2.2.11")
    public double getFare() {
        return fare;
    }

    /**
     * Sets the value of the fare property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T09:28:18+06:00", comments = "JAXB RI v2.2.11")
    public void setFare(double value) {
        this.fare = value;
    }

    /**
     * Gets the value of the estTime property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T09:28:18+06:00", comments = "JAXB RI v2.2.11")
    public double getEstTime() {
        return estTime;
    }

    /**
     * Sets the value of the estTime property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T09:28:18+06:00", comments = "JAXB RI v2.2.11")
    public void setEstTime(double value) {
        this.estTime = value;
    }

    /**
     * Gets the value of the medium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T09:28:18+06:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T09:28:18+06:00", comments = "JAXB RI v2.2.11")
    public void setMedium(String value) {
        this.medium = value;
    }

    /**
     * Gets the value of the feedback property.
     * 
     * @return
     *     possible object is
     *     {@link Feedback }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T09:28:18+06:00", comments = "JAXB RI v2.2.11")
    public Feedback getFeedback() {
        return feedback;
    }

    /**
     * Sets the value of the feedback property.
     * 
     * @param value
     *     allowed object is
     *     {@link Feedback }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T09:28:18+06:00", comments = "JAXB RI v2.2.11")
    public void setFeedback(Feedback value) {
        this.feedback = value;
    }

}
