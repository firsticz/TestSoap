package com.demo;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface KFCServiceInterface {
	
	@WebMethod
	public String wingZap();
	
	@WebMethod
	public double calulate(@WebParam(name = "number") int number);
}
