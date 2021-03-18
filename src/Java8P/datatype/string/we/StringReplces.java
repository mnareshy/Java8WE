package Java8P.datatype.string.we;

public class StringReplces {


	public static void main(String[] args) {


		String mississippi = "Mississippi";
		
		String str1 = mississippi.replace("s", "S");
		System.out.println(str1);
		
		str1 = mississippi.replace("iss", "IPS");
		System.out.println(str1);

		str1 = mississippi.replaceAll("(i(s|p){2})", "**");
		System.out.println(str1);
		
		
//		Substring
		
		str1 = mississippi.substring(2);
		System.out.println(str1);
		
		str1 = mississippi.substring(2,4);
		System.out.println(str1);
		
//		Watchout : here the last parameter is not EXCLUSIVE index rather number of chars 
		
		String newStr1 = new String(mississippi.toCharArray(), 2,2);
		System.out.println("SubString using COnstructor :" + newStr1);
		
		newStr1 = String.valueOf(mississippi.toCharArray(), 2,2);
		System.out.println("SubString using valueOf :" + newStr1);
		
// 		subsequence - it requires both starting and ending indexes , can be used on StringBuilder as well & Returns CharSequence not String
		
		str1 = (String) mississippi.subSequence(2,4);
		System.out.println(str1);
		
		
	}

}
