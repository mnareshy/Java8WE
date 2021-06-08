package Java8P.collections.arraylists.we;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListAddSet {

	public static void main(String[] args) {

		List<String> strList = new ArrayList(List.of("STR1","STR2","STR3","STR4"));

		strList.add(strList.size(), "STR5");

		System.out.println(strList);
		strList.set(strList.size()-1, "STR7");

		//		Cannot set in a element that doesnt exit, But add only if one + size of the ArrayList
		//		strList.set(strList.size(), "STR6");
		//		Adding on more than 1+size element is not possible
		//		strList.add(strList.size()+1, "STR5");

		System.out.println(strList);

		List strRawList = new ArrayList(List.of("STR1","STR2","STR3","STR4"));
		List<String> strSomelList = new ArrayList(List.of("STR8","STR9","STR10","STR11","STR12"));

		strList.addAll(strList.size(), strSomelList);
		//		This is equivalent to strList.addAll(strSomelList);
		System.out.println(strList);


		strRawList.set(0, strSomelList);
		//		Watch the difference 	strRawList.set(0, strSomelList)  did not add elements to array, rather replaced index 0 :
		System.out.println("Watch the difference strRawList.set(0, strSomelList)  did not add elements to array, rather replaced index 0 :" +strRawList);

		//		In typed List, it doent not work as type missmatch of String with List
		//		strList.set(strList.size(), strSomelList);
		
		
		ArrayList<String> aList = new ArrayList();
//	expected that you cannot sent when no elements
//		aList.set(0, "0Element");
		ArrayList<String> aList1 = new ArrayList(12);
//		Still wont work as the array is not filled with elements
//		aList1.set(0, "0Element");
		
		
		ArrayList<Employee> empList = new ArrayList<>(List.of(new Employee("Soma"), new Employee("Lingam")));
		
		List<Employee> subEmpList =  empList.subList(0, 1);
		System.out.println(subEmpList);
		subEmpList.get(0).setName("sai");
		
		List empRawSubList =  empList.subList(0, 1);
		
//	Note this , Explicit Casting required to set even if the object is in Raw List
		((Employee) empRawSubList.get(0)).setName("sai");

	}
	
	
}

class Employee{
	
	public Employee(String name) {

		this.name = name;
	}
	
	String name;

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	
}
