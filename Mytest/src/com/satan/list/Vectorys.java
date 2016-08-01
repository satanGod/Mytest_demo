package com.satan.list;

import java.util.Enumeration;
import java.util.Vector;

public class Vectorys {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void vectory(){
		Vector retails = new Vector();
		retails.addElement("");
		Enumeration e = retails.elements();
		System.out.println(e.hasMoreElements());
	}
}
