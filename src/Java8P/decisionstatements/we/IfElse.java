package Java8P.decisionstatements.we;

public class IfElse {
	
	public static void main(String[] args) {
		
		boolean flag =false;
		
//		Common mistake
		
		if(flag = true)System.out.println("Flag is True");
		else System.out.println("Flag is False");
		
		flag =false;
		if(flag == true)System.out.println("Flag is True");
		else System.out.println("Flag is False");

//		With Operators
		
		boolean a = false;
		boolean b = false;
		boolean c = false;

//		|| operator excutes the right sige operent only if the left side Operand fails
		if((a = true) || (b = true) && (c = true));
		System.out.println("a - " +a + " b - " +b + " c - " +c);
		
		 a = false;
		 b = false;
		 c = false;
		
		if((a = true) && (b = true) || (c = true));
		System.out.println("a - " +a + " b - " +b + " c - " +c);
		
		
		
	}

}
