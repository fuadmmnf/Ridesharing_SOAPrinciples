//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.03.28 at 09:41:03 AM BDT 
//


package com.example.rideshare.gen;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PaymentStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="INIT"/&gt;
 *     &lt;enumeration value="PROCESSING"/&gt;
 *     &lt;enumeration value="SUCCESS"/&gt;
 *     &lt;enumeration value="FAILED"/&gt;
 *     &lt;enumeration value="CANCELED"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PaymentStatus")
@XmlEnum
@Generated(value = "com.sun.tools.xjc.Driver", date = "2022-03-28T09:41:03+06:00", comments = "JAXB RI v2.2.11")
public enum PaymentStatus {

    INIT,
    PROCESSING,
    SUCCESS,
    FAILED,
    CANCELED;

    public String value() {
        return name();
    }

    public static PaymentStatus fromValue(String v) {
        return valueOf(v);
    }

}
