package Java8P.arrays.we;

import java.util.Arrays;
import java.util.List;

public class ArrayComparisions {

	public static void main(String[] args) {

		String[] strArray1 =  {"one","two","three","four","five","six", "seven","eight"};
		String[] strArray1dupe =  {"one","two","three","four","five","six", "seven","eight"};

		System.out.println("strArray1.equals(strArray1dupe) : " + strArray1.equals(strArray1dupe) +
				"  Because strArray1.toString()" + strArray1.toString() +" and  Because strArray1dupe.toString() " +strArray1dupe.toString());

		System.out.println("strArray1.equals(strArray1dupe) : " + Arrays.equals( strArray1,strArray1dupe) +
				"  Because Arrays.toString(strArray1)" + Arrays.toString(strArray1) +" and  Because Arrays.toString(strArray1dupe) " +Arrays.toString(strArray1dupe));

		System.out.println();
		System.out.println();

		String[] strArray1Ref = strArray1;

		System.out.println("strArray1.equals(strArray1Ref) : " + strArray1.equals(strArray1Ref) +
				"  Because strArray1.toString()" + strArray1.toString() +" and " +strArray1Ref.toString());

		System.out.println("strArray1.equals(strArray1Ref) : " + Arrays.equals( strArray1,strArray1Ref) +
				"  Because Arrays.toString(strArray1)" + Arrays.toString(strArray1) +" and  Because Arrays.toString(strArray1Ref) " +Arrays.toString(strArray1Ref));



		System.out.println();
		System.out.println();
		System.out.println("strArray1 : "+Arrays.toString(strArray1));
		strArray1Ref[0] = "okati"; 
		System.out.println("strArray1 : "+Arrays.toString(strArray1) +" after altering strArray1Ref[0] = \"okati\";");



		System.out.println();
		System.out.println();


		System.out.println("\n************ Arrays.compare() *************");
		//		Compre methods
		strArray1Ref[0] = "one"; 
		System.out.println("Arrays.compare(strArray1, strArray1dupe) : "+Arrays.compare(strArray1, strArray1dupe));
		System.out.println("Arrays.compare(strArray1, strArray1Ref) : "+Arrays.compare(strArray1, strArray1Ref));


		String[] strArray1sub =  {"one","two","three","four"};
		String[] strArray1SubPlus =  {"one","two","three","four","random"};
		String[] nullArray = null;
		String[] lenght0Array = {};


		System.out.println("Arrays.compare(strArray1, strArray1sub) : "+Arrays.compare(strArray1, strArray1sub));
		System.out.println("Arrays.compare(strArray1sub, strArray1) : "+Arrays.compare(strArray1sub, strArray1));

		System.out.println();
		System.out.println();

		System.out.println("Arrays.compare(strArray1, strArray1SubPlus) : "+Arrays.compare(strArray1, strArray1SubPlus));
		System.out.println("Arrays.compare(strArray1SubPlus, strArray1) : "+Arrays.compare(strArray1SubPlus, strArray1));

		System.out.println();
		System.out.println();

		System.out.println("Arrays.compare(strArray1, nullArray) : "+Arrays.compare(strArray1, nullArray));
		System.out.println("Arrays.compare(nullArray, strArray1) : "+Arrays.compare(nullArray, strArray1));
		System.out.println("Arrays.compare(strArray1, lenght0Array) : "+Arrays.compare(strArray1, lenght0Array));
		System.out.println("Arrays.compare(lenght0Array, strArray1) : "+Arrays.compare(lenght0Array, strArray1));


		System.out.println();
		System.out.println();

		String[] strArray1Unsorted =  {"four","three","two","one","random","five","six", "seven","eight"};

		System.out.println("Arrays.compare(strArray1,4,7, strArray1Unsorted,5,8) : " + Arrays.compare(strArray1,4,7, strArray1Unsorted,5,8));

		System.out.println();
		System.out.println();

		List<String> strArray1List = Arrays.asList(strArray1);
		List<String> strArray1dupeList = Arrays.asList(strArray1dupe);


		//		Watch this - List has override of equals
		System.out.println("strArray1List.equals(strArray1dupeList) : "+strArray1List.equals(strArray1dupeList));




	}



}
