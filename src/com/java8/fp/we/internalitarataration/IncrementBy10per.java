package com.java8.fp.we.internalitarataration;

import com.java8.fp.we.internalitarataration.Employee;
import com.java8.fp.we.internalitarataration.EmployeeAction;

public class IncrementBy10per implements EmployeeAction {

	public void perform(Employee employee) {

		employee.setIncrementedSal(employee.getSalary() + employee.getSalary() * 10L / 100L);
	}
}