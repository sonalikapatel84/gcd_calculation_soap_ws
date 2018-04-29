/**
 * GCDService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sonalika.service;

public interface GCDService extends java.rmi.Remote {
    public int gcd(int number1, int number2) throws java.rmi.RemoteException;
    public void connection() throws java.rmi.RemoteException;
    public void connectionToMySql() throws java.rmi.RemoteException;
}
