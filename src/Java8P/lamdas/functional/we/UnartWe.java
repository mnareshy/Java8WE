package Java8P.lamdas.functional.we;

import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class UnartWe {
	
	public static void main(String[] args) {
		
		
		IntUnaryOperator intUnirary = a -> a*a;
		
		calculator(intUnirary, 12);
		
		
	}
	
	public static void calculator(IntUnaryOperator intUnirary, int i) {
		
		System.out.println(intUnirary.applyAsInt(i)); 
	}

}
