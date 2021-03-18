package Java8P.datatype.string.we;

public class StringComparisions {


	public static void main(String[] args) {

		String str1 = "A New String";
		String str2 = "A New String";

		
		System.out.println("str2.contentEquals(new StringBuffer(str1))  ->" + str2.contentEquals(new StringBuffer(str1)));
		//		 with == comparator

		System.out.println(str1==str2);
		System.out.println("null == ? :"+ (null==str2));

		//		Playing with null - Watchout

		String nullString = null;
		Object str7 = null;
		String str6 = new String("A New String");

		System.out.println("null String == ? :"+ (nullString==null));

		//	No Exceptions with the == operator
		System.out.println("null String == String :"+ (nullString==str2));
		System.out.println("String == null Strin :"+ (str2==nullString));

		// whatch out therse versions// whatch out therse versions

		try {
			System.out.println(String.format(" ----> %s.equals(%s) = " +
					(nullString.equals(str6)), nullString, str6));

		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

		System.out.println(String.format(" ----> %s.equals(%s) = " +
				(str6.equals(nullString)), str6, nullString));



		try {
			System.out.println(String.format("contentEquals with null ref %s.contentEquals(%s) = " +
					(nullString.contentEquals(str6)), nullString, str6));



		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

		try {

			System.out.println(String.format("contentEquals with null parameter %s.contentEquals(%s) = " +
					(str6.contentEquals(nullString)), str6, nullString));


		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}


		try {

			System.out.println(String.format("compareTo with null parameter %s.contentEquals(%s) = " +
					(str6.compareTo(nullString)), str6, nullString));


		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("compareTo with null parameter"+e);
		}
		// whatch out therse versions	 END


		String str3 = new String("A New String");
		String str4 = new String("A New String");
		String str5 = new String("a new string");

		//		 with == comparator , look at System.out.println("== Operator with litrels : " + str1 == str2); - give an iun predictable result

		System.out.println("== Operator with litrels : " + str1 == str2);
		System.out.println("== Operator with litrels : " + (str1 == str2));

		System.out.println("== Operator with Object & litrels : " + (str2==str3));
		System.out.println(".equals with Object & litrels : " + str2.equals(str3));
		System.out.println(".equals with Objects : " + str3.equals(str4));
		System.out.println(".equalsIgnoreCase with Objects : " + str4.equalsIgnoreCase(str5));


		//		Content Equals

		char []charsStr = {'A',' ','N','e','w',' ','S','t','r','i','n','g'};
		System.out.println(charsStr);
		System.out.println(" Look out :charsStr : "+ (charsStr));

		System.out.println("contentEquals : " + str4.contentEquals(str2));

		//		compareTo

		System.out.println("compareTo : " + str4.compareTo(str2));
		System.out.println(String.format("%s.compareTo(%s) : " + str4.compareTo(str2), str4, str2));
		System.out.println("Watchout : Object vs Object compareTo : " + str3.compareTo(str4));





	}



}
