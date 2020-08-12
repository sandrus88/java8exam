package exam.test1;

/**
 Which of the following options when put at //1 will assign 123 to m?
  new Long(mStr); (ok)
  Long.parseLong(mStr); (ok)
  Long.longValue(mStr);
  (new Long()).parseLong(mStr);
  Long.valueOf(mStr).longValue(); (ok)
 */

public class MyClass5 {

	public static void main(String args[]) {
	String mStr = "123";
	long m = new Long(mStr);

}
}