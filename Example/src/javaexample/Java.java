package javaexample;

public class Java {
	
	//this is a one line comment
	
	/*
	 * a multi_line comment
	 * that is very
	 * long
	 */

	/**
	 * this is a javedoc.
	 * @author
	 * @param
	 */
	public static void main (String [] args) {
		System.out.println("Hello, World");
		typesInJave();
	}

	public static void typesInJave () {
		int x = 42;
		x = x + 1;
		double y = 3.14;
		char c = 'a';
	 
		Integer xInteger = new Integer(10);
		Integer xInteger2 = new Integer(x);
		Double yDouble = new Double(y);
	 
		System.out.println(xInteger.toString());
	}
}
