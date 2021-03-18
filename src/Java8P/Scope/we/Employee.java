package Java8P.Scope.we;

public class Employee {


	String name;
	int impId;

	int i;
	public static void main(String[] args) {

	new Employee("asbc").getEmployee();	

	}

	public Employee(String name)
	{
		name = name;
		this.name =  name;
	}


	public int getEmployee() {

		int impId = 0;
		int i =10;

//		for (int i = 0; impId < 10; i++) {
//
//		}

		class Reportee{

			{
				for (int i = 0; i < 10; i++) {
					
					System.out.println(i);

				}
//		this breakes the  method nested class scope of i, as its is accessing method scope veriable. 
//				Hence erroe, Veriable has to be Final or ffectively Final;   This case if you make final you cannot increment it.       		
//				for ( i = 0; i < 10; i++) {
//					
//					System.out.println(i);
//
//				}	
//				
				
				for (int j = i ; j < 20; j++) {
					
					System.out.println(j);

				}	
					
				System.out.println("outer loop : "+i);

			}

		}


		new Reportee();
		
//		this breakes the  method nested class scope of i, as its is accessing method scope veriable.   Hence erroe in Line 42, Veriable has to be FInal or ffectively Final;                                                                         
		
//		i++;
		return impId;

	}



}
