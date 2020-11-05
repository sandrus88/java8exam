package exam.test1;

//What will the program print when compiled and run?
//jumping...0
//jumping...1
//This program will not compile.
//It will throw an exception at runtime.

public class Type1Bozo18 implements Bozo {
	public Type1Bozo18() {
		// type = 1; //non compila perchè variabili dichiarate in interfaccia sono
		// implicitamente final
	}

	public void jump() {
		System.out.println("jumping..." + type);
	}

	public static void main(String[] args) {
		Bozo b = new Type1Bozo18();
		b.jump();
	}
}
