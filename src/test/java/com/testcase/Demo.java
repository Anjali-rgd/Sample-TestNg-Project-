package com.testcase;

import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
	
	@BeforeSuite
	public void init() {
		System.out.println("--------Before suit in Demo--------");
		}
	
	@BeforeTest
	public void setUpTestEnv() {
		System.out.println("--------Before all the test set up env-------");
	}
	
	@BeforeClass
	public void fun() {
		System.out.println("Fun: in before class methods");
	}
	
    @BeforeMethod
	public void setUpTestData() {
		System.out.println("------setup TestData------ ");
	}
    
    @Test(priority = 3,invocationCount = 3)
    public void atest() {
    	System.out.println("Test Case 1:A");
    //	throw new SkipException("Skipping is deliberatly:");
    }
    
    @Test(priority = 1,description = "This is B Test Case",timeOut = 1)
    public void btest() {
    	System.out.println("Test Case 2:B");
    }
    
    @Test(priority = -3,expectedExceptions = ArithmeticException.class,enabled = false)
    public void ctest() {
    	System.out.println("Test Case 3:C");
    	int a=5,b=0;
    	int res=a/b;
    }
    
    @AfterSuite
    public void tearDown() {
    	System.out.println("------After Suit in Demo-----");
    }
    @AfterTest
    public void tearDownTestEnv() {
    	System.out.println("------after all the tests tear down en-----");
    }

    @AfterMethod
    public void tearDownTestData() {
    	System.out.println("----TearDown TestData-------");
    }
    
    
 }
