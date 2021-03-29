package Java8P.classesobjects.we;


public class InitilizationSeq {

	
	

	InitilizationSeq(){

		str3 = "Constructor Initilization" + str3;
	}
	
	

	{
		str2 = "Instance Inization block" + str1;
		// Note - Doesnt work as forward ref
		//		str2 = "Instance Inization block" + str3;
		str2 = "Instance Inization block" + this.str3;
		
		/*
		 * try { InitilizationSeq iS = new InitilizationSeq(); } catch(Exception e) {
		 * 
		 * System.out.println(e.getStackTrace());
		 * 
		 * }
		 */
		 
	}

	static {
		str1 = "static initilization" ;
		// Note - Doesnt work as forward ref
		//System.out.println(str1);

	}

	static String str1;
	String str2;
	String str3;

	public static void main(String[] args) {

		
		
		
		InitilizationSeq iS = new InitilizationSeq();

		System.out.println(str1 + " : "+iS.str2 +" : "+ iS.str3);
	}

}
