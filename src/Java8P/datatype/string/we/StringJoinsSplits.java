package Java8P.datatype.string.we;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringJoinsSplits {
	
	public static void main(String[] args) {
		
		String[] wordArray = new String[] {"Hello" , "guru" ,"prema","kosamera", "jeevitam"};
		
		String sentance = "";
		for(String word : wordArray) sentance += " "+word;
				
		System.out.println(sentance);
		
		
		sentance = String.join(" ", "Hello", "World", "How", "are", "you");
		System.out.println("->"+sentance);
		
		sentance = String.join(":", wordArray);
		System.out.println(sentance);
		
		List wordArrayList =  new ArrayList<String>(Arrays.asList(wordArray));
		sentance = String.join("-", wordArrayList);
		System.out.println(sentance);
		
		
		
//		Split
		
		String[] recoverWordArray = sentance.split("-");
		System.out.println("sentance.split(\"-\")  " + Arrays.toString(recoverWordArray));
				
		sentance = String.join("\u0020\t\u0020\n", wordArray);
		System.out.println("String.join(\"\\u0020\\t\\u0020\\n\", wordArray)   : \n"+sentance);
		
		recoverWordArray = sentance.split("\\s+");
		System.out.println("Arrays.toString(recoverWordArray) -> "+Arrays.toString(recoverWordArray));
		

//		Interesting - Split happens to the limt 2
		
		recoverWordArray = sentance.split("\\s+", 2);
		System.out.println("Split happens to the limt 2  "+Arrays.toString(recoverWordArray));
		
		String line = 	"PROPERTY_1 one";
		String property  = line.split("\\s")[1];
		
		System.out.println("line.split(\"\\\\s\")[1]  -> "+property);
		
		
	}

}
 