package com.java8.fp.we.scope;

import java.util.function.IntUnaryOperator;

public class ScopeTest {
	
	public static void main(String[] args) {
		
		
//		Lamda Scoping examples
		
		int  i =  2;
		
		Runnable r = () -> {System.out.println("saibaba" +":"+ i);};
		
		r.run();
		
		IntUnaryOperator add = j -> { return i+1; };
		
		System.out.println(add.applyAsInt(i));
		
		
		

		

	new ScopeTest().r1.run();
	new ScopeTest().r2.run();
		
	}
	
	
//  filed name can be temporarily redeclared as a parameter or local variable

	Object  x, y;
	
	IntUnaryOperator add1 = x -> {int y = 3;  return x+y; };
	
	
	
//	this and Super are same for lamdas
	
	Runnable r1 = () -> System.out.println(this);
	Runnable r2 = () -> System.out.println(toString());
	
	public String toString (){
		
		
		return "sairam";
	}
	
	IntUnaryOperator fwref;
	
	public void fwScope(){
	
	fwref = i -> i + fwref.applyAsInt(1);
	
	}
	
	
	IntUnaryOperator factorial;
	
	public void factorialM(){

		factorial = i -> i == 0 ? 1 : i * factorial.applyAsInt(i - 1);

	}
	
	
	
	

}
