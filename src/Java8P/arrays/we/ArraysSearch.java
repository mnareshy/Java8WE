package Java8P.arrays.we;

import java.util.Arrays;
import java.util.List;

public class ArraysSearch{

	public static void main(String[] args) {


		String[] strArray1 =  {"one","two","three","four","five","six", "seven","eight"};
		String[] strArray1Dupe =  {"one","two","three","four","five","six", "seven","eight"};
		String[] strArray1DupeEle =  {"one","two","three","four","four","six", "seven","eight"};

		String[] strArray1sub =  {"one","two","three","four"};
		String[] strArray1SubPlus =  {"one","two","three","four","random"};

		String[] strArray1Unsorted =  {"four","three","two","one","random","five","six", "seven","eight"};


		//		Binary Search

		String key = "four";

		System.out.println("Arrays.binarySearch(strArray1, key)  returns the index of key(\"four\"): "+Arrays.binarySearch(strArray1, key));


		key = "twelve";
		System.out.println("Arrays.binarySearch(strArray1, key)  returns the index of key(\"twelve\") wihic is not in Array : "+Arrays.binarySearch(strArray1, key));

		key = "four";

		System.out.println("Arrays.binarySearch(strArray1DupeEle, key) where the result is unpredictable when duplicate elements presnt : "
				+Arrays.binarySearch(strArray1DupeEle, key));

		//		Note - For binary search we need to supply a sorted Array

		key = "seven";
		System.out.println("Arrays.binarySearch(strArray1Unsorted, key) where the result is unpredictable when Array is not Sorted : "
				+Arrays.binarySearch(strArray1Unsorted, key));

		//		Mismatch
		// mismatch returns the non-matching index where the prefix ends


		System.out.println();
		System.out.println();

		System.out.println("Arrays.mismatch(strArray1, strArray1Dupe) : "+Arrays.mismatch(strArray1, strArray1Dupe));
		System.out.println("Arrays.mismatch(strArray1sub, strArray1) : " + Arrays.mismatch(strArray1sub, strArray1));


		System.out.println();
		System.out.println();


		//		When you want to search in Unsorted Array suing the Lists are the good option

		List strArray1UnsortedList = Arrays.asList(strArray1Unsorted);
		key = "seven";
		System.out.println("strArray1UnsortedList.lastIndexOf(key) : "+strArray1UnsortedList.lastIndexOf(key));
		strArray1UnsortedList.set(2, key);
		System.out.println("strArray1UnsortedList.indexOf(key) : "+strArray1UnsortedList.indexOf(key));
		
			

		List strArray1List = Arrays.asList(strArray1);
		List psrtialStrArray1list = Arrays.asList("eight","seven");
		System.out.println("strArray1List.contains(key) : "+strArray1List.contains(key));
		//		Note - Order does not matter in partial array
		System.out.println("strArray1List.containsAll(psrtialStrArray1list) : "+strArray1List.containsAll(psrtialStrArray1list));


	}

}
