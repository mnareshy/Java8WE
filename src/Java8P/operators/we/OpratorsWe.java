package Java8P.operators.we;


/*  
  
  Operators in Java can be categorized based on two criteria:

Number of operands – There are three types of operators based on the number of operands. 
An operator is called a unary, binary, or ternary operator based on the number of operands. 
If an operator takes one operand, it called a unary operator; if it takes two operands, 
it called a binary operator; if it takes three operands, it called a ternary operator.

Type of operation they perform – An operator is called an arithmetic operator,
a relational operator, a logical operator, or a bitwise operator, 
depending on the kind of operation it performs on its operands.
*/


public class OpratorsWe {
	
	
	public static void main(String[] args) {
		
//		test Unary operators
		
		int i = 1;
		
		i++;
		
		System.out.println("Simple statements the bhaviour is same , value of i : "+i);
		
		++i;
		
		System.out.println("Simple statements the bhaviour is same , value of i : "+i);
		
		
		i = 1;
		int j = 1;
		
		System.out.println("value of ++i : " + ++i);
		System.out.println("value of j++ is assigned before incement : " + j++);
		System.out.println("Now value of j : " + j);
		
	    i =1;
	    j = 1;
	    if(++i == 2) System.out.println("Yes ++i == 2");
	    if(j++ != 2) System.out.println("No it is  j++ != 2");
	    
	    System.out.println("Now value of j : " + j);
	    
	    
//	    Tets Loops
	    
	    System.out.println(" ********* Test Loops *********");
	    
	    i = 7;
	    int count = 0;
	    
	    while (--i > 0) {
	    	
	    	count++;
	    }
	    
	    System.out.println("while (--i > 0)  : " +count);
	    
	    i = 7;count = 0;
	    
	    while (i-- > 0) {
	    	
	    	count++;
	    }
	    System.out.println("while (i-- > 0)  : " +count);
	
//	    Tets Loops END
	    
// 		Test complement operator
	    
	    i = 5;
	    System.out.println(" 5's bits : " + Integer.toBinaryString(i));
	    // bitwise and
        // ~0101=1010
        // will give 2's complement of 1010 = -6
        System.out.println("~i = " + ~i);
        i = ~i;
        System.out.println(" `5's bits : " + Integer.toBinaryString(i));
        
        
        int bin1 = 0b0101;
        
        System.out.println(bin1);
        int bin4 = 0b1010;
        System.out.println(bin4);
        int bin5 = 0b0110;
        System.out.println(bin5);
        
        int bin2 = ~bin1;
        System.out.println("~bin1 = " + Integer.toBinaryString(bin1));
        System.out.println("~bin2 = " + Integer.toBinaryString(bin2));
        System.out.println(bin2);
        int test = 0b1010;
        System.out.println(test);
        
        
        
//    Test all Shift operators
        
        System.out.println("--- Shift Operators ---");
     // left shift (<<)
     // bit pattern shifted left by 2 places (right operand = 2)
     // 0b0000_0001 becomes 0b0000_0100
     System.out.println("result of left shift (00000001 << 2 ) = "
             + String.format("%8s",Integer.toBinaryString(0b00000001 << 2)).
             replace(' ', '0'));
      
      
     // right shift (>>)
     // bit pattern shifted left by 3 places (right operand = 3)
     // 0b10001000 becomes 0b00010001
     System.out.println("result of right shift (10001000 >> 3 ) = "
             + String.format("%8s",Integer.toBinaryString(0b10001000 >> 3)).
             replace(' ', '0'));
      
      
     // >>>  right shift unsigned
     System.out.println("result of unsigned right shift (" +
             "10000010_00000010_00000010_00000010 >>> 1 ) = "
             + String.format("%32s",Integer.toBinaryString(
                     0b10000010_00000010_00000010_00000010 >>> 1)).
             replace(' ', '0'));
      
     //  Compare right shift unsigned to right shift results
     System.out.println("result of signed right shift   (" +
             "10000010_00000010_00000010_00000010 >>  1 ) = "
             + String.format("%32s",Integer.toBinaryString(
                     0b10000010_00000010_00000010_00000010 >> 1)).
             replace(' ', '0'));
     
     
//   Test all Shift operators END
        
        
     
     
//     Relational; Operators
     
     
     int a = 0;
     int b = 0;
     
     
     if((a++ <= b) | (++a <= b)) 
     {
    	 a = 0;
    	 System.out.println("(a++ <= b) | (++a <= b)   ?  (a++ <= b) : "+ (a++ <= b) +" (++a <= b)  "+ (++a <= b));
     }
     
     boolean boolean1 = false; 
     a = 0;
     b = 0;
     if((a++ <= b) || (boolean1 = (++a <= b))) 
     {
    	 a = 0;
    	 System.out.println("(a++ <= b) || (boolean1 = (++a <= b)) : "+ boolean1);
     }
     
//   left hand side one has to be true to evalute the second one
     if((false) || (boolean1 = (++a <= b))) 
     {
    	 a = 0;
    	 System.out.println("(a++ <= b) || (boolean1 = (++a <= b)) : "+ boolean1);
     }
     
//   Relational; Operators END
     
//     Binary assignments
     System.out.println("\nResults from assignment operators...");
  // Assignment Operator
  byte b1 = 2;
  byte b2 = 2;
  byte b3 = 5;
   
  // Multiplicative Assignments, note that variables NOT promoted
  b1 *= 2;
  System.out.println("b1 (after b1 *= 2 ) = " + b1);
  b2 /= 2;
  System.out.println("b2 (after b2 /= 2) = " + b2);
  b3 %= 2;
  System.out.println("b3 (after b3 %= 2) = " + b3);
   
  // Additive Assignments, note that variables NOT promoted
  b1 = 2;
  b2 = 2;
  b1 += 2;
  System.out.println("b1 (after b1 += 2) = " + b1);
  b2 -= 2;
  System.out.println("b2 (after b2 -= 2) = " + b2);
   
  // Assignment operators with bit shift
  b1 = 16;
  b2 = 16;
  b3 = 16;
  b1 <<= 1;
  System.out.println("b1 (after b1 <<= 1) = " + b1);
  b2 >>= 1;
  System.out.println("b2 (after b2 >>= 1) = " + b2);
  b3 >>>= 1;
  System.out.println("b3 (after b3 >>>= 1) = " + b3);
   
  // Assignment operators with bit and, xor, or
  b1 = 0b0000;
  b1 &= 0b1111;
  System.out.println("b1 (after b1 &= 0b1111 ) = " + b1);
  b1 |= 0b1111;
  System.out.println("b1 (after b1 |= 0b1111 ) = " + b1);
  b1 ^= 15;
  System.out.println("b1 (after b1 ^= 15 )= " + b1);
  

     
 
//This code results in an overflow
byte testByte = Byte.MAX_VALUE;
testByte += 1;
System.out.println("testByte = " + testByte);

//This code results in a compiler error
byte testByte2 = Byte.MAX_VALUE;

// Compile error
//testByte2 = testByte2 + 1;


System.out.println("testByte2 = " +  (testByte2 + 1));
     

int i1 = Integer.MAX_VALUE;
i1 = i1 +1; 

System.out.println("i1 = " +  i1);

//Binary assignments END   

int number =0;

number = number++;

System.out.println((number--) - (--number));
System.out.println((number--) == (number+=1));   
System.out.println((--number) == (number--)); 


    int i2 = 0;
    int j2 = 5;
    int k2 = 10;

    int loopIterations = 0;

    while ((i2++ < j2) || (j2 < --k2)) {
        
        loopIterations++;
    }
    System.out.println(loopIterations);


     
	}
	
	
	

}
