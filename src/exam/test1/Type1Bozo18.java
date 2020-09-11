package exam.test1;

public class Type1Bozo18 implements Bozo {
	   public Type1Bozo18() {
	    type = 1;
		}

	public void jump() { 
			System.out.println("jumping..."+ type);
		}

	public static void main(String[] args){ 
		    Bozo b = new Type1Bozo18();
			b.jump();
		}
}
