package com.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoAttribute2 {
	
	@Test
	public void login_test() {
		System.out.println("Tc 1: Login Test Case");
	//	Assert.fail();
	}
	
	@Test(dependsOnMethods = "composeMail_Test")
	public void sendMail_test() {
		System.out.println("Tc 2: SendMail Test Case");
	}
	
	@Test(dependsOnMethods = "login_test")
	public void composeMail_Test() {
		System.out.println("TC 3: ComposeMail Test Case");
		
	}

}
