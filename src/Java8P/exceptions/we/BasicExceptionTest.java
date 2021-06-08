package Java8P.exceptions.we;

import java.io.IOException;

public class BasicExceptionTest {

	public static void main(String[] args) {


		try {

			//		  throw new NullPointerException();

			Integer[] intArray = new Integer[-12];
			throw new IOException();
			

		}catch (ArrayIndexOutOfBoundsException | IOException  e) {
			// TODO: handle exception
			
			System.out.println("Do Nothing  | can be used to have multiple exceptions in one catch");
			
//			e = new Exception();  - when multiple Exceptions used -  implicitly parameter becomes final
//		 ArrayIndexOutOfBoundsException | IOException 	- a common parent exception of r2 parameters are not allowed
		}
		catch (NegativeArraySizeException  e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e);
			printHirarchy(e.getClass());
		}

		catch (Exception e) {
			// TODO: handle exception
		System.out.println("***************");
			e.printStackTrace();
			System.out.println(e + " exception e ");
			printHirarchy(e.getClass());
//			e = new Exception();
		}
		
		/*
		 * 
		 * catch (Throwable e) { // TODO: handle exception }
		 * 
		 * catch (Error e) { // TODO: handle exception }
		 * 
		 */
		
		finally {
			System.out.println( " Finallye e ");
			
		}
	}
	


	public static void printHirarchy(Class className) {

		Class parent = className;
		String prefix = "--";


		do {

			prefix += "--";
			System.out.println(prefix+parent);
			parent =  parent.getSuperclass();


		}
		while(parent != null);
	}

}
