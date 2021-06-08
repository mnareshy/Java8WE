package Java8P.lamdas.we;

public class LamdaWe {
	
	public interface UniraryOperatorCalculator{
		
		int calc(int number);
		
	}
	
	public static void main(String[] args) {
		
		UniraryOperatorCalculator incrementByOne = number -> number +1;
		UniraryOperatorCalculator incrementByTwo = (int number) -> number +2;
		
		calculator(incrementByOne, 7);
		calculator(incrementByTwo, 12);
		
		
	}
	
	public static void calculator(UniraryOperatorCalculator uoc, int number) {
		
	System.out.println("uoc.calc(number)  : " +uoc.calc(number));
		
		
	}

}
