package Java8P.methods.we;

import java.util.Arrays;

public class OverLoads {

	public static void main(String[] args) {

		OverLoads overLoads = new OverLoads();

		overLoads.callMethod(12);
		overLoads.callMethod(new Integer(12));

		// Note - The method callMethod(int... i) is ambiguous for the type OverLoadscallMethod(Integer... i)
//		overLoads.callMethod(12,12);

		// if you dont use 12l ! (12)it will invoke the var v args one
		overLoads.callMethod(12,12l);
		overLoads.callMethod(12,Long.valueOf(12l));
		overLoads.callMethod(12,12.12);

		//		this will wor if private void callMethod(int i, Double d) should have primitive used
		//		overLoads.callMethod(12,12.12f);
		//		overLoads.callMethod(12,Float.valueOf(12.12f));

		overLoads.callMethod(new int[] { 12, 12 });
		overLoads.callMethod(new Integer[] { 12, 12 });

	}

	//	if you commentg this method - overLoads.callMethod(12); invokes long ! as in first phase it ignored autoboxing
	private void callMethod(int i) {

		System.out.println("in int" + i);

	}

	//overLoads.callMethod(12,12); will only invoke this if Long is primitive long.
	private void callMethod(int i, Long l) {

		System.out.println("int i, Long l " + i +" "+l);

	}

	/*
	 * private void callMethod(int i, long l) {
	 * 
	 * System.out.println("int i, long l " + i +" "+l);
	 * 
	 * }
	 */

	private void callMethod(int i, Double d) {

		System.out.println("int i, Double d " + i +" "+d);

	}



	private void callMethod(Integer i) {

		System.out.println("in Integer" + i);
	}

	private void callMethod(long i) {

		System.out.println("in long" + i);
	}


	private void callMethod(Object i) {

		System.out.println("in Object" + i);
	}

	private void callMethod(Number i) {

		System.out.println("in Number" + i);
	}

	private void callMethod(int... i) {

		System.out.println("in int..." + Arrays.toString(i));
	}
	
	
	
	
	private void callMethod(int i, long... i1) {
		  
		  System.out.println("int i, long... i1 " +i +"  "+ Arrays.toString(i1));
		  
	}

	
	  private void callMethod(int i, int... i1) {
	  
	  System.out.println("int i, int... i1 " +i +"  "+ Arrays.toString(i1)); }
	 

	
	  private void callMethod(Integer... i) {
	  
	  System.out.println("in Integer..." + Arrays.toString(i));
	  
	  }


	  
	 


}
