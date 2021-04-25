package Java8P.encapsulation.we.pkg1;

public class GoodBean {

	public GoodBean(String name, StringBuilder address, int age) {
		this.name = name;
		//		Address is same in both !  Ensure if reference are set in the Beans you make a copy of them

		this.address = new StringBuilder(address);
		this.age = age;
	}


	private String name;
	private StringBuilder address;
	private int age;

	@Override
	public String toString() {




		return "GoodBean [name=" + name + ", address=" + address + ", age=" + age + "]";
	}


}
