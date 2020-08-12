package exam.test1;

/**
  
  What will be the result of attempting to compile and run the following class? 
  The code will not compile because unlike in c++, operator '=' cannot be chained i.e. a = b = c = d is invalid.
  The code will not compile as 'j' is being used before getting initialized.
  The code will compile correctly and will display '9' when run. (ok)
  The code will not compile as 'j' and 'i' are being used before getting initialized.
  All the variables will get a value of 9. (ok)
 
 */

public class TestClass6 {

	public static void main(String args[]) {
		int i, j, k;
		i = j = k = 9;
		System.out.println(i);
	}
}
