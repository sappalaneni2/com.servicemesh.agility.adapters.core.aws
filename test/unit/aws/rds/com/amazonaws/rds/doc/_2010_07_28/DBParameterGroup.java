//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.01 at 08:18:37 AM CDT 
//


package com.amazonaws.rds.doc._2010_07_28;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 <p>
 *         
 *                 </p>
 *             
 * 
 * <p>Java class for DBParameterGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DBParameterGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DBParameterGroupName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DBParameterGroupFamily" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DBParameterGroup", propOrder = {
    "dbParameterGroupName",
    "dbParameterGroupFamily",
    "description"
})
public class DBParameterGroup {

    @XmlElement(name = "DBParameterGroupName")
    protected String dbParameterGroupName;
    @XmlElement(name = "DBParameterGroupFamily")
    protected String dbParameterGroupFamily;
    @XmlElement(name = "Description")
    protected String description;

    /**
     * Gets the value of the dbParameterGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBParameterGroupName() {
        return dbParameterGroupName;
    }

    /**
     * Sets the value of the dbParameterGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBParameterGroupName(String value) {
        this.dbParameterGroupName = value;
    }

    /**
     * Gets the value of the dbParameterGroupFamily property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBParameterGroupFamily() {
        return dbParameterGroupFamily;
    }

    /**
     * Sets the value of the dbParameterGroupFamily property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBParameterGroupFamily(String value) {
        this.dbParameterGroupFamily = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}