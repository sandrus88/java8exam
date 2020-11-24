package com.bar.exam.test1;

/**
 What should be inserted at //1 so that Y.java can compile without any error?
 1) import static X;
 2) import static com.foo.*;
 3) import static com.foo.X.*;
 4) import com.foo.*;
 5) import com.foo.X.LOGICID;
 */

import com.foo.exam.test1.X39;
//1  <== INSERT STATEMENT(s) HERE

public class Y39 {
	public static void main(String[] args) {
		System.out.println(X39.LOGICID);
	}
}