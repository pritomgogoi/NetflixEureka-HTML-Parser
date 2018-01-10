
package com.poc.discoveryservice.html.parser.eureka.model;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mypackage package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Application }
     * 
     */
    public Application createApplication() {
        return new Application();
    }

    /**
     * Create an instance of {@link Application.Instance }
     * 
     */
    public Application.Instance createApplicationInstance() {
        return new Application.Instance();
    }

    /**
     * Create an instance of {@link Application.Instance.DataCenterInfo }
     * 
     */
    public Application.Instance.DataCenterInfo createApplicationInstanceDataCenterInfo() {
        return new Application.Instance.DataCenterInfo();
    }

    /**
     * Create an instance of {@link Application.Instance.Port }
     * 
     */
    public Application.Instance.Port createApplicationInstancePort() {
        return new Application.Instance.Port();
    }

    /**
     * Create an instance of {@link Application.Instance.SecurePort }
     * 
     */
    public Application.Instance.SecurePort createApplicationInstanceSecurePort() {
        return new Application.Instance.SecurePort();
    }

    /**
     * Create an instance of {@link Application.Instance.LeaseInfo }
     * 
     */
    public Application.Instance.LeaseInfo createApplicationInstanceLeaseInfo() {
        return new Application.Instance.LeaseInfo();
    }

    /**
     * Create an instance of {@link Application.Instance.Metadata }
     * 
     */
    public Application.Instance.Metadata createApplicationInstanceMetadata() {
        return new Application.Instance.Metadata();
    }

    /**
     * Create an instance of {@link Application.Instance.DataCenterInfo.Metadata }
     * 
     */
    public Application.Instance.DataCenterInfo.Metadata createApplicationInstanceDataCenterInfoMetadata() {
        return new Application.Instance.DataCenterInfo.Metadata();
    }

}
