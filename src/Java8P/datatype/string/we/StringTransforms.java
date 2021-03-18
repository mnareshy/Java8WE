package Java8P.datatype.string.we;

public class StringTransforms {

	public static void main(String[] args) {

		String str1 = "Devuda Devudaa!";
		String str0 = str1.repeat(0);
		//		Lookout :
		System.out.println("Empty ? "+str0);


		String str2 = str1.repeat(1);
		System.out.println(str2);

		str1 = "Devuda Devudaa!  ";

		// trim() , strip()

		System.out.println(str1.stripLeading());
		System.out.println(str1.stripTrailing());
		str1 = "Devuda Devudaa!  ";
		System.out.println(str1.strip());
		System.out.println(str1.trim());
	}

}
