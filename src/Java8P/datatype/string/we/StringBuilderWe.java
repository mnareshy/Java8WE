package Java8P.datatype.string.we;

public class StringBuilderWe {
	
	public static void main(String[] args) {
		
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Hello");
		
		System.out.println(stringBuilder.length());
		System.out.println(stringBuilder.capacity());
		

		StringBuilder stringBuilder1 = new StringBuilder("Hello");
		
		System.out.println(stringBuilder1.length());
		System.out.println("new StringBuilder(\"Hello\") capacity is in addition with arg lenght "+stringBuilder1.capacity());
		
		
//		Comparator
		
		System.out.println("SB Did not implemented equals()   "+stringBuilder.equals(stringBuilder1));
		
		System.out.println("SB has implemented compareTo()   "+stringBuilder.compareTo(stringBuilder1));
		
		
//    append & Insert 
		
		stringBuilder.append(" world append");
		
		System.out.println(stringBuilder);
		
		stringBuilder.insert(18," Hello ");
		
		System.out.println(stringBuilder);
		
		
		
		
		  // Create and Initialize a StringBuilder Object
        StringBuilder sb = new StringBuilder("World Hello, How are you?");
        System.out.println("Original Value in sb = " + sb);
 
        // Delete the comma from the string,
        // Use indexOf to retrieve the index of the comma
        System.out.println("sb.deleteCharAt(sb.indexOf(\",\") = " +
                sb.deleteCharAt(sb.indexOf(",")));
 
        // Delete everything after where the comma used to be..
        System.out.println("sb.delete(11,sb.length()) = " +
                sb.delete(11, sb.length()));
 
        // Now reverse the entire string
        sb.reverse();
        System.out.println("sb after reverse() method called = " + sb);
 
        // You can assign the reverse method's result to a
        // different StringBuilder variable...
        StringBuilder rb = sb.reverse();
        System.out.println("(rb == ss) = " + (rb == sb));
 
        // Now you have two StringBuilder references pointing to the
        // same mutable text
        sb.append(" How are you?");
        
        
        System.out.println("sb = " + sb);
        System.out.println("rb = " + rb);
        
        
        
//        Substring returns a new object
        
        String str1 = sb.substring(0,5);
        System.out.println("Substring : " + str1);
        System.out.println("sb = " + sb);
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        
        // Create empty StringBuilder
        StringBuilder builder = new StringBuilder();
 
        // Add some code with leading/trailing whitespcace
        builder.append("  ABCD                 ");
        System.out.println("Original Value of builder = *" + builder + "*");
        System.out.println("Length of builder = " + builder.length());
        System.out.println("Capacity of builder = " + builder.capacity());
 
        // What do you think trimToSize does?
        builder.trimToSize();
        System.out.println("Current Value of builder = *" + builder + "*");
        System.out.println("Length of builder = " + builder.length());
        System.out.println("Capacity of builder = " + builder.capacity());
        
        
        
        // Let's now explore getChars method on String and StringBuilder
        
     // Test data
     builder.append(" just more text because we need more text");
     char[] myCharacterArray1 = new char[10];
     char[] myCharacterArray2 = new char[10];
      
     // calling getChars on a String with srcBegin = 20,  srcEnd = 27
     builder.toString().getChars(20, 27, myCharacterArray1, 0);
     // calling getChars on a StringBuilder object with srcBegin = 20,  srcEnd = 27
     builder.getChars(20, 27, myCharacterArray2, 0);
      
     System.out.println("myCharacterArray1 = " +
             java.util.Arrays.toString(myCharacterArray1));
     System.out.println("myCharacterArray2 = " +
             java.util.Arrays.toString(myCharacterArray2));
     
     System.out.println(builder);
      
   
     // Set up additional test data
     char[] myCharacterArray5 = new char[10];
     char[] myCharacterArray6 = new char[10];
      
     // change destination index from 0 to 3 for String
     builder.toString().getChars(20, 27, myCharacterArray5,3);
     // change destination index from 0 to 3 for String
     builder.getChars(20, 27, myCharacterArray6, 3);
      
     System.out.println("myCharacterArray5 = " +
             java.util.Arrays.toString(myCharacterArray5));
     System.out.println("myCharacterArray6 = " +
             java.util.Arrays.toString(myCharacterArray6));
        
        
		
	}

}
