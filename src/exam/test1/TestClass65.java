package exam.test1;

/**
 What changes can be done to make the above code compile?
 1) Change declaration of main to : 
    public static void main(String[] args) throws Exception;
 2) Change declaration of myMethod to 
    public void myMethod throws Exception;
 3) Change declaration of yourMethod to 
    public void yourMethod throws Exception;
 4) Change declaration of main and yourMethod to : 
    public static void main(String[] args) throws Exception and 
    public void yourMethod throws Exception;
 5) Change declaration of all the three method to include throws Exception.             
 */

public class TestClass65 {
    public static void main(String[] args) throws Exception {
        TestClass65 tc = new TestClass65();
        tc.myMethod();
    }
    
    public void myMethod() throws Exception {
        yourMethod();
    }
    
    public void yourMethod() throws Exception {
        throw new Exception();
    }    
}
