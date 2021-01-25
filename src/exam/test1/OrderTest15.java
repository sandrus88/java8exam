package exam.test1;

/**
 What will the following code print when compiled and run?
 1) null 0 
    null 1;
 2) 0 
    1;
 3) (strange characters present here. encoding issue)
       1 (There is a space before 0 and 1);
 4) null 
    null;
 5) It will throw a RuntimeException at run time;               
 */

public class OrderTest15 {
	public void initData(String[] arr) {
		int ind = 0;
		for (String str : arr) {
			str = "Ciao";
			System.out.println(str.concat(" " + str + " " + ind));
			ind++;
		}
	}

	public void printData(String[] arr) {
		for (String str : arr) {
			str = "Ciao";
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		OrderTest15 ot = new OrderTest15();
		String[] arr = new String[2];
		ot.initData(arr);
		ot.printData(arr);
	}
}
