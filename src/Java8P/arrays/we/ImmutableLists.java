package Java8P.arrays.we;

import java.util.Arrays;
import java.util.List;

public class ImmutableLists {

	public static void main(String[] args) {

		String[] strArray1 =  {"one","two","three","four","five","six", "seven","eight"};
		String[] strArray1dupe =  {"one","two","three","four","five","six", "seven","eight"};


		List strArray1ImmutableList = List.of(strArray1);
		List strArray1dupeImmutableList = List.copyOf(Arrays.asList(strArray1dupe));

		System.out.println("strArray1ImmutableList" + strArray1ImmutableList);
		System.out.println("strArray1dupeImmutableList.get(4) : " + strArray1dupeImmutableList.get(4));

//		Modification throws an exception

//		strArray1ImmutableList.set(2, "exception");
		
		
//		They dont allow nulls , attemting to create one will result in NullPointerException
//		List nullList = List.of(null,1,2,4);
		
			
		List<Employee> empList = List.of(new Employee("12", "payakari"), new Employee("24", "Bobbili Raja"));
		
		System.out.println(empList);
		
		empList.get(1).setName("Raja");
//	Note the List is still immutable , the Object in the array is mutable , so the change is appearing	
		System.out.println(empList);
	}
	
	
}

class Employee{
	
	Employee(String empId, String name){
		
		this.empId = empId;
		this.name = name;
	}
	
	String empId;
	String name;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + "]";
	}
	
	
}

