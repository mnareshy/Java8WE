package com.java8.fp.we.streams;

import java.util.ArrayList;
import java.util.Collections;
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
		
	/*	IntStream  intGradeStream1 = employee.getYearGrades().stream()
				.mapToInt(i -> (employee.getTrainingsAttended() > 5 & i < 10 ) ? i+1 : i);
		
		employee.setLastYearMaxGrade(intGradeStream1.max().getAsInt());
		
*/
		
//		OptionalInt maxGrade = employee.getYearGrades().stream().map(i -> i++).mapToInt( i -> i).max();
								
		
		
		}
	
	



}
