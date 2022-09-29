package com.services;

import com.customexception.InvalidNumberRangeException;

public interface MathService {
	
	//Spec: add fun should do the addition of two int values and return result in int
    //incase if the input param are -ve (not possitive int) then should not return the result , raise Exception (Custom excpetion)
  
	int add(int a,int b) throws InvalidNumberRangeException;
	int sub(int a,int b);
	int div(int a,int b);
	int mul(int a,int b);

}
