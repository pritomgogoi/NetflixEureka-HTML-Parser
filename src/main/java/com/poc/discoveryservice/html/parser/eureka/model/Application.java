
package com.poc.discoveryservice.html.parser.eureka.model;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="instance" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="app" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ipAddr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="overriddenstatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="port">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>short">
 *                           &lt;attribute name="enabled" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="securePort">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>short">
 *                           &lt;attribute name="enabled" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="countryId" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="dataCenterInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="metadata">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                                       &lt;element name="local-hostname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="instance-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="local-ipv4" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="instance-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="vpc-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="ami-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="mac" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="availability-zone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="leaseInfo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="renewalIntervalInSecs" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="durationInSecs" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="registrationTimestamp" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                             &lt;element name="lastRenewalTimestamp" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                             &lt;element name="evictionTimestamp" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                             &lt;element name="serviceUpTimestamp" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="metadata">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="homePageUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                   &lt;element name="statusPageUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                   &lt;element name="healthCheckUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                   &lt;element name="vipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="secureVipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="isCoordinatingDiscoveryServer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="lastUpdatedTimestamp" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="lastDirtyTimestamp" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                   &lt;element name="actionType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "name",
    "instance"
})
@XmlRootElement(name = "application")
public class Application {

    @XmlElement(required = true)
    protected String name;
    protected List<Application.Instance> instance;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
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
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the instance property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instance property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstance().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Application.Instance }
     * 
     * 
     */
    public List<Application.Instance> getInstance() {
        if (instance == null) {
            instance = new ArrayList<Application.Instance>();
        }
        return this.instance;
    }


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
     *         &lt;element name="hostName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="app" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ipAddr" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="overriddenstatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="port">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>short">
     *                 &lt;attribute name="enabled" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="securePort">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>short">
     *                 &lt;attribute name="enabled" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="countryId" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="dataCenterInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="metadata">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                             &lt;element name="local-hostname" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="instance-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="local-ipv4" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="instance-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="vpc-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="ami-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="mac" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="availability-zone" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="leaseInfo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="renewalIntervalInSecs" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="durationInSecs" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="registrationTimestamp" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                   &lt;element name="lastRenewalTimestamp" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                   &lt;element name="evictionTimestamp" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *                   &lt;element name="serviceUpTimestamp" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="metadata">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="homePageUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *         &lt;element name="statusPageUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *         &lt;element name="healthCheckUrl" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *         &lt;element name="vipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="secureVipAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="isCoordinatingDiscoveryServer" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="lastUpdatedTimestamp" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="lastDirtyTimestamp" type="{http://www.w3.org/2001/XMLSchema}long"/>
     *         &lt;element name="actionType" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "hostName",
        "app",
        "ipAddr",
        "status",
        "overriddenstatus",
        "port",
        "securePort",
        "countryId",
        "dataCenterInfo",
        "leaseInfo",
        "metadata",
        "homePageUrl",
        "statusPageUrl",
        "healthCheckUrl",
        "vipAddress",
        "secureVipAddress",
        "isCoordinatingDiscoveryServer",
        "lastUpdatedTimestamp",
        "lastDirtyTimestamp",
        "actionType"
    })
    public static class Instance {

        @XmlElement(required = true)
        protected String hostName;
        @XmlElement(required = true)
        protected String app;
        @XmlElement(required = true)
        protected String ipAddr;
        @XmlElement(required = true)
        protected String status;
        @XmlElement(required = true)
        protected String overriddenstatus;
        @XmlElement(required = true)
        protected Application.Instance.Port port;
        @XmlElement(required = true)
        protected Application.Instance.SecurePort securePort;
        protected byte countryId;
        @XmlElement(required = true)
        protected Application.Instance.DataCenterInfo dataCenterInfo;
        @XmlElement(required = true)
        protected Application.Instance.LeaseInfo leaseInfo;
        @XmlElement(required = true)
        protected Application.Instance.Metadata metadata;
        @XmlElement(required = true)
        @XmlSchemaType(name = "anyURI")
        protected String homePageUrl;
        @XmlElement(required = true)
        @XmlSchemaType(name = "anyURI")
        protected String statusPageUrl;
        @XmlElement(required = true)
        @XmlSchemaType(name = "anyURI")
        protected String healthCheckUrl;
        @XmlElement(required = true)
        protected String vipAddress;
        @XmlElement(required = true)
        protected String secureVipAddress;
        @XmlElement(required = true)
        protected String isCoordinatingDiscoveryServer;
        protected long lastUpdatedTimestamp;
        protected long lastDirtyTimestamp;
        @XmlElement(required = true)
        protected String actionType;

        /**
         * Gets the value of the hostName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHostName() {
            return hostName;
        }

        /**
         * Sets the value of the hostName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHostName(String value) {
            this.hostName = value;
        }

        /**
         * Gets the value of the app property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApp() {
            return app;
        }

        /**
         * Sets the value of the app property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApp(String value) {
            this.app = value;
        }

        /**
         * Gets the value of the ipAddr property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIpAddr() {
            return ipAddr;
        }

        /**
         * Sets the value of the ipAddr property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIpAddr(String value) {
            this.ipAddr = value;
        }

        /**
         * Gets the value of the status property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * Sets the value of the status property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * Gets the value of the overriddenstatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOverriddenstatus() {
            return overriddenstatus;
        }

        /**
         * Sets the value of the overriddenstatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOverriddenstatus(String value) {
            this.overriddenstatus = value;
        }

        /**
         * Gets the value of the port property.
         * 
         * @return
         *     possible object is
         *     {@link Application.Instance.Port }
         *     
         */
        public Application.Instance.Port getPort() {
            return port;
        }

        /**
         * Sets the value of the port property.
         * 
         * @param value
         *     allowed object is
         *     {@link Application.Instance.Port }
         *     
         */
        public void setPort(Application.Instance.Port value) {
            this.port = value;
        }

        /**
         * Gets the value of the securePort property.
         * 
         * @return
         *     possible object is
         *     {@link Application.Instance.SecurePort }
         *     
         */
        public Application.Instance.SecurePort getSecurePort() {
            return securePort;
        }

        /**
         * Sets the value of the securePort property.
         * 
         * @param value
         *     allowed object is
         *     {@link Application.Instance.SecurePort }
         *     
         */
        public void setSecurePort(Application.Instance.SecurePort value) {
            this.securePort = value;
        }

        /**
         * Gets the value of the countryId property.
         * 
         */
        public byte getCountryId() {
            return countryId;
        }

        /**
         * Sets the value of the countryId property.
         * 
         */
        public void setCountryId(byte value) {
            this.countryId = value;
        }

        /**
         * Gets the value of the dataCenterInfo property.
         * 
         * @return
         *     possible object is
         *     {@link Application.Instance.DataCenterInfo }
         *     
         */
        public Application.Instance.DataCenterInfo getDataCenterInfo() {
            return dataCenterInfo;
        }

        /**
         * Sets the value of the dataCenterInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link Application.Instance.DataCenterInfo }
         *     
         */
        public void setDataCenterInfo(Application.Instance.DataCenterInfo value) {
            this.dataCenterInfo = value;
        }

        /**
         * Gets the value of the leaseInfo property.
         * 
         * @return
         *     possible object is
         *     {@link Application.Instance.LeaseInfo }
         *     
         */
        public Application.Instance.LeaseInfo getLeaseInfo() {
            return leaseInfo;
        }

        /**
         * Sets the value of the leaseInfo property.
         * 
         * @param value
         *     allowed object is
         *     {@link Application.Instance.LeaseInfo }
         *     
         */
        public void setLeaseInfo(Application.Instance.LeaseInfo value) {
            this.leaseInfo = value;
        }

        /**
         * Gets the value of the metadata property.
         * 
         * @return
         *     possible object is
         *     {@link Application.Instance.Metadata }
         *     
         */
        public Application.Instance.Metadata getMetadata() {
            return metadata;
        }

        /**
         * Sets the value of the metadata property.
         * 
         * @param value
         *     allowed object is
         *     {@link Application.Instance.Metadata }
         *     
         */
        public void setMetadata(Application.Instance.Metadata value) {
            this.metadata = value;
        }

        /**
         * Gets the value of the homePageUrl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHomePageUrl() {
            return homePageUrl;
        }

        /**
         * Sets the value of the homePageUrl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHomePageUrl(String value) {
            this.homePageUrl = value;
        }

        /**
         * Gets the value of the statusPageUrl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatusPageUrl() {
            return statusPageUrl;
        }

        /**
         * Sets the value of the statusPageUrl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatusPageUrl(String value) {
            this.statusPageUrl = value;
        }

        /**
         * Gets the value of the healthCheckUrl property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHealthCheckUrl() {
            return healthCheckUrl;
        }

        /**
         * Sets the value of the healthCheckUrl property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHealthCheckUrl(String value) {
            this.healthCheckUrl = value;
        }

        /**
         * Gets the value of the vipAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVipAddress() {
            return vipAddress;
        }

        /**
         * Sets the value of the vipAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVipAddress(String value) {
            this.vipAddress = value;
        }

        /**
         * Gets the value of the secureVipAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSecureVipAddress() {
            return secureVipAddress;
        }

        /**
         * Sets the value of the secureVipAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSecureVipAddress(String value) {
            this.secureVipAddress = value;
        }

        /**
         * Gets the value of the isCoordinatingDiscoveryServer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsCoordinatingDiscoveryServer() {
            return isCoordinatingDiscoveryServer;
        }

        /**
         * Sets the value of the isCoordinatingDiscoveryServer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsCoordinatingDiscoveryServer(String value) {
            this.isCoordinatingDiscoveryServer = value;
        }

        /**
         * Gets the value of the lastUpdatedTimestamp property.
         * 
         */
        public long getLastUpdatedTimestamp() {
            return lastUpdatedTimestamp;
        }

        /**
         * Sets the value of the lastUpdatedTimestamp property.
         * 
         */
        public void setLastUpdatedTimestamp(long value) {
            this.lastUpdatedTimestamp = value;
        }

        /**
         * Gets the value of the lastDirtyTimestamp property.
         * 
         */
        public long getLastDirtyTimestamp() {
            return lastDirtyTimestamp;
        }

        /**
         * Sets the value of the lastDirtyTimestamp property.
         * 
         */
        public void setLastDirtyTimestamp(long value) {
            this.lastDirtyTimestamp = value;
        }

        /**
         * Gets the value of the actionType property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActionType() {
            return actionType;
        }

        /**
         * Sets the value of the actionType property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActionType(String value) {
            this.actionType = value;
        }


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
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="metadata">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *                   &lt;element name="local-hostname" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="instance-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="local-ipv4" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="instance-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="vpc-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="ami-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="mac" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="availability-zone" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name",
            "metadata"
        })
        public static class DataCenterInfo {

            @XmlElement(required = true)
            protected String name;
            @XmlElement(required = true)
            protected Application.Instance.DataCenterInfo.Metadata metadata;
            @XmlAttribute(name = "class")
            protected String clazz;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
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
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the metadata property.
             * 
             * @return
             *     possible object is
             *     {@link Application.Instance.DataCenterInfo.Metadata }
             *     
             */
            public Application.Instance.DataCenterInfo.Metadata getMetadata() {
                return metadata;
            }

            /**
             * Sets the value of the metadata property.
             * 
             * @param value
             *     allowed object is
             *     {@link Application.Instance.DataCenterInfo.Metadata }
             *     
             */
            public void setMetadata(Application.Instance.DataCenterInfo.Metadata value) {
                this.metadata = value;
            }

            /**
             * Gets the value of the clazz property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClazz() {
                return clazz;
            }

            /**
             * Sets the value of the clazz property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClazz(String value) {
                this.clazz = value;
            }


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
             *         &lt;element name="accountId" type="{http://www.w3.org/2001/XMLSchema}long"/>
             *         &lt;element name="local-hostname" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="instance-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="local-ipv4" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="instance-type" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="vpc-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="ami-id" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="mac" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="availability-zone" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "accountId",
                "localHostname",
                "instanceId",
                "localIpv4",
                "instanceType",
                "vpcId",
                "amiId",
                "mac",
                "availabilityZone"
            })
            public static class Metadata {

                protected long accountId;
                @XmlElement(name = "local-hostname", required = true)
                protected String localHostname;
                @XmlElement(name = "instance-id", required = true)
                protected String instanceId;
                @XmlElement(name = "local-ipv4", required = true)
                protected String localIpv4;
                @XmlElement(name = "instance-type", required = true)
                protected String instanceType;
                @XmlElement(name = "vpc-id", required = true)
                protected String vpcId;
                @XmlElement(name = "ami-id", required = true)
                protected String amiId;
                @XmlElement(required = true)
                protected String mac;
                @XmlElement(name = "availability-zone", required = true)
                protected String availabilityZone;

                /**
                 * Gets the value of the accountId property.
                 * 
                 */
                public long getAccountId() {
                    return accountId;
                }

                /**
                 * Sets the value of the accountId property.
                 * 
                 */
                public void setAccountId(long value) {
                    this.accountId = value;
                }

                /**
                 * Gets the value of the localHostname property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLocalHostname() {
                    return localHostname;
                }

                /**
                 * Sets the value of the localHostname property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLocalHostname(String value) {
                    this.localHostname = value;
                }

                /**
                 * Gets the value of the instanceId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInstanceId() {
                    return instanceId;
                }

                /**
                 * Sets the value of the instanceId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInstanceId(String value) {
                    this.instanceId = value;
                }

                /**
                 * Gets the value of the localIpv4 property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getLocalIpv4() {
                    return localIpv4;
                }

                /**
                 * Sets the value of the localIpv4 property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setLocalIpv4(String value) {
                    this.localIpv4 = value;
                }

                /**
                 * Gets the value of the instanceType property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInstanceType() {
                    return instanceType;
                }

                /**
                 * Sets the value of the instanceType property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInstanceType(String value) {
                    this.instanceType = value;
                }

                /**
                 * Gets the value of the vpcId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getVpcId() {
                    return vpcId;
                }

                /**
                 * Sets the value of the vpcId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setVpcId(String value) {
                    this.vpcId = value;
                }

                /**
                 * Gets the value of the amiId property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAmiId() {
                    return amiId;
                }

                /**
                 * Sets the value of the amiId property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAmiId(String value) {
                    this.amiId = value;
                }

                /**
                 * Gets the value of the mac property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMac() {
                    return mac;
                }

                /**
                 * Sets the value of the mac property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMac(String value) {
                    this.mac = value;
                }

                /**
                 * Gets the value of the availabilityZone property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAvailabilityZone() {
                    return availabilityZone;
                }

                /**
                 * Sets the value of the availabilityZone property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAvailabilityZone(String value) {
                    this.availabilityZone = value;
                }

            }

        }


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
         *         &lt;element name="renewalIntervalInSecs" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="durationInSecs" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="registrationTimestamp" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *         &lt;element name="lastRenewalTimestamp" type="{http://www.w3.org/2001/XMLSchema}long"/>
         *         &lt;element name="evictionTimestamp" type="{http://www.w3.org/2001/XMLSchema}byte"/>
         *         &lt;element name="serviceUpTimestamp" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
            "renewalIntervalInSecs",
            "durationInSecs",
            "registrationTimestamp",
            "lastRenewalTimestamp",
            "evictionTimestamp",
            "serviceUpTimestamp"
        })
        public static class LeaseInfo {

            protected byte renewalIntervalInSecs;
            protected byte durationInSecs;
            protected long registrationTimestamp;
            protected long lastRenewalTimestamp;
            protected byte evictionTimestamp;
            protected long serviceUpTimestamp;

            /**
             * Gets the value of the renewalIntervalInSecs property.
             * 
             */
            public byte getRenewalIntervalInSecs() {
                return renewalIntervalInSecs;
            }

            /**
             * Sets the value of the renewalIntervalInSecs property.
             * 
             */
            public void setRenewalIntervalInSecs(byte value) {
                this.renewalIntervalInSecs = value;
            }

            /**
             * Gets the value of the durationInSecs property.
             * 
             */
            public byte getDurationInSecs() {
                return durationInSecs;
            }

            /**
             * Sets the value of the durationInSecs property.
             * 
             */
            public void setDurationInSecs(byte value) {
                this.durationInSecs = value;
            }

            /**
             * Gets the value of the registrationTimestamp property.
             * 
             */
            public long getRegistrationTimestamp() {
                return registrationTimestamp;
            }

            /**
             * Sets the value of the registrationTimestamp property.
             * 
             */
            public void setRegistrationTimestamp(long value) {
                this.registrationTimestamp = value;
            }

            /**
             * Gets the value of the lastRenewalTimestamp property.
             * 
             */
            public long getLastRenewalTimestamp() {
                return lastRenewalTimestamp;
            }

            /**
             * Sets the value of the lastRenewalTimestamp property.
             * 
             */
            public void setLastRenewalTimestamp(long value) {
                this.lastRenewalTimestamp = value;
            }

            /**
             * Gets the value of the evictionTimestamp property.
             * 
             */
            public byte getEvictionTimestamp() {
                return evictionTimestamp;
            }

            /**
             * Sets the value of the evictionTimestamp property.
             * 
             */
            public void setEvictionTimestamp(byte value) {
                this.evictionTimestamp = value;
            }

            /**
             * Gets the value of the serviceUpTimestamp property.
             * 
             */
            public long getServiceUpTimestamp() {
                return serviceUpTimestamp;
            }

            /**
             * Sets the value of the serviceUpTimestamp property.
             * 
             */
            public void setServiceUpTimestamp(long value) {
                this.serviceUpTimestamp = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="class" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Metadata {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "class")
            protected String clazz;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the clazz property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getClazz() {
                return clazz;
            }

            /**
             * Sets the value of the clazz property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setClazz(String value) {
                this.clazz = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>short">
         *       &lt;attribute name="enabled" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Port {

            @XmlValue
            protected short value;
            @XmlAttribute(name = "enabled")
            protected String enabled;

            /**
             * Gets the value of the value property.
             * 
             */
            public short getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(short value) {
                this.value = value;
            }

            /**
             * Gets the value of the enabled property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnabled() {
                return enabled;
            }

            /**
             * Sets the value of the enabled property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnabled(String value) {
                this.enabled = value;
            }

        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>short">
         *       &lt;attribute name="enabled" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class SecurePort {

            @XmlValue
            protected short value;
            @XmlAttribute(name = "enabled")
            protected String enabled;

            /**
             * Gets the value of the value property.
             * 
             */
            public short getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             */
            public void setValue(short value) {
                this.value = value;
            }

            /**
             * Gets the value of the enabled property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnabled() {
                return enabled;
            }

            /**
             * Sets the value of the enabled property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnabled(String value) {
                this.enabled = value;
            }

        }

    }

}
