package com.demo;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(endpointInterface = "com.demo.KFCServiceInterface")
public class KFCService {
	
	@WebMethod
	public String wingZap() {
		return "ไก่แช่น้ำเกลือ";
	}
	
}
