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
 * <p>Java class for PlaceHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlaceHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.example.com/rideshare/gen}PlaceIdentifier"/&gt;
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlaceHeader", propOrder = {
    "id",
    "name"
})
@Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T09:13:10+06:00", comments = "JAXB RI v2.2.11")
public class PlaceHeader {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T09:13:10+06:00", comments = "JAXB RI v2.2.11")
    protected PlaceIdentifier id;
    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T09:13:10+06:00", comments = "JAXB RI v2.2.11")
    protected String name;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link PlaceIdentifier }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T09:13:10+06:00", comments = "JAXB RI v2.2.11")
    public PlaceIdentifier getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link PlaceIdentifier }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T09:13:10+06:00", comments = "JAXB RI v2.2.11")
    public void setId(PlaceIdentifier value) {
        this.id = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T09:13:10+06:00", comments = "JAXB RI v2.2.11")
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T09:13:10+06:00", comments = "JAXB RI v2.2.11")
    public void setName(String value) {
        this.name = value;
    }

}
