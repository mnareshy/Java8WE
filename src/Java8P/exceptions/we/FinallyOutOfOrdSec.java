package Java8P.exceptions.we;

import java.io.IOError;
import java.io.IOException;

public class FinallyOutOfOrdSec {
	
	public void someMethod() {
		
		try {
			
			throw new IOException();
			
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("In Exception");
			throw new IOException("IO");
			
		}
		finally {
			
System.out.println(" Anyhow i will be executed - So  new IOException(\"IO\"); doest throw compile error for not handling Exceprion");
			throw new RuntimeException("RuntimeException");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		FinallyOutOfOrdSec finallyOutOfOrdSec = new FinallyOutOfOrdSec();
		
		finallyOutOfOrdSec.someMethod();
		
	}

}
