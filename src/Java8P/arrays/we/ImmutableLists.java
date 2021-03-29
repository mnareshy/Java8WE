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

		strArray1ImmutableList.set(2, "exception");		
		
		
		
	}

}
