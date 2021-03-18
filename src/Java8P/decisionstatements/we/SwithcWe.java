package Java8P.decisionstatements.we;

public class SwithcWe {

	public static void main(String[] args) {

		String  flag = "true";


		switch(flag) {

		case "true":
			System.out.println("true case");

		case "false":
			System.out.println("false case");
			break;

		default:
			System.out.println("default case");


		}

		System.out.println();
		System.out.println();


		//		 Note what happens default position is different and and no break statement
		flag = "unknown";
		switch(flag) {

		default:
			System.out.println("default case");
		case "true":
			System.out.println("true case");
		case "false":
			System.out.println("false case");
		}

		int i = 12;

		switch(i) {

		case 1:
			System.out.println("case 1:");
			break;

		case 3*4:
			System.out.println(" case 3*4");
			break;
			/*
			 * Note this is not allowed
			 * case 12: System.out.println(" case 3*4"); break;
			 */
		} 



		i = 1;

		switch(i * 10) {

		case 10:
			System.out.println("case 10:");
			break;

		case 3*4:
			System.out.println(" case 3*4");
			break;
			/*
			 * Note this is not allowed
			 * case 12: System.out.println(" case 3*4"); break;
			 */
		} 

		en e;

		e = en.abc;

		switch(e) {

		case abc:
			System.out.println("case abc:");
			break;

		case bcd:
			System.out.println("case abc:");
			break;

		}


		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

		//		byte[] bArray = {100, 102, 103, 104};

		byte b1 = 100;

		switch (b1 * 10) {
		case 1000: 
			System.out.println("case 1000");
			break;
		case 1040:
			System.out.println("case 1040");
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + i *10);
		}

		// the following block will not work as b1 range is under the case type
		/*
		 * switch (b1) 
		 * { 
		 * case 1000: 
		 *   System.out.println("case 1000");
		 *   break; 
		 * case 1040:
		 *   System.out.println("case 1040"); 
		 *   break; 
		 * default: throw new IllegalArgumentException("Unexpected value: " + i *10); }
		 * 
		 */
		System.out.println();
		System.out.println();

		
//		Watch Continue in place of break
		byte[] bArray = {100, 102, 103, 104};

		for(var bytes : bArray) {
			
			
			switch (bytes * 10) {
			case 1000: 
				System.out.println("case 1000");
				continue;
			case 1020: 
				System.out.println("case 1020");
			case 1040:
				System.out.println("case 1040");
				break;
			default:
				System.out.println("default:" +bytes * 10);
			}
			
			System.out.println("  After Switch  ");
		}

		System.out.println();
		System.out.println();

		
		
//		Watch the label to get out the loop on a case
		byte[] bArray1 = {100, 102, 103, 104, 107, 109, 108};

		
		getout_for:
		for(var bytes : bArray1) {
			
			
			switch (bytes * 10) {
			case 1000: 
				System.out.println("case 1000 continue");
				continue;
			case 1020: 
				System.out.println("case 1020");
				
			case 1040:
				System.out.println("case 1040");
				break getout_for;
				
				
			case 1080:
				System.out.println("case 1080");
				break ;
				
			default:
				System.out.println("default:" +bytes * 10);
			}
			
			System.out.println("  After Switch  ");
		}
		System.out.println("  After Switch  ");
		System.out.println("  After Switch  ");
		System.out.println("  After Switch  ");
		System.out.println("  After Switch  ");
		

	}

	enum en {
		abc, bcd
	}

}
