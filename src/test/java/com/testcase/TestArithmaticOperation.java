package com.testcase;

import org.testng.annotations.Test;

import com.arithmaticoperation.ArithmaticOperation;

public class TestArithmaticOperation implements ArithmaticOperation{
	int a=20,b=10,res;
	
	
	@Test(priority = 1)
	public void add() {
		System.out.println("TC1 : Addition " +(a+b));
	}

	@Test(priority = 2)
	public void sub() {
		System.out.println("TC2 : Substraction " +(a-b));
		}

	@Test(priority = 3)
	public void mul() {
		System.out.println("TC3 : Multiplication " +(a*b));
		}

	@Test(priority = 4)
	public void div() {
		System.out.println("TC4 : Division " +(a/b));
		}

	
}