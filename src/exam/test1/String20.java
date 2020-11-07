package exam.test1;

/**
 * What will the following code print? 
 * 1) abc; 
 * 2) abcdef; 
 * 3) def; 
 * 4) It will print empty string (or in other words, nothing); 
 * 5) It will not compile because there is no concat() method in String class;
 */

public class String20 {

	public static void main(String[] args) {
		String abc = "";
		abc.concat("abc");
		abc.concat("def");
		System.out.print(abc);

	}
}
