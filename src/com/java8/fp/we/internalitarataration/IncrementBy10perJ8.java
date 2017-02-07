package com.java8.fp.we.internalitarataration;

import com.java8.fp.we.internalitarataration.Employee;
import java.util.function.Consumer;

public class IncrementBy10perJ8 implements Consumer<Employee> {
	public void accept(Employee employee) {
		employee.setIncrementedSal(employee.getSalary() + employee.getSalary() * 10L / 100L);
	}
}