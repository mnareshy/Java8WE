package com.java8.fp.we.internalitarataration;

import java.util.Date;

public class Employee {
	private String name;
	private long salary;
	private Date dataOfJoiniing;
	private long incrementedSal;

	public Employee(String name, long salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getSalary() {
		return this.salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public Date getDataOfJoiniing() {
		return this.dataOfJoiniing;
	}

	public void setDataOfJoiniing(Date dataOfJoiniing) {
		this.dataOfJoiniing = dataOfJoiniing;
	}

	public long getIncrementedSal() {
		return this.incrementedSal;
	}

	public void setIncrementedSal(long incrementedSal) {
		this.incrementedSal = incrementedSal;
	}
}