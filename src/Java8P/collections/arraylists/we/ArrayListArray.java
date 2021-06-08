package Java8P.collections.arraylists.we;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListArray {

	public static void main(String[] args) {

	
//		Generic List
		ArrayList<Integer> intList = new ArrayList<>(List.of(1,2,3,4,5,6,7,8));

		System.out.println(intList);

		var intVarArray = intList.toArray();

		System.out.println("var intVarArray = intList.toArray() " +intVarArray.getClass().getTypeName());

		System.out.println(Arrays.toString(intVarArray));

		Integer[] intArray = new Integer[12];

		var intVarArray1 = intList.toArray(intArray);

		System.out.println("var intVarArray1 = intList.toArray(intArray) : "+intVarArray1.getClass().getTypeName());
		System.out.println(Arrays.toString(intVarArray1));
		System.out.println(Arrays.toString(intArray));

		Integer temp = (Integer) intVarArray[0];
		// Casting Not Required
		Integer temp1 = intVarArray1[0];
		
// RAW List		
		ArrayList intRawList = new ArrayList(List.of(1,2,3,4,5,6,7,8));
		System.out.println(intList);
		intArray = new Integer[12];
		var intVarArray3 = intRawList.toArray(intArray);
		System.out.println("intVarArray1  - creating raw list : "+intVarArray3.getClass().getTypeName());
//	Casting required as the ArralyList is not generic
		temp = (Integer) intVarArray3[0];
		Integer[] intArray1= new Integer[] {1,2,3,4,5,6,7,8,9,10,11,12};
		var intVarArray4 = intRawList.toArray(intArray1);
		
		System.out.println("var intVarArray4 = intRawList.toArray(intArray1()) : "+ Arrays.toString(intVarArray4));

//		Note you when use toArray() you canot cast to subtypes
//		Integer[] intVarArray5 = (Integer[]) intList.toArray();
		Object[] intVarArray5 =  intList.toArray();
		
//		What if the array passed is smaller them the list
		
		Integer[] intArraySmall = new Integer[4];
		var intVarArray6 = intList.toArray(intArraySmall);
		
		System.out.println("intArraySmall -> intList.toArray(intArraySmall) :"+Arrays.toString(intArraySmall));
		System.out.println("var intVarArray6 = intList.toArray(intArraySmall) :" +Arrays.toString(intVarArray6));
		
//		var intVarArray7 = intList.toArray(new String[12]);
		var intVarArray7 = intList.toArray(new Number[12]);
//		Type is inferred by the type of parameter passed not by the type Associated with ArrayList
		System.out.println("Type is inferred by the type of parameter passed not by the type Associated with ArrayList : "+ intVarArray7.getClass().getTypeName());
		
				
	}

}
