package exam.test1.ex13.testPackage;
import other.*;

/**
What will be the output of running class Test?
false false true false true;
false true true false true;
true true true true true;
true true true false true; (ok)
None of the above;
*/

/**
* Ermal's feedback: The file is not compiling. To make a compilable version do the following steps:
* 1) create package 'ex13' (inside package test1)
* 2) create package 'other', exactly in the path test1/ex13
* 3) Move class Other inside the package other
* 4) Create package 'testPage' inside test1/ex13/
* 5) Move class Test inside package testPackage.
*/

class Test {
	public static void main(String[] args) {
		String hello = "Hello", lo = "lo";
		System.out.print((exam.test1.ex13.testPackage.Other.hello == hello) + " "); // line 1
		System.out.print((exam.test1.ex13.other.Other.hello == hello) + " "); // line 2
		System.out.print((hello == ("Hel" + "lo")) + " "); // line 3
		System.out.print((hello == ("Hel" + lo)) + " "); // line 4
		System.out.println(hello == ("Hel" + lo).intern()); // line 5
	}
}

class Other { static String hello = "Hello"; }