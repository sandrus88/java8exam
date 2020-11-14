package exam.test1;
import java.util.* ;

/** 
 In which sequence will the characters a, b, and, c be printed by the following program?
 1) The sequence a, b, c is printed;
 2) The sequence a, b, c, b is printed;
 3) The sequence a, c, b, c is printed;
 4) The sequence a, c, b is printed;
 5) None of the above;
 */
public class ListTest37 {
   public static void main(String args[]){
      List s1 = new ArrayList( );
      s1.add("a");
      s1.add("b");
      s1.add(1, "c");
      List s2 = new ArrayList(  s1.subList(1, 1) );
      s1.addAll(s2);
      System.out.println(s1);
   }
}
