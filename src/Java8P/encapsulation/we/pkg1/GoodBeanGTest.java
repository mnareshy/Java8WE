package Java8P.encapsulation.we.pkg1;

public class GoodBeanGTest {

	public static void main(String[] args) {

		String name = "SomeName";
		StringBuilder address = new StringBuilder("SomeAddress");
		int age = 38;

		GoodBean goodBean = new GoodBean(name, address, age);
		

		name = "SomeNameElse";
		address.append("SomeOtherAddress");
		age = 37;


		GoodBean goodBean1 = new GoodBean(name, address, age);
		
//		Address is same in both !  Ensure if reference are set in the Beans you make a copy of them; Update the 
//		bean with this.address = new StringBuilder(address);
		System.out.println(goodBean);
		System.out.println(goodBean1);

	}

}
