package com.java8.fp.we.streams;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee {
	
	
	private String name;
	private long salary;
	private Date dataOfJoiniing;
	private long incrementedSal;
	private List<Integer> yearGrades = new ArrayList<Integer>();
	private int lastYearMaxGrade;
	private int trainingsAttended;
	
	
	public int getTrainingsAttended() {
		return trainingsAttended;
	}



	public void setTrainingsAttended(int trainingsAttended) {
		this.trainingsAttended = trainingsAttended;
	}



	public Employee(String name) {
		this.name = name;
	}
	
	

	public List getYearGrades() {
		return yearGrades;
	}
	
	public int getLatestGrade(){
		
		return this.yearGrades.get(yearGrades.size()-1);
	}

	public void setYearGrades(List yearGrades) {
		this.yearGrades = yearGrades;
	}
	
	public void addGrade(Integer grade)
	{
		this.yearGrades.add(grade);
		
	}

	public int getLastYearMaxGrade() {
		return lastYearMaxGrade;
	}

	public void setLastYearMaxGrade(int lastYearMaxGrade) {
		this.lastYearMaxGrade = lastYearMaxGrade;
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