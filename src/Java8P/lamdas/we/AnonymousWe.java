package Java8P.lamdas.we;

import java.util.Arrays;
import java.util.Random;

import Java8P.datatype.string.we.SrtingConcat;

public class AnonymousWe {
	
	interface LocalInnerInterface{
		
		public String toString();
		public String getDetails();
		
		
	}
	
	
	public static void main(String[] args) {
		
		
			
		class LocalInnerClass{
			
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "localInnerClass";
			}
		}
		
		
	Exception exception = new Exception() {
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return getMessage();
		}
		
		@Override
		public String getMessage() {
			// TODO Auto-generated method stub
			return super.getMessage()+"Exception";
		}
		
	};
		
	LocalInnerClass localInnerClass = new LocalInnerClass();
	System.out.println(localInnerClass);
	
	System.out.println(exception);
	
	
//	Lets do the same with interfaces
	
	LocalInnerInterface localInnerInterface = new LocalInnerInterface() {

		@Override
		public String getDetails() {
			// TODO Auto-generated method stub
			return "Hey I am localInnerInterface Implementation";
		}
		
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return getDetails();
		}
		
	};
	
	
	System.out.println(localInnerInterface);
	
	callLocalInnerInterfaceMethod(new LocalInnerInterface() {
		
		@Override
		public String getDetails() {
			// TODO Auto-generated method stub
			
			return "In Method ref LocalInnerInterface -> callLocalInnerInterfaceMethod";
		}
	});
	
	
	callLocalInnerInterfaceMethod(
			
			() -> "Lamda -> In Method ref LocalInnerInterface -> callLocalInnerInterfaceMethod "
			
			
			);
	
	
		
		
	}
	

	
	public static void callLocalInnerInterfaceMethod(LocalInnerInterface localInnerInterface) {
		
		
		System.out.println(localInnerInterface.getDetails());
		
	}

}
