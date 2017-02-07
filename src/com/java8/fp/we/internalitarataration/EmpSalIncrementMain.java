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
		
		
		ArrayList empList = new ArrayList();
		empList.add(new Employee("sairam", 200000L));
		empList.add(new Employee("sairam1", 400000L));
		empList.add(new Employee("sairam2", 900000L));
		empList.add(new Employee("sairam3", 1200000L));
		Iterator arg2 = empList.iterator();

		
		
		Employee empList1;
		while (arg2.hasNext()) {
			empList1 = (Employee) arg2.next();
			empList1.setIncrementedSal(empList1.getSalary() + empList1.getSalary() * 10L / 100L);
		}

		System.out.println(((Employee) empList.get(0)).getIncrementedSal());
		arg2 = empList.iterator();

		while (arg2.hasNext()) {
			empList1 = (Employee) arg2.next();
			empList1.setIncrementedSal(empList1.getSalary() + empList1.getSalary() * 20L / 100L);
		}

		System.out.println(((Employee) empList.get(0)).getIncrementedSal());
		Emplist empList11 = new Emplist();
		empList11.add(new Employee("sairam", 200000L));
		empList11.add(new Employee("sairam1", 400000L));
		empList11.add(new Employee("sairam2", 900000L));
		empList11.add(new Employee("sairam3", 1200000L));
		empList11.forEachEmp(new IncrementBy10per());
		System.out.println(
				((Employee) empList11.get(0)).getSalary() + ":" + ((Employee) empList11.get(0)).getIncrementedSal());
		empList11.forEach(new IncrementBy10perJ8());
		System.out.println(
				((Employee) empList11.get(0)).getSalary() + ":" + ((Employee) empList11.get(0)).getIncrementedSal());
		empList.forEach((employee) -> {
			employee.setIncrementedSal(employee.getSalary() + employee.getSalary() * 10L / 100L);
		});
		System.out.println(
				((Employee) empList.get(0)).getSalary() + ":" + ((Employee) empList.get(0)).getIncrementedSal());
	}
}