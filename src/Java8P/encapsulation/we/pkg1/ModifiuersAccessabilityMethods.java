package Java8P.encapsulation.we.pkg1;

public class ModifiuersAccessabilityMethods {
	
	public static void main(String[] args) {
		
		SuperClass1 superSubClass1 = new SubClass1();
		
		superSubClass1.publicMethod();
		superSubClass1.protectedMethod();
		superSubClass1.defaultMethod();
//		superSubClass1.privateMethod();
		
		
	}

	
	
}

class SuperClass1{
	
	private void privateMethod() {
		
		System.out.println("privateMethod");
		
	}

	public void publicMethod() {
		
		System.out.println("publicMethod");
		
	}

	void defaultMethod() {
		
		System.out.println("defaultMethod");
		
	}

	protected void protectedMethod() {
		
		System.out.println("protectedMethod");
		
	}
	
	
}

class SubClass1 extends SuperClass1{
	
public void privateMethod() {
		
		System.out.println("privateMethod SubClass1 public");
		
	}

// Note : Cannot reduce the viability
	
	/*
	 * private void publicMethod() {
	 * 
	 * System.out.println("publicMethod SubClass1");
	 * 
	 * }
	 */

	protected void defaultMethod() {
		
		System.out.println("defaultMethod SubClass1");
		
	}
	// Note : Cannot reduce the viability
	/*
	 * void protectedMethod() {
	 * 
	 * System.out.println("protectedMethod SubClass1");
	 * 
	 * }
	 */
	
}

