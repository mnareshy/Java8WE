package Java8P.datahiding.we;

public class Test extends A{
	
	public Test(String one, String two) {
		
		super("");
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		
//		A.printStr();
		
		new Test("","").getA().printStr();
		
	}



}


class A{
	
	A(){}
	
	A(String one){
		
	}
	
	
	 A getA() {
		
		return this;
	}
	 public Number printStr() {
		
		System.out.println("abstract A");
		return 1;
		
	}
	
	
}

class B extends A{

	 public Integer printStr() {
			
		 
			System.out.println("abstract A");
			return 2;
			
		}
	
	
}


