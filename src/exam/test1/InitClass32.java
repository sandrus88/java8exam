package exam.test1;

/**
 Given the following class, which of the given blocks can be inserted at line 1 without errors?
 1) static {System.out.println("Static"); };
 2) static { loop = 1; };
 3) static { loop += INTERVAL; };
 4) static { INTERVAL = 10; };
 5) { flag = true; loop = 0; };
 */

public class InitClass32 {
    private static int loop = 15 ;
    static final int INTERVAL = 10 ;
    boolean flag ;
    //line 1
}
