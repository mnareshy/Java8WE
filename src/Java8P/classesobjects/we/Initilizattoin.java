package Java8P.classesobjects.we;

import java.io.Serializable;
import java.net.http.WebSocket;
import java.nio.ByteBuffer;
import java.util.concurrent.CompletableFuture;

public class Initilizattoin{


	//	Initialization is mandatory for final variables
	final static String someStaticStrig;

	static{
		someStaticStrig = "SomeStaticStrig";
	}

	final  String someStrig;

	{
		someStrig = "Some String";
	}

	final  String someStrig2 = "";

	final  String someStrig4;

	Initilizattoin(){
		someStrig4 = "someStrig4";
	}

	Initilizattoin(String passSomething){

		someStrig4 = "someStrig4 arg Constructor";
	}


	public static void main(String[] args) {

		Initilizattoin initilizattoin = new Initilizattoin();


		initilizattoin.someOtherMethod();	
		Object a, b = a = new Object();

		// Invalid as b is not defined before initialization
		//		Object a = b , b = new Object();
		//		Object a = b = new Object();

		//	Valid as subtypes assigned	
		Object e = new Object(), i = new String(), j = new Integer(12), k = 10;

		System.out.println(k instanceof Integer );

		i = null;
		a = null;

		class local{

		}


	}

	void someOtherMethoddec(){


		System.out.println("someOtherMethoddec");

	}

	void someOtherMethod(){

		Initilizattoin initilizattoin = this;


		initilizattoin.someOtherMethoddec();

		System.out.println(initilizattoin.someStrig4);



	}


	static class local{}




}
