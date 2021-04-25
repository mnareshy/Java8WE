package Java8P.methods.we;

public class OverLoadPrimitiveParams {

	public static void main(String[] args) {

		//		char -> int -> long -> float -> double
		//		byte -> short -> int

		OverLoadPrimitiveParams overLoadPrimitiveParams = new OverLoadPrimitiveParams();

		overLoadPrimitiveParams.callPrimParamMethod((char)'a');
		overLoadPrimitiveParams.callPrimParamMethod((byte)127);


	}

	private void callPrimParamMethod(int c) {

		System.out.println("int c " +c);

	}
	

	/*
	 * private void callPrimParamMethod(byte c) {
	 * 
	 * System.out.println("byte c " +c);
	 * 
	 * }
	 */

}
