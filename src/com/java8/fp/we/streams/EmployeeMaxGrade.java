package com.java8.fp.we.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import sun.applet.Main;

/*This Class is responsible for finding the maximum grade of the Employee in an year
In order to do that the grades which are given will be applied with KRA's  and fid the max among them*/

public class EmployeeMaxGrade {

	public static void main(String[] args) {


		// consider this is given
		Employee employee =  new Employee("sairam");

		employee.addGrade(10);
		employee.addGrade(8);
		employee.addGrade(2);
		employee.addGrade(7);
		employee.addGrade(7);

		employee.setTrainingsAttended(7);

		// Phase 1 - get the grade list and apply KRA's - cosider no of trainings attributes here 

		ArrayList<Integer> gradeList =  (ArrayList) employee.getYearGrades();
		ArrayList<Integer> tfdGradeList = new ArrayList<Integer>();

		if(employee.getTrainingsAttended() > 5){

			for (Integer grades : gradeList){

				if(grades < 10)
					tfdGradeList.add(++grades);
				else
					tfdGradeList.add(grades);

			}


		}
		else
			
			tfdGradeList = gradeList;
		
// Now find the max grade and update EMployee
		
		employee.setLastYearMaxGrade(Collections.max(tfdGradeList));

// with Streams in Java 8 these can be much simplified
		
		Stream<Integer> gradeStream =   employee.getYearGrades().stream();
		
		IntStream  intGradeStream = gradeStream
									.mapToInt(i -> (employee.getTrainingsAttended() > 5 & i < 10 ) ? i+1 : i);
		
		employee.setLastYearMaxGrade(intGradeStream.max().getAsInt());
		
		
		
		
// Making it much simpler - TBD
		
/*		IntStream  intGradeStream1 = employee.getYearGrades().stream()
				.mapToInt(j -> (employee.getTrainingsAttended() > 5 & j < 10 ) ? j+1 : i);
		
		employee.setLastYearMaxGrade(intGradeStream1.max().getAsInt());*/
		

		
//		OptionalInt maxGrade = employee.getYearGrades().stream().map(i -> i++).mapToInt( i -> i).max();
								

		
		
// consider another set of Employees to demonestrate Composing behaviors
		
		// consider this is given
				Employee employee1 =  new Employee("sairam1");

				employee1.addGrade(10);
				employee1.addGrade(8);
				employee1.addGrade(2);
				employee1.addGrade(7);
				employee1.addGrade(7);

				employee1.setTrainingsAttended(4);
		
				Employee employee2 =  new Employee("sairam2");

				employee2.addGrade(3);
				employee2.addGrade(8);
				employee2.addGrade(5);
				employee2.addGrade(7);
				employee2.addGrade(7);

				employee2.setTrainingsAttended(4);
				
				Employee employee3 =  new Employee("sairam4");

				employee3.addGrade(9);
				employee3.addGrade(8);
				employee3.addGrade(7);
				employee3.addGrade(7);
				employee3.addGrade(5);

				employee3.setTrainingsAttended(8);
				
				gradeStream =   employee1.getYearGrades().stream();
				intGradeStream = gradeStream
								.mapToInt(i -> (employee1.getTrainingsAttended() > 5 & i < 10 ) ? i+1 : i);
				employee1.setLastYearMaxGrade(intGradeStream.max().getAsInt());
				
				gradeStream =   employee2.getYearGrades().stream();
				intGradeStream = gradeStream
								.mapToInt(i -> (employee2.getTrainingsAttended() > 5 & i < 10 ) ? i+1 : i);
				employee2.setLastYearMaxGrade(intGradeStream.max().getAsInt());
				
				gradeStream =   employee3.getYearGrades().stream();
				intGradeStream = gradeStream
								.mapToInt(i -> (employee3.getTrainingsAttended() > 5 & i < 10 ) ? i+1 : i);
				employee3.setLastYearMaxGrade(intGradeStream.max().getAsInt());
			
				
				
// Compare 2 employees on their max grade
				
		Comparator<Employee> empCompare = new Comparator<Employee>() {

			@Override
			public int compare(Employee emp1, Employee emp2) {
				// TODO Auto-generated method stub
				
				System.out.println(emp1.getLastYearMaxGrade() +" : "+ emp2.getLastYearMaxGrade());
				return Integer.compare(emp1.getLastYearMaxGrade(), emp2.getLastYearMaxGrade());
			}
			
		};		
		
		System.out.println(empCompare.compare(employee1, employee2)); 
		
// 		replace the anonymous inner class with lamda expression 
		
		
		Comparator<Employee> empCompareLamda =	
				(emp1, emp2) -> Integer.compare(emp1.getLastYearMaxGrade(), emp2.getLastYearMaxGrade());
				
// 		Here Compliler infers that the implementation is for compare();
				
		System.out.println(empCompareLamda.compare(employee1, employee2)); 
		
// 		there are 2 operations that we have performed, extracting the key and comparing the keys
//		If we want to compare the latest grade tan the max grade , the same comparator doent work
		
		
//		We go with lamda expression for both the operations -TBD
		
//		Function<Employee, Integer> key = emp1 -> emp1.
		
		
				
		}
	
	



}