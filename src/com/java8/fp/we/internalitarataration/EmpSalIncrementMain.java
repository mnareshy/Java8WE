package com.java8.fp.we.internalitarataration;

import com.java8.fp.we.internalitarataration.Emplist;
import com.java8.fp.we.internalitarataration.Employee;
import com.java8.fp.we.internalitarataration.IncrementBy10per;
import com.java8.fp.we.internalitarataration.IncrementBy10perJ8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class EmpSalIncrementMain {
	
	
	public static void main(String[] args) {
		

// imaginary list of employees and their salaries		
		
		ArrayList<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee("sairam", 200000L));
		empList.add(new Employee("sairam1", 400000L));
		empList.add(new Employee("sairam2", 900000L));
		empList.add(new Employee("sairam3", 1200000L));
		
// if you want to increment the salaries of each employee by 10% as this anual hike. Just the plain way of doing
		
		for (Employee employee : empList) {
			
			employee.setIncrementedSal(employee.getSalary() + employee.getSalary() * 10L / 100L);
		}
		
		
		System.out.println(((Employee) empList.get(0)).getIncrementedSal());
		
// the same doesn't work if the increment is 20%
		
		for (Employee employee : empList) {
			
			employee.setIncrementedSal(employee.getSalary() + employee.getSalary() * 20L / 100L);
		
		}

	
// Getting closer to more readable form of code, then relaying on loops, itarators...etc 
// EmployeeAction , and its implementation IncrementBy10per make it inner itaration
		System.out.println(((Employee) empList.get(0)).getIncrementedSal());
		
		Emplist empList11 = new Emplist();
		
		empList11.add(new Employee("sairam", 200000L));
		empList11.add(new Employee("sairam1", 400000L));
		empList11.add(new Employee("sairam2", 900000L));
		empList11.add(new Employee("sairam3", 1200000L));
		
		empList11.forEachEmp(new IncrementBy10per());
		
		System.out.println(((Employee) empList11.get(0)).getSalary() + ":" + ((Employee) empList11.get(0)).getIncrementedSal());
		
// Achieving the same with Java 8 built in Interface Consumer and its custom implementation IncrementBy10perJ8
		
		empList11.forEach(new IncrementBy10perJ8());
		
		System.out.println(((Employee) empList11.get(0)).getSalary() + ":" + ((Employee) empList11.get(0)).getIncrementedSal());
		
// Making it much simpler , where the compiler can infer the interface and implemented method from context
		
		empList.forEach(employee -> employee.setIncrementedSal(employee.getSalary() + employee.getSalary() * 10L / 100L));
		
		System.out.println(((Employee) empList.get(0)).getSalary() + ":" + ((Employee) empList.get(0)).getIncrementedSal());
	}
}