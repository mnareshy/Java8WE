package Java8P.arrays.we;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArrayDataManuplation {

	public static void main(String[] args) {


		String strArray1[] =  new String[12];

		System.out.println("strArray1 : " + Arrays.toString(strArray1));

		//		fill method

		Arrays.fill(strArray1, "sai");

		System.out.println("strArray1 -> Arrays.fill(strArray1, \"sai\") : " + Arrays.toString(strArray1));

		Arrays.fill(strArray1,4,8, "ram");

		System.out.println("strArray1 -> Arrays.fill(strArray1,4,8, \"ram\"): " + Arrays.toString(strArray1));

		//		setAll


		int[] intArray = new int[12];
		System.out.println("intArray : "+Arrays.toString(intArray));

		Arrays.setAll(intArray, (index)->index+1);
		System.out.println("intArray ->Arrays.setAll(intArray, (index)->index+1) : "+Arrays.toString(intArray));

		
		Arrays.parallelSetAll(intArray, index-> 
		{ 
			if (index % 2 == 0) 
				return 0; 
			else
				return ++index; 
		}); 

		System.out.println("intArray ->Arrays.setAll(intArray, (index)->index+1) : "+Arrays.toString(intArray));
		
//		sort
		
		Arrays.sort(strArray1);
		
		System.out.println("Arrays.sort(strArray1) : "+Arrays.toString(strArray1));
		
		Arrays.sort(strArray1, Collections.reverseOrder());
		System.out.println("Arrays.sort(strArray1, Collections.reverseOrder()) : "+Arrays.toString(strArray1));
		
		
		Arrays.parallelPrefix(strArray1, (left, right) -> left + right);
		System.out.println("Arrays.parallelPrefix(strArray1, (left, right) -> left + right) : "+Arrays.toString(strArray1));
		
		System.out.println(Arrays.toString(intArray));
		
		
		
		Arrays.parallelPrefix(intArray, (left, right) -> 
		{
			return right < left ? left : right;
			
		});
		
		
		System.out.println(Arrays.toString(intArray));
		
		
		
		
	}

}
