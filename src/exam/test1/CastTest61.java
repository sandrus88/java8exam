package exam.test1;

/**
 What happens when you try to compile and run the following program?
 1) The compiler will refuse to compile it because i and b are of different types 
    cannot be assigned to each other;
 2) The program will compile and will print -128 and -128 when run;
 3) The compiler will refuse to compile it because -128 is outside the legal range of values 
    for a byte;
 4) The program will compile and will print 128 and -128 when run;
 5) The program will compile and will print 255 and -128 when run;    
 */

public class CastTest61 {
	   public static void main(String args[ ] ){
	      byte b = -128 ;
	      int i = b ;
	      b = (byte) i;
	      System.out.println(i+" "+b);
	   }
	}
