package Java8P.encapsulation.we.pkg1;

public class ModifiersSub1 extends Modifiers {
	
	public static void main(String[] args) {
		
		new ModifiersSub1().accessMember();
		
	}
	
	public void accessMember() {
		
		System.out.println(super.protectedMember);
		
		Modifiers modifiers = new Modifiers();
		System.out.println(modifiers.protectedMember);
		System.out.println(super.publicMember);
		System.out.println(super.defaultMember);
		
//		System.out.println(super.privateMember);
		
	}

}
