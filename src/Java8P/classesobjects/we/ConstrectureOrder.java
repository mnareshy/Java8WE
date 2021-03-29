package Java8P.classesobjects.we;

public class ConstrectureOrder extends SuperClass {
	
	ConstrectureOrder(){

		this("calling this()");
		
		
	}
	
	ConstrectureOrder(String overLMessage){
		
		System.out.println("ConstrectureOrder : "+overLMessage);
		
	}
	
	
	{
		System.out.println("ConstrectureOrder Initilizer");
	}
	
	static {
		
		System.out.println("ConstrectureOrder static Initilizer  SURPRISE");
		
	}
	
	public static void main(String[] args) {
		
		ConstrectureOrder constrectureOrder = new ConstrectureOrder();
		System.out.println("ConstrectureOrder main");
	}	
	
	

}

class SuperClass{
	
	
	SuperClass(){
		
		System.out.println("SuperClass Constrecture");
	}
	
	{
		System.out.println("SuperClass Initilizer");
	}
	
	static {
		
		System.out.println("SuperClass static Initilizer");
		
	}
	
}