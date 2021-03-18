package Java8P.lvti.we;

public class VarWe {

	//	public var i = 1;
	//	public static var  j = 1; 


	public static void main(String[] args) {

		SampleUntintentialLongNamedClass sampleUntintentialLongNamedClass = new SampleUntintentialLongNamedClass("TestName");

		System.out.println(sampleUntintentialLongNamedClass);


		var sampleUntintentialLongNamedClass1 = new SampleUntintentialLongNamedClass("TestName");

		System.out.println(sampleUntintentialLongNamedClass1 instanceof SampleUntintentialLongNamedClass);
		System.out.println(sampleUntintentialLongNamedClass1);

		var var = 0;

		var i = 1;
		//		System.out.println(i instanceof Integer);

		//		not allowed
		//		var k = 0, l = 1;

		short s = 1;
		var s1 = +s; // s1 is inferref as int 




		var string = "String ";
		System.out.println(string instanceof String);

		var intArray = new int[10];
		for (var j = 0; j < intArray.length; j++) {

			System.out.print(j +" \t");
		}

		//		not allowed
		//		var objvar = null;

		Object object = null;
		var object1 = object;

		for (var j = 0; j < intArray.length; j++) {

		}

		for(var arg : args) {

			System.out.println(arg );
		}


		//		var[]intArray1 = new int[10];

		//		var intArray = {1, 2, 3, 4};


	}

	//	not allowed
	/*
	 * public var testMethod() {
	 * 
	 * }
	 */

	//	not allowed
	/*
	 * public void testMethod(var parameter) {
	 * 
	 * }
	 */


}
