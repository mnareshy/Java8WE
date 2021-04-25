package Java8P.methods.we;

public class Constructors extends SuperClass {
	
	Constructors(String name){
		super(name);
		System.out.println("in Constructors "  + name); 
		
	}
	
	public static void main(String[] args) {
		
		new Constructors("sai");
		
		
	}

}

class SuperClass{
	
	/*
	 * public SuperClass() { // TODO Auto-generated constructor stub
	 * 
	 * System.out.println("Default Constructor"); }
	 */
	
	public SuperClass(String name) {
		// TODO Auto-generated constructor stub
		
		System.out.println("Arg Constructor " + name);
	}
	
//	note this is not Constructor! this is some method returning void
	 public void SuperClass(String name, String age) {
		// TODO Auto-generated constructor stub
//		this("");
		System.out.println("Arg Constructor " + name + "  "+age);
	}
}
