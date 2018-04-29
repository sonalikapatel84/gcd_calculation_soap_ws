package com.sonalika.service;

public class GCDServiceProxy implements com.sonalika.service.GCDService {
  private String _endpoint = null;
  private com.sonalika.service.GCDService gCDService = null;
  
  public GCDServiceProxy() {
    _initGCDServiceProxy();
  }
  
  public GCDServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initGCDServiceProxy();
  }
  
  private void _initGCDServiceProxy() {
    try {
      gCDService = (new com.sonalika.service.GCDServiceServiceLocator()).getGCDService();
      if (gCDService != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)gCDService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)gCDService)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (gCDService != null)
      ((javax.xml.rpc.Stub)gCDService)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.sonalika.service.GCDService getGCDService() {
    if (gCDService == null)
      _initGCDServiceProxy();
    return gCDService;
  }
  
  public int gcd(int number1, int number2) throws java.rmi.RemoteException{
    if (gCDService == null)
      _initGCDServiceProxy();
    return gCDService.gcd(number1, number2);
  }
  
  public void connection() throws java.rmi.RemoteException{
    if (gCDService == null)
      _initGCDServiceProxy();
    gCDService.connection();
  }
  
  public void connectionToMySql() throws java.rmi.RemoteException{
    if (gCDService == null)
      _initGCDServiceProxy();
    gCDService.connectionToMySql();
  }
  
  
}