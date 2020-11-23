package exam.test1;

import java.util.ArrayList;
import java.util.function.Predicate;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/**
 What can be inserted in the code below so that it will print true when run?
 1) checkList(new ArrayList(), al -> al.isEmpty());
 2) checkList(new ArrayList(), ArrayList al -> al.isEmpty());
 3) checkList(new ArrayList(), al -> return al.size() == 0);
 4) checkList(new ArrayList(), al -> al.add("hello"));
 5) checkList(new ArrayList(), (ArrayList al) -> al.isEmpty());
 */

public class TestClass43 {
	public static boolean checkList(List list, Predicate<List> p) {
		return p.test(list);
	}

	public static void main(String[] args) {
//		boolean b = //insert code here
//				System.out.println(b);
	}
}

