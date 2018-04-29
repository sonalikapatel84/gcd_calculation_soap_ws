package com.sonalika.service;

public class TestClient {

	public static void main(String[] args) throws Exception {
		java.net.URL endpointurl = new java.net.URL("http://localhost:8080/GcdService/services/GCDService");

		org.apache.axis.client.Service service = 
		new org.apache.axis.client.Service();
		
		GCDServiceSoapBindingStub stub = 
				new GCDServiceSoapBindingStub(endpointurl, service);
		
		int result = stub.gcd(27, 9);
		System.out.println("GCD RESULT: "+ result);
		
		
	}
}
