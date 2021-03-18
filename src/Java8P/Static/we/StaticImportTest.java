package Java8P.Static.we;

import static Java8P.Static.we.test1.StaticImportE1.*;
//import static Java8P.Static.we.test1.StaticImportE2.*;
import static Java8P.Static.we.test1.StaticImportE2.NAME;

import Java8P.Static.we.test1.StaticImportE1;
import Java8P.Static.we.test1.StaticImportE2;

public class StaticImportTest {
	
	public static void main(String[] args) {
		
		System.out.println(NAME);
		System.out.println(StaticImportE2.NAME);
		
		printS(" : what amma?");
		StaticImportE2.printS(" : What is this amma?");
		
		new StaticImportE1().printS(" ??");
		new StaticImportE2().printS(" ?!");
		
		
		new StaticImportE1().printNS();	
		new StaticImportE2().printNS();		
		
	}

}
