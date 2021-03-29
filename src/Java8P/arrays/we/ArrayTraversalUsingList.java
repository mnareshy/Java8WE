package Java8P.arrays.we;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayTraversalUsingList {

	public static void main(String[] args) {

		String[] strArray1 =  {"one","two","three","four","five","six", "seven","eight"};
		String[] strArray1dupe =  {"one","two","three","four","five","six", "seven","eight"};

		List strArray1List = Arrays.asList(strArray1);
		for (Iterator iterator = strArray1List.iterator(); iterator.hasNext();) {
			String str = (String) iterator.next();
			System.out.println(str);

		}

		List strArray1dupeList = Arrays.asList(strArray1dupe);

		ListIterator<String> lItarator = strArray1dupeList.listIterator();


		for (;lItarator.hasNext();) {
			String str = (String) lItarator.next();

			if(str.equals("seven")) {
				str = (String) lItarator.previous();
				System.out.println("ListIterator : "+str);
				lItarator.next();

			}

			System.out.println("ListIterator : "+str);
		
		}
		

		for (;lItarator.hasPrevious();) {
			String str = (String) lItarator.previous();

			if(str.equals("two")) {

				for (;lItarator.hasNext();) {

					System.out.println(lItarator.next());
				}
				
				
			
			}

			System.out.println("ListIterator : "+str);

			
		}






	}

}
