package com.capg;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;
public class LinkHashSet {

	public static void  main(String[] args) {
		
		TreeSet<String> set=new TreeSet<String>();
	String s1=	set.add(new String("A"));
	 set.add(new String("A"));
	
	 System.out.println(set.add(new String("6")));
		System.out.println(set.compareTo());
		
		

	}

}
