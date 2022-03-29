//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.29 at 06:12:59 PM BDT 
//


package com.example.rideshare.gen;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Route complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Route"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="header" type="{http://www.example.com/rideshare/gen}RouteHeader"/&gt;
 *         &lt;element name="medium" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="estimated_time" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="point" type="{http://www.example.com/rideshare/gen}PlaceIdentifier" maxOccurs="unbounded"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Route", propOrder = {
    "header",
    "medium",
    "estimatedTime",
    "point"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T06:12:59+06:00", comments = "JAXB RI v2.2.11")
public class Route {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T06:12:59+06:00", comments = "JAXB RI v2.2.11")
    protected RouteHeader header;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T06:12:59+06:00", comments = "JAXB RI v2.2.11")
    protected String medium;
    @XmlElement(name = "estimated_time")
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T06:12:59+06:00", comments = "JAXB RI v2.2.11")
    protected double estimatedTime;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T06:12:59+06:00", comments = "JAXB RI v2.2.11")
    protected List<PlaceIdentifier> point;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link RouteHeader }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T06:12:59+06:00", comments = "JAXB RI v2.2.11")
    public RouteHeader getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteHeader }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T06:12:59+06:00", comments = "JAXB RI v2.2.11")
    public void setHeader(RouteHeader value) {
        this.header = value;
    }

    /**
     * Gets the value of the medium property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T06:12:59+06:00", comments = "JAXB RI v2.2.11")
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
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T06:12:59+06:00", comments = "JAXB RI v2.2.11")
    public void setMedium(String value) {
        this.medium = value;
    }

    /**
     * Gets the value of the estimatedTime property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T06:12:59+06:00", comments = "JAXB RI v2.2.11")
    public double getEstimatedTime() {
        return estimatedTime;
    }

    /**
     * Sets the value of the estimatedTime property.
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T06:12:59+06:00", comments = "JAXB RI v2.2.11")
    public void setEstimatedTime(double value) {
        this.estimatedTime = value;
    }

    /**
     * Gets the value of the point property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the point property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlaceIdentifier }
     * 
     * 
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T06:12:59+06:00", comments = "JAXB RI v2.2.11")
    public List<PlaceIdentifier> getPoint() {
        if (point == null) {
            point = new ArrayList<PlaceIdentifier>();
        }
        return this.point;
    }

}
