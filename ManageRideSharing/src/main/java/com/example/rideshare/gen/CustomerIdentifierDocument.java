//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.29 at 08:23:47 PM BDT 
//


package com.example.rideshare.gen;

import javax.annotation.Generated;
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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.example.com/rideshare/gen}CustomerIdentifier"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id"
})
@XmlRootElement(name = "CustomerIdentifierDocument")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T08:23:47+06:00", comments = "JAXB RI v2.2.11")
public class CustomerIdentifierDocument {

    @XmlElement(required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T08:23:47+06:00", comments = "JAXB RI v2.2.11")
    protected CustomerIdentifier id;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link CustomerIdentifier }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T08:23:47+06:00", comments = "JAXB RI v2.2.11")
    public CustomerIdentifier getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerIdentifier }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T08:23:47+06:00", comments = "JAXB RI v2.2.11")
    public void setId(CustomerIdentifier value) {
        this.id = value;
    }

}
