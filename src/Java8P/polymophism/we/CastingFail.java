package Java8P.polymophism.we;

import java.util.ArrayList;

public class CastingFail
{

	
	public static void main(String[] args) {
		
		
		ArrayList mixArrayList = new ArrayList();
		ArrayList<Integer> strList = new ArrayList<Integer>();
		
		mixArrayList.add(new String("Some String"));
		mixArrayList.add(new Object());
		mixArrayList.add(new Integer(12));
		mixArrayList.add(new String("Some ther String"));
		
		strList = (ArrayList<Integer>)mixArrayList;
		
		System.out.println(strList);
		
//		int i = strList.get(0);
		
		A a = new B();
		
		B b = new B();
		
		System.out.println(a.str1);		
		System.out.println(b.str1);
		
		ArrayList<A> aList =  new ArrayList<A>(); 
		ArrayList<B> bList =  new ArrayList<B>(); 
		
		aList.add(new B());
//		bList.add(new A());
//		
//		aList = (ArrayList<A>)bList;
//		bList = aList;
		
		ArrayList someList =  new ArrayList(); 
		
		aList = someList;
		someList = bList;

//		
	}
}


class A{
	
	String str1 = "some string";
}

class B extends A{
	
	String str1 = "some other String";
	
}