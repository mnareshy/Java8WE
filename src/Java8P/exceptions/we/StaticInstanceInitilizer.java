package Java8P.exceptions.we;

import java.io.IOException;

public class StaticInstanceInitilizer {

	static {

		try {

			someMethod();
		}
		catch (Exception e) {

			System.out.println(" Subsadize in Catch Bro - Ya will Do! remembetr i am mandatory in static blocks to recover from Errors");
		}
		finally {
			System.out.println(" Subsadize in FInally Bro - Sorry Yo with out catch i cant!");
		}
	}

	public static void someMethod() {
		int i = 10/0;
	}

	public  void someInstanceMethod() {
		int i = 10/0;
	}

	{
		//		someInstanceMethod();
		int i = 0;
		if(i == 0)
			throw new IOException("Instance Methods can be either handled with Try / Catch or throws clause in constructor");

	}
	
	{
		int i = 0;
//		Initilized exceptions are no halt the program
		if(i == 0)
		throw new RuntimeException(" Whoops RuntimeException");
	}

	StaticInstanceInitilizer() throws IOException {

	}

	//	Every constructor must throw Exception
	StaticInstanceInitilizer(String param) throws IOException {

	}
	
	
	public static void main(String[] args) throws IOException {

		StaticInstanceInitilizer staticInstanceInitilizer = new StaticInstanceInitilizer();

	}

}
