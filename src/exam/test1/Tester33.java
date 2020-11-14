package exam.test1;

/**
 What will the following code print when compiled and run?
 1) Hello, How are you? 
    Hello, How are you?;
 2) Hello, StringWrapper@<hashcode>; 
    Hello, How are you?;
 3) Hello, How are you? 
    Hello, StringWrapper@<hashcode>;
 4) Hello, How are you? 
    Hello, java.lang.StringBuilder@<hashcode>;
 5) Hello, StringWrapper@<hashcode> 
    Hello, java.lang.StringBuilder@<hashcode>;         
 */

class StringWrapper {
	private String theVal;

	public StringWrapper(String str) {
		this.theVal = str;
	}
}

public class Tester33 {
	public static void main(String[] args) {
		StringWrapper sw = new StringWrapper("How are you?");
		StringBuilder sb = new StringBuilder("How are you?");
		System.out.println("Hello, " + sw);
		System.out.println("Hello, " + sb);
	}
}
