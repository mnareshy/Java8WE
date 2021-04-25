package Java8P.methods.we;

public class PassByValue {

	public static void main(String[] args) {

		int intValue = 4;
//		String obj = "4";
		String obj = new String("4");
		Integer obj1 = 4;
		StringBuilder sb = new StringBuilder("4");
		SomeObject someObject = new SomeObject();
		someObject.setSomeOne("UnKnown");
		someObject.setAge(4);

		System.out.println("intValue : " + intValue );
		System.out.println("String obj : " + obj+" hash "+ obj.hashCode());
		System.out.println("Integer obj : " + obj1+" hash "+ obj1.hashCode());
		System.out.println("SB obj : " + sb+" hash "+ sb.hashCode());
		System.out.println(someObject);

		updateValue(intValue);
		updateObject(obj);
		updateObject(obj1);
		updateObject(sb);
		updateObject(someObject);

		System.out.println("intValue : " + intValue);
		System.out.println("String obj : " + obj+" hash "+ obj.hashCode());
		System.out.println("Integer obj : " + obj1+" hash "+ obj1.hashCode());

		// Watch Them , Obj ref is copied into arg and passed. Values expected to be updated
		System.out.println("SB obj : " + sb+" hash "+ sb.hashCode());
		System.out.println(someObject);
	}

	static void  updateValue(int intValue) {

		intValue = intValue + 12;

	}

	static void updateObject(Object obj) {

		if(obj instanceof Integer) {

			obj = 12;
		}

		if(obj instanceof String) {

			obj = "12";
		}

		if(obj instanceof StringBuilder) {

			((StringBuilder) obj).append("12");


		}
		if(obj instanceof SomeObject) {

			((SomeObject) obj).setSomeOne("Known");
			((SomeObject) obj).setAge(82);

		}


	}
	
	
}

class SomeObject{

	String someOne;
	int age;
	public String getSomeOne() {
		return someOne;
	}
	public void setSomeOne(String someOne) {
		this.someOne = someOne;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "someOne "+someOne+" age "+age;
	}
}
