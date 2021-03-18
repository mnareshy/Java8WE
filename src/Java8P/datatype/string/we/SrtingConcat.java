package Java8P.datatype.string.we;

public class SrtingConcat {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "World";

		System.out.println(str1 + str2);

		Object nullObj = null;

		System.out.println(nullObj + str2);

		int i = 22;

		System.out.println(i + str2);

		int i1 = 24;


		System.out.println(i + i1 + "  " + (2 + 2) );
		System.out.println(i + i1 + "  " + 2 + 2 );
		System.out.println("" +i + i1 );

		Object obj =  new Object();

		obj += str1;

		System.out.println(obj);
		//		More surpricing
		System.out.println(obj.toString() );

		int i2 = 12;

		//	Not allowed	
		//		i2 += str1;

		str1 += i2; 
		System.out.println(str1);

		str1 = "Hello";

		//		 += behaves differently , watch
		str1 += i1 + i2;
		System.out.println("Wared Behaviour ! "+str1);
		
		str1 = "Hello";
		str1 = str1 +  i1 + i2;
		System.out.println("Expected Behaviour ! "+str1);
		
		str1 = "Hello";
		str1 = str1 + ( i1 + i2);
		System.out.println("Expected Behaviour ! "+str1);
		
		



	}

}
