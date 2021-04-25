package Java8P.methods.we;

public class StaticMethodsFields {

	public static void main(String[] args) {

		System.out.println("I am executing my StaticMethodsFields Stuff first");

		System.out.println(StaticWe.className);


		StaticWe staticWe = null;

		staticWe.someMethod();
		
//		Instance Method wont work
//		staticWe.someMethod1();

		StaticWe staticWe1 = new StaticWe();
		StaticWe staticWe2 = new StaticWe();
		StaticWe staticWe3 = new StaticWe();

		staticWe3.someMethod();


		//		staticWe2.someMethod();

	}

}

class StaticWe{

	public static String className = "StaticWe";
	public static int counter = 0;

	// Note : if the static varible is final and the invocation of this in caller wornt trigger the static initilizaer 
	//	public static final String className = "StaticWe";


	static {

		System.out.println("Inside static Initilizer");
		counter++;

	}

	static void someMethod() {
		counter++;
		System.out.println("inside someMethod() and counter "+ counter );
	}
	
	 void someMethod1() {
		counter++;
		System.out.println("inside someMethod() and counter "+ counter );
	}

}
