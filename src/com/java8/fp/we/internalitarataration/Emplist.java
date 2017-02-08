package com.java8.fp.we.internalitarataration;

import com.java8.fp.we.internalitarataration.Employee;
import com.java8.fp.we.internalitarataration.EmployeeAction;
import java.util.ArrayList;
import java.util.Iterator;

public class Emplist extends ArrayList<Employee> {
	
	public void forEachEmp(EmployeeAction empAction) {
		
		
		for(Employee employee : this){
			
			
			empAction.perform(employee);
			
		}
		
		
	}
}