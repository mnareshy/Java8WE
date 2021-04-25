package Java8P.encapsulation.we.pkg1;

public class ModifiuersAccessability {


	public static void main(String[] args) {

		SuperClass superClass = new SuperClass();
		System.out.println(superClass);
		
		SubClass subClass =  new SubClass();
		System.out.println(subClass);

		SuperClass superSubClass =  new SubClass();
		
		System.out.println(superSubClass.protectedMember);
		System.out.println(superSubClass.publicMember);
//		System.out.println(superSubClass.privateMember);
		System.out.println(subClass.privateMember);

	}

}


class SuperClass {

	private String privateMember = "privateMember";
	public String publicMember  = "publicMember";
	protected String protectedMember = "protectedMember";
	String defaultMember = "defaultMember";

	public String toString()
	{
		return privateMember+" "+publicMember+" "+protectedMember+" "+defaultMember;

	}


}


class SubClass extends SuperClass{


	public String privateMember = "privateMember public";
	private String publicMember  = "publicMember private";
	String protectedMember = "protectedMember default";
	protected String defaultMember = "defaultMember protected";

	public String toString()
	{
		return privateMember+" "+publicMember+" "+protectedMember+" "+defaultMember;
//		return super.toString();

	}


}