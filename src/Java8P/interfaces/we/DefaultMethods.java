package Java8P.interfaces.we;

public class DefaultMethods implements Three,Four,Five{

	public static void main(String[] args) {

		DefaultMethods defaultMethods =  new DefaultMethods();
		defaultMethods.commonMethod();

	}

	
	  @Override public void commonMethod() { // // TODO Auto-generated method
	  
	  System.out.println("default void commonMethod() in DefaultMethods"); }
	 

}


interface One{

	void commonMethod();

}

interface Two2{

	default void commonMethod() {

		System.out.println("default void commonMethod() in Two");
	}
}


interface Three extends One,Two2 {


	@Override default void commonMethod() { // TODO Auto-generated method stub

		System.out.println("default void commonMethod() in Three");
	}


	//	void commonMethod();

}

interface Four {


	static void commonMethod() {

		System.out.println("static void commonMethod() in Four");
	}

}

interface Five extends Four{

	default void commonMethod() {

		System.out.println("default void commonMethod() in Five");
	}
}



