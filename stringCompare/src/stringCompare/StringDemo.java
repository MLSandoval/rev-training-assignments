package stringCompare;

import java.util.*;

public class StringDemo {
	public static void main(String[] args) {
		String s1 = "Sachin";
		String s2 = "Sachin";
		String s3 = new String("Sachin");
		String s4 = " Prabhakar";
		String s5 = "red:blue:green:yellow";
		System.out.println(s1 == s2);// true (because both refer to same instance)
		System.out.println(s1 == s3);// false(because s3 refers to instance created in nonpool)
		System.out.println(" ########## Equals Method ############### ");
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals(s3));// true
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.charAt(2));
		System.out.println(s1.concat(s4));
		System.out.println(s1.concat(s4).concat(s2).concat(s3));
		System.out.println(s2+s4);
		System.out.println(s1.equalsIgnoreCase(s2.toUpperCase()));
		System.out.println(s4);
		System.out.println(s4.trim());
		System.out.println(s4.replace("a", "y"));
		System.out.println(s4.length());
		System.out.println(1+s1); //type coerces int 1 to string, using .concat() on 1 would result in error
	
		System.out.println("###### StringBuffer / StringBuilder #####");
		StringBuilder sb1 = new StringBuilder(s1);
		System.out.println(sb1);
		System.out.println(sb1.append("zzzzzz"));
		System.out.println(sb1.insert(1, " redbluegreen "));
		
		System.out.println("###### StringTokenizer #####");
		StringTokenizer toke = new StringTokenizer(s4, ":");
		while() {
			
		}
		Runtime rt = Runtime.getRuntime();
		Runtime rt1 = Runtime.getRuntime();
		Runtime rt2 = Runtime.getRuntime(); //all 3 of these will be the same runtime, called singleton pattern, no matter how many object references/instances created, there will always be one object they all reference
	}
}