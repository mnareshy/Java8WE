package Java8P.encapsulation.we.pkg2;

import Java8P.encapsulation.we.pkg1.Modifiers;

public class ModifiersSub2 extends Modifiers{
public static void main(String[] args) {
		
		new ModifiersSub2().accessMember();
		
	}
	
	public void accessMember() {
		
		System.out.println(super.protectedMember);
		
		Modifiers modifiers = new Modifiers();
		
//		Note this -  modifiers.protectedMember not visable from the instance
//		System.out.println(modifiers.protectedMember);
		System.out.println(super.publicMember);
//		System.out.println(super.defaultMember);
		
//		System.out.println(super.privateMember);
		
	}

}
