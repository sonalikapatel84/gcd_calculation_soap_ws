/**
 * GCDServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonalika.service;

public class GCDServiceServiceLocator extends org.apache.axis.client.Service implements com.sonalika.service.GCDServiceService {

    public GCDServiceServiceLocator() {
    }


    public GCDServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GCDServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GCDService
    private java.lang.String GCDService_address = "http://localhost:8080/GcdService/services/GCDService";

    public java.lang.String getGCDServiceAddress() {
        return GCDService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GCDServiceWSDDServiceName = "GCDService";

    public java.lang.String getGCDServiceWSDDServiceName() {
        return GCDServiceWSDDServiceName;
    }

    public void setGCDServiceWSDDServiceName(java.lang.String name) {
        GCDServiceWSDDServiceName = name;
    }

    public com.sonalika.service.GCDService getGCDService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GCDService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGCDService(endpoint);
    }

    public com.sonalika.service.GCDService getGCDService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.sonalika.service.GCDServiceSoapBindingStub _stub = new com.sonalika.service.GCDServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getGCDServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGCDServiceEndpointAddress(java.lang.String address) {
        GCDService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.sonalika.service.GCDService.class.isAssignableFrom(serviceEndpointInterface)) {
                com.sonalika.service.GCDServiceSoapBindingStub _stub = new com.sonalika.service.GCDServiceSoapBindingStub(new java.net.URL(GCDService_address), this);
                _stub.setPortName(getGCDServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("GCDService".equals(inputPortName)) {
            return getGCDService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.sonalika.com", "GCDServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.sonalika.com", "GCDService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GCDService".equals(portName)) {
            setGCDServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
