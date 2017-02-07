package com.java8.fp.we.internalitarataration;

import java.util.function.Consumer;

public class IncrementBy10perJ8 implements Consumer<Employee>{

	

	@Override
	public void accept(Employee employee) {
		// TODO Auto-generated method stub
		employee.setIncrementedSal(employee.getSalary() + (employee.getSalary()*10)/100 );
		
	}
	
	
	
	
}
