package exam.test1;

/**
 What will be the output of running class Test13?
 false false true false true;
 false true true false true;
 true true true true true;
 true true true false true;
 None of the above;
 */

//In File Other.java
package other;
public class Other { public static String hello = "Hello"; }

//In File Test.java
package testPackage;
import other.*;

public class Test13 {
	 public static void main(String[] args){
	      String hello = "Hello", lo = "lo";
	      System.out.print((testPackage.Other.hello == hello) + " ");    //line 1
	      System.out.print((other.Other.hello == hello) + " ");   //line 2
	      System.out.print((hello == ("Hel"+"lo")) + " ");           //line 3
	      System.out.print((hello == ("Hel"+lo)) + " ");              //line 4
	      System.out.println(hello == ("Hel"+lo).intern());          //line 5
	   }
}
class Other { static String hello = "Hello"; }
