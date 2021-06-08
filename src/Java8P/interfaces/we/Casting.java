package Java8P.interfaces.we;

public class Casting {

	public static void main(String[] args) {


		One1 one = new Three1();

		Two1 two = new Two1();

		Two1 two1 = (Two1)one;
		One1 one1 = (One1)two;


		Three1 three = new Three1();

		// class cating caought in compile time , But interface cvasting is not
//		two = (Two1)three;
		one1 = (One1)three;
		
	
	}
	
	
	
	
}


 interface One1 {
	
//	private void someMethod() {	}

	void doOne();
}

class Three1 implements One1{

	@Override
	public void doOne() {
		// TODO Auto-generated method stub

		System.out.println("One1");

	}

}

class Two1{

	public String someString = "someString";

	public void printString() {

		System.out.println(this.someString);
	}

}