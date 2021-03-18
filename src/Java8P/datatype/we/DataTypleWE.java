package Java8P.datatype.we;

public class DataTypleWE {

	public static void main(String[] args) {

		byte b = 'a';

		System.out.println(b);

		char c = (char)b;
		System.out.println(c);

		short s  = (byte)c;

		System.out.println(s);
		
		
		int iMin = Short.MIN_VALUE;
		int iMax = Short.MAX_VALUE;
		short sMin = (short) iMin;
		short sMax = (short) iMax;
		
		System.out.println(-sMin+sMax+1);
		
		System.out.println("iMin : " +sMin +"  iMax : "+ sMax);
		
		int iMin1 = Short.MIN_VALUE-1;
		int iMax1 = Short.MAX_VALUE+1;
		short sMin1 = (short) iMin1;
		short sMax1 = (short) iMax1;
		
		System.out.println("iMin : " +sMin1 +"  iMax : "+ sMax1);
		
		
// Unsigned hold more
		
		System.out.println("*******Unsigned hold more********");
		
		int temInt = Integer.MAX_VALUE;
		System.out.println(temInt);
		
		temInt = Integer.MAX_VALUE +1;
		System.out.println("Signed temInt : "+temInt);
		
		long l = Integer.MAX_VALUE +1;
		System.out.println(l);
		
		String ustr = Integer.toUnsignedString(temInt);
		System.out.println("Unsigned temInt : "+ustr);
		
		System.out.println("Signed Integer.MIN_VALUE  :" +Integer.MIN_VALUE);
		System.out.println("Unsigned Integer.MIN_VALUE  :" +Integer.toUnsignedString(Integer.MIN_VALUE));
		
		
		l =  Integer.toUnsignedLong(Integer.MAX_VALUE +1);
		System.out.println(l);
		
		
		
		
		
		System.out.println("*******Unsigned hold more********");
//		Truncate
		
		double d = 22.22;
		int i = (int)d;
		
		System.out.println(i);
		System.out.println(new Double(d).intValue());
				
		
		int e = 7;
		int f = 7;
		
		if(e==f) System.out.println("true");
		
		int g = new Integer(7);
		
		if(e==g) System.out.println("true");
		
		int h = Integer.valueOf(7);
		
		if(g==h) System.out.println("true");
		
		int k = new Integer(7);
		
		if(g==k) System.out.println("true");
		
		Double double1 = new Double(22.22);
		Double double2 = Double.valueOf(22.22);
		
		if(double1==double2) System.out.println("double1 true");
		
		Double double3 = Double.valueOf(22.22);
		if(double1==double3) System.out.println("double2 true");
		
		
		Integer integer1 = 127;
		Integer integer2 = 127;
		if(integer1 == integer2) System.out.println("integer true");
		
		Integer integer3 = Integer.valueOf(127);
		if(integer1 == integer3) System.out.println("integer true");
		
		Integer integer4 = new Integer(127);
		if(integer1 != integer4) System.out.println("integer Constructor false");
		
		Double doublea = 127.27;
		Double doubleab = 127.27;
		if(doublea == doubleab) System.out.println("doubleab true");
		
		Double doubleac = Double.valueOf(127.27);
		if(doublea == doubleac) System.out.println("doublea true");
		
		Double doublead = new Double(127.27);
		if(doublea != doublead) System.out.println("doublea Constructor false");
	}



}
