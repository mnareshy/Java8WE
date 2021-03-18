package Java8P.lvti.we;

import java.util.ArrayList;
import java.util.Arrays;

// Var is allowed as class name
public class Var {
	
	public static void main(String[] args) {
		
		var var = new ArrayList<String>(Arrays.asList("one", "two", "three", "four"));
		
		System.out.println(var);
		
		var(var);
	}

	private static void var(ArrayList<String> var) {
		// TODO Auto-generated method stub
		
		var vars = var;
		
		System.out.println(vars);
		
		var i = 0;
		
		for(var x : vars) {
			
			i++;
			System.out.println(i);
			System.out.print(x);
			
		}
		
	}

}
