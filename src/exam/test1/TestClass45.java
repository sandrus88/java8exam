package exam.test1;

/**
 What will be the result of compiling and running the following code?
 1) It will print 1;
 2) It will print 2;
 3) Compile time error at //1;
 4) Compile time error at //2;
 5) Compile time error at //3;
 */

class Ciao{
   public short getValue(){ return 1; } //1
}
class Ciao2 extends Ciao{
  // public byte getValue(){ return 2; } //2
}
public class TestClass45 {
   public static void main(String[] args){
	   Ciao b = new Ciao2();
      System.out.println(b.getValue()); //3
   }
}