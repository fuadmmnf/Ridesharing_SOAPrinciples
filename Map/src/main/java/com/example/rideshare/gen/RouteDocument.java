//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.29 at 08:11:58 PM BDT 
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
 *         &lt;element name="Route" type="{http://www.example.com/rideshare/gen}Route"/&gt;
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
    "route"
})
@XmlRootElement(name = "RouteDocument")
@Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T08:11:58+06:00", comments = "JAXB RI v2.2.11")
public class RouteDocument {

    @XmlElement(name = "Route", required = true)
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T08:11:58+06:00", comments = "JAXB RI v2.2.11")
    protected Route route;

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link Route }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T08:11:58+06:00", comments = "JAXB RI v2.2.11")
    public Route getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link Route }
     *     
     */
    @Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-29T08:11:58+06:00", comments = "JAXB RI v2.2.11")
    public void setRoute(Route value) {
        this.route = value;
    }

}
