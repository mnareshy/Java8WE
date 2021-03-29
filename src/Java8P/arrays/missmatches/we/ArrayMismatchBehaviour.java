package Java8P.arrays.missmatches.we;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayMismatchBehaviour {

	public static void main(String[] args) {


		int[] intArray = new int[2];

		//		Note the types
		intArray[0] = new Integer(8);
		intArray[1] = 8;

		System.out.println("Arrays.toString(intArray) : "+Arrays.toString(intArray));


		long[] longArray = new long[2];
		longArray[0] = new Integer(8);
		longArray[1] = 8l;

		System.out.println("Arrays.toString(longArray) : "+Arrays.toString(longArray));


		//		  Long[] newLongArray = new int[2];
		//        Integer[] newIntegerArray = new int[2];

		int[] int1Array = {0, 1, 2, 3, 4};
		Integer[] integerArray = {0, 1, 2, 3, 4};

		//		Note - different types are not allowed in this method
		//		int misMatchedIndex = Arrays.mismatch(intArray, integerArray);
		//		boolean theSame = Arrays.equals(intArray, integerArray);
		//		int compared = Arrays.compare(intArray, integerArray);
		//

		System.out.println("\n---- Test methods with common super class");
		Number[] myNumberArray = {0, 1, 2, 4, 5};
		System.out.println("Arrays.mismatch(myNumberArray, integerArray) = "
				+ Arrays.mismatch(myNumberArray, integerArray));
		System.out.println("Arrays.equals(myNumberArray, integerArray) = "
				+ Arrays.equals(myNumberArray, integerArray));

		//		Comparer will not work as it hasnt implemented Comparable Inteface 
		//        int compare = Arrays.compare(myNumberArray, integerArray);


		System.out.println();
		System.out.println();


		//		Notice this , intList will not have array, rather it will have int Array at 0 indesx
		System.out.println(Arrays.toString(int1Array));
		List<int[]> intList = List.of(int1Array);

		System.out.println("List.of(int1Array) : " +intList);

		for(int i:intList.get(0)) {
			System.out.print(i);
		}

		System.out.println();

		List intList1 = List.copyOf(Arrays.asList(int1Array));
		List intList2 = List.of(intList1);


		System.out.println("List.copyOf(Arrays.asList(int1Array)) : "+intList1 );

		System.out.println("List.of(intList1) : "+ intList2);	

		System.out.println();
		System.out.println();

		//		Notic the difference between the 2 Lists, they are not same

		String[] strArray = {"one","two","three","four","five","six", "seven","eight"};

		List strArrayList1 = List.copyOf(Arrays.asList(strArray));
		List strArrayList2 = List.of(strArrayList1);

		System.out.println("List.copyOf(Arrays.asList(strArray)) : "+strArrayList1);
		System.out.println("List.of(strArrayList1) : "+strArrayList2);


		System.out.println();
		System.out.println();

		System.out.println("\n--------  subList example ---------");
		List subList = Arrays.asList(strArray).subList(0, 5);
		System.out.println("subList = " + subList);

		//	        subList1 is a immutable list as it sreflects to the original List
		//	        subList1.sort(Collections.reverseOrder()) is  not allowed as its immutable

		//	        List subList1 = strArrayList1.subList(0, 4);
		//	        subList1.sort(Collections.reverseOrder());

		// Sort the sublist
		subList.sort(Collections.reverseOrder());
		System.out.println("subList after reverse : "+ subList.toString());

		//	     See the original Array reflected with sublist changes
		System.out.println("original Array reflected with sublist changes array strArray : "
				+ Arrays.toString(strArray));
		//		     See the original Array reflected with sublist changes but not the Original List 
		//		System.out.println("strArrayList1 = " + strArrayList1.toString());

		strArray[0] = "one";
		// See the chnages to Array is reflcing in Sub List as its shallow copy	
		System.out.println("subList after strArray[0] = \"one\" : 	"+subList);

		// Now let's look at toArray
		System.out.println("\n--------  toArray examples ---------");
		int arrayLength = strArrayList1.size(); 
		// arrayLength changes results, if you send the size as less than Array , array passed is filled with nulls ,
		//		if the size is more then the remining elements will be filled with nulls
		//	        arrayLength = 5;
		//	        arrayLength = 20;


		// Set up a new array which we will pass to toArray
		String[] strNewArray = new String[arrayLength];
		System.out.println(strNewArray.length);

		// Calling toArray without assigning returned array to a variable;
		strArrayList1.toArray(strNewArray);
		System.out.println("strArrayList1.toArray(strNewArray) : " + Arrays.toString(strNewArray));

		// Set up another new array which we will pass to toArray
		String[] strNewArray1 = new String[arrayLength];

		// Calling toArray assigning returned array to a variable;
		String[] strNewArray2 = (String[]) strArrayList1.toArray(strNewArray1);
		System.out.println("String[] strNewArray2 = (String[]) strArrayList1.toArray(strNewArray1) -> strNewArray1: "
				+ Arrays.toString(strNewArray1));

		System.out.println("strNewArray2 : "+ Arrays.toString(strNewArray2));

		System.out.println("strNewArray2.equals(strNewArray1)) : "+ strNewArray2.equals(strNewArray1));
		System.out.println("strNewArray2.equals(strNewArray)) : "+ strNewArray2.equals(strNewArray));


		//	        Other ways of toArray

		System.out.println();
		System.out.println();

		System.out.println("************Other ways of toArray**************");

		System.out.println("Original List strArrayList1 :" +  strArrayList1);

		String[] tempArray = new String[0];

		//			Pass 0 lent array as argument to get exat size array
		String[] strNewArray4 = (String[])strArrayList1.toArray(tempArray);
		System.out.println("String[] strNewArray4 = (String[])strArrayList1.toArray(new String[0]) -> strNewArray4 :" +  Arrays.toString(strNewArray4));
		System.out.println("'0' lenght tempArray : " +  Arrays.toString(tempArray));


		Object[] objNewArray5 = strArrayList1.toArray();
		System.out.println("objNewArray5 :" +  Arrays.toString(objNewArray5));

		//			String[] objStrNewArray7 = (String[])objNewArray5;
		
		
		


	}

}
