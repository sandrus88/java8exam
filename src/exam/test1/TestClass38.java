package exam.test1;

/** 
 Which of the following statements are correct?
 1) It will compile and run without any problems;
 2) It will compile but WILL throw ClassCastException at runtime;
 3) It will compile but MAY throw ClassCastException at runtime;
 4) It will not compile;
 5) None of the above;
 */

class Super {  }
class Sub extends Super {  }
public class TestClass38 {
   public static void main(String[] args){
      Super s1 = new Super(); //1
      Sub s2 = new Sub();     //2
      s1 = (Super) s2;        //3
   }
}
