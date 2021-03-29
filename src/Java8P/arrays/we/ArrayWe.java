package Java8P.arrays.we;

import java.util.Arrays;

public class ArrayWe {

	public static void main(String[] args) {

		String strings[] = null;

		strings = new String[20];

		String strings1[] = {"one","two"};
		String strings2[];

		// Watch it - initilization has to happen along with declaration
		//		strings2[] = {"one","two"};

		int[] arr1, arr2, arr3, arr4 = new int[20];

		// Watch it - only the last array initilized

		System.out.println(Arrays.toString(arr4));
		//		System.out.println(Arrays.toString(arr2));


		//		Note this statement initilizes all the arrays
		int[] arr5,arr6,arr7 = arr5 = arr6 = new int[20];
		System.out.println(Arrays.toString(arr6));

		//	not a valid statement, unlike the new operator
		//		int[] arr8,arr9 = arr8 =  {1,2,3,4};
		//		But the following statement initilizes only the last veriable
		int[] arr8,arr9 = {1,2,3,4};
		arr8 = new int[8];


		System.out.println();
		System.out.println();



		//  Valid multi dimention arrey		
		int[][] mulDArrya = {{1,2},{3,4}};
		System.out.println(Arrays.toString(mulDArrya[0]));

		// what what primitive conversion did not happen		
		//		Object[] o = new int[7];
		Object[] o = new Integer[7];


		// Valid as long as you dont declare the size
		int intarray[] = new int []{1,2,3,4};


		// Valid as long as you have size for the first array , but not for sec

		int[][] mdMatrix  = new int[12][];
		System.out.println(mdMatrix.length);


	}

}
