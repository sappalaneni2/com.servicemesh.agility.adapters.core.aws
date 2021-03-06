//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.17 at 01:23:02 PM CST 
//


package com.amazonaws.rds.doc._2010_07_28;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 <p>
 *                 This data type is used as a response element in the <a>ModifyDBInstance</a> action.
 *                 </p>
 *             
 * 
 * <p>Java class for PendingModifiedValues complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PendingModifiedValues">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DBInstanceClass" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AllocatedStorage" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MasterUserPassword" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Port" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="BackupRetentionPeriod" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="MultiAZ" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="EngineVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Iops" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="DBInstanceIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="StorageType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PendingModifiedValues", propOrder = {
    "dbInstanceClass",
    "allocatedStorage",
    "masterUserPassword",
    "port",
    "backupRetentionPeriod",
    "multiAZ",
    "engineVersion",
    "iops",
    "dbInstanceIdentifier",
    "storageType"
})
public class PendingModifiedValues {

    @XmlElement(name = "DBInstanceClass")
    protected String dbInstanceClass;
    @XmlElement(name = "AllocatedStorage")
    protected BigInteger allocatedStorage;
    @XmlElement(name = "MasterUserPassword")
    protected String masterUserPassword;
    @XmlElement(name = "Port")
    protected BigInteger port;
    @XmlElement(name = "BackupRetentionPeriod")
    protected BigInteger backupRetentionPeriod;
    @XmlElement(name = "MultiAZ")
    protected Boolean multiAZ;
    @XmlElement(name = "EngineVersion")
    protected String engineVersion;
    @XmlElement(name = "Iops")
    protected BigInteger iops;
    @XmlElement(name = "DBInstanceIdentifier")
    protected String dbInstanceIdentifier;
    @XmlElement(name = "StorageType")
    protected String storageType;

    /**
     * Gets the value of the dbInstanceClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBInstanceClass() {
        return dbInstanceClass;
    }

    /**
     * Sets the value of the dbInstanceClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBInstanceClass(String value) {
        this.dbInstanceClass = value;
    }

    /**
     * Gets the value of the allocatedStorage property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAllocatedStorage() {
        return allocatedStorage;
    }

    /**
     * Sets the value of the allocatedStorage property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAllocatedStorage(BigInteger value) {
        this.allocatedStorage = value;
    }

    /**
     * Gets the value of the masterUserPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterUserPassword() {
        return masterUserPassword;
    }

    /**
     * Sets the value of the masterUserPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterUserPassword(String value) {
        this.masterUserPassword = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPort(BigInteger value) {
        this.port = value;
    }

    /**
     * Gets the value of the backupRetentionPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBackupRetentionPeriod() {
        return backupRetentionPeriod;
    }

    /**
     * Sets the value of the backupRetentionPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBackupRetentionPeriod(BigInteger value) {
        this.backupRetentionPeriod = value;
    }

    /**
     * Gets the value of the multiAZ property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean getMultiAZ() {
        return multiAZ;
    }

    /**
     * Sets the value of the multiAZ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultiAZ(Boolean value) {
        this.multiAZ = value;
    }

    /**
     * Gets the value of the engineVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * Sets the value of the engineVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEngineVersion(String value) {
        this.engineVersion = value;
    }

    /**
     * Gets the value of the iops property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIops() {
        return iops;
    }

    /**
     * Sets the value of the iops property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIops(BigInteger value) {
        this.iops = value;
    }

    /**
     * Gets the value of the dbInstanceIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDBInstanceIdentifier() {
        return dbInstanceIdentifier;
    }

    /**
     * Sets the value of the dbInstanceIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDBInstanceIdentifier(String value) {
        this.dbInstanceIdentifier = value;
    }

    /**
     * Gets the value of the storageType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStorageType() {
        return storageType;
    }

    /**
     * Sets the value of the storageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStorageType(String value) {
        this.storageType = value;
    }

}
