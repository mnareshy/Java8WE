package com.java8.fp.we.internalitarataration;

import com.java8.fp.we.internalitarataration.Employee;
import com.java8.fp.we.internalitarataration.EmployeeAction;
import java.util.ArrayList;
import java.util.Iterator;

public class Emplist extends ArrayList<Employee> {
	
	public void forEachEmp(EmployeeAction empAction) {
		Iterator empItarator = this.iterator();

		while (empItarator.hasNext()) {
			
			Employee employee = (Employee) empItarator.next();
			empAction.perform(employee);
		}

	}
}