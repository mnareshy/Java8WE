package Java8P.datatype.string.we;


public class StringWe {

	public static void main(String[] args) {


		String str1 = "Hello";
		String str2 = "Hello";

		System.out.println(str1 == str2);

		String str3 = new String("Hello");
		System.out.println(str1 == str3);

		//	Note intern() method here

		str3 = str3.intern();
		System.out.println(str1 == str3);

		String str4 = new String("Hello").intern();
		System.out.println(str2 == str4);


		int lenght =  26;

		int count = 0;

		byte[] alphaBytes = new byte[lenght];
		int[] alphaIntes = new int[lenght];
		char[] alphaChars = new char[lenght];


		for (char chars = 'a'; chars < 'z'; chars++ ,count++) {

			alphaChars[count] = chars;
			alphaIntes[count] = (int)chars;
			alphaBytes[count] = (byte)chars;


		}



		String charStr = new String(alphaChars);
		System.out.println(charStr);
		
		
		String byteStr = new String(alphaBytes);
		System.out.println(byteStr);
		
		
// this does not work for Integer		
//		String intStr = new String(alphaIntes);
		
		
		short offset = 0;
		String intStr = new String(alphaIntes,offset,lenght);
		System.out.println(intStr);
		
		
		offset = 3;
		intStr = new String(alphaIntes,offset,lenght-offset);
		System.out.println(intStr);
		

		// with bytes passing you can specify the chareter set as well
		offset = 4;
		intStr = new String(alphaBytes,offset,lenght-offset, java.nio.charset.StandardCharsets.ISO_8859_1);
		System.out.println(intStr);
		
		




	}

}
