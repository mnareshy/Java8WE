package Java8P.arrays.multidimention.we;

import java.util.Arrays;

public class MDimensionArray {

	public static void main(String[] args) {

		int[][] int2DArray = new int[2][8];


		for (int row = 0; row < int2DArray.length; row++) {

			System.out.println(int2DArray + " : " + int2DArray[row] + " : Row "
					+ (row + 1) + " :  " + Arrays.toString(int2DArray[row]));
		}

		int2DArray[0][0] =1;
		int2DArray[1][1] =1;

		System.out.println("Arrays.deepToString( int2DArray) : "+Arrays.deepToString( int2DArray));

		int[][][] int3DArray = new int[2][2][2];
		System.out.println("Arrays.deepToString( int3DArray) : "+Arrays.deepToString( int3DArray));

		int[][] asyArray = {{1,2,3,4},{1,2,3},{1,2},{1}};
		System.out.println("Arrays.deepToString( asyArray) : "+Arrays.deepToString( asyArray));


		int[][] clonedIntArray = int2DArray.clone();

		System.out.println("Arrays.deepToString( clonedIntArray) : "+Arrays.deepToString( clonedIntArray));
		int2DArray[0][0] =2;
		int2DArray[1][1] =4;

		//		Note  - original array changes reflcing in cloned as its shallow copy
		System.out.println("Arrays.deepToString( clonedIntArray) : "+Arrays.deepToString( clonedIntArray));

		int[][] copiedIntArray = Arrays.copyOf(int2DArray, int2DArray.length);
		System.out.println("Arrays.deepToString( copiedIntArray) : "+Arrays.deepToString( copiedIntArray));
		int2DArray[0][0] =8;
		int2DArray[1][1] =8;
		//		Note  - original array changes reflcing in cloned as its shallow copy
		System.out.println("Arrays.deepToString( copiedIntArray) : "+Arrays.deepToString( copiedIntArray));
		
		System.out.println();
		System.out.println();
		
//		Convert Shallow into Deep
		
		for (int i = 0; i < clonedIntArray.length; i++) {
			
			clonedIntArray[i] = clonedIntArray[i].clone();
			
		}
		System.out.println("Deep Copy :Arrays.deepToString( clonedIntArray) : "+Arrays.deepToString( clonedIntArray));
		int2DArray[0][0] =2;
		int2DArray[1][1] =4;

		//		Note  - original array changes are not reflcing in cloned as its shallow copy
		System.out.println("Deep Copy :Arrays.deepToString( clonedIntArray) : "+Arrays.deepToString( clonedIntArray));
		
		
		

	}

}
