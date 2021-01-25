package exam.my;

public class For {
	public static void main(String[] args) {
		String[] arr = {"Sandro", "Sandro1", "Sandro2", "Sandro3", "Sandro4"};
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]); 
		}
		int a = 0;
		
		System.out.println("a : " + a);
		System.out.println("a++ : " + (a++));
		System.out.println("a : " + a);
		
		System.out.println("++a : " + (++a));
		System.out.println("a : " + a);
	}
}
