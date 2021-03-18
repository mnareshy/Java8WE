package Java8P.datatype.string.we;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextSearch {

	public static void main(String[] args) {


		String paragh = "Fire Fires the Fire. if you Fire the Fire !. I am the Fire :)";

		String key = "Fire";

		System.out.println("Find Fire Last Index : " +paragh.lastIndexOf(key) );

		//		from the offset it serches forwards
		System.out.println("Find Fire Last Index with offset : " +paragh.lastIndexOf(key, 5) );
		System.out.println("Find Fire Last Index with offset 17 : " +paragh.lastIndexOf(key, 10) );

		//		another Interesting one , even if you set the offset from the middle of the word the result is same

		//		 * @param   fromIndex   the index to start the search from. is WRONG
		System.out.println("Find Fire Last Index with offset 20 : " +paragh.lastIndexOf(key, 20) );
		System.out.println("Find Fire Last Index with offset 17 : " +paragh.lastIndexOf(key, 17) );


		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();


		String mississippi = "mississippi";
		boolean matches = mississippi.matches("miss");
		System.out.println(matches);
		
		
		System.out.println("Matches cannot match unless its whole word ! but indexOf works  " + (mississippi.indexOf("miss") > -1));
		
		matches = mississippi.matches("mississippi");
		System.out.println(matches);
		
		matches = mississippi.matches("^miss(.*)");
		System.out.println(" '^miss(.*)' :" +matches);
		
		matches = mississippi.matches("miss(.*)");
		System.out.println(" 'miss(.*)' :" +matches);
		
		matches = mississippi.matches("(.*)iss(.*)");
		System.out.println(" '.*iss.*' :" +matches);
		
		// You can use Pattern & Matcher to do the same thing...
		Pattern p = Pattern.compile("(.*)iss(.*)");
		Matcher m = p.matcher(mississippi);
		System.out.println("Pattern & Matcher give same result, matches on '(.*)iss(.*)' = " + m.matches());
		
		
//		using regionMathes 
		System.out.println(mississippi.regionMatches(0, "miss", 0, 4));
		System.out.println(mississippi.regionMatches(2, "miss", 2, 2));
		
		mississippi = "MISSISSIPPI";
		System.out.println(mississippi.regionMatches(2, "miss", 2, 2));
		System.out.println(mississippi.regionMatches(true,2, "miss", 2, 2));
		
		
		
		



	}

}
