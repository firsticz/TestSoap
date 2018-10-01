package com.demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(endpointInterface = "com.demo.KFCServiceInterface")
public class KFCService {
	
	@WebMethod
	public String wingZap() {
		return "ไก่แช่เกลือ";
	}
	
	@WebMethod
	public double calulate(@WebParam(name = "number") int number) {
		return number*10;
	}
}
