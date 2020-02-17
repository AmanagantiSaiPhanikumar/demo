package com.capg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		List<String>list =new Vector<>() ;                                                                //ArrayList<String>();
     List<String> myList=getList(list);
		
		
		System.out.println(myList);
		Iterator <String>it=list.iterator();
		while (it.hasNext()) {
			
			String s = it.next();
			System.out.println(s);
			
		}
		
		
		
		
		
		
		
		
		
	}
	public static List <String> getList(List<String> l) {
		l.add("sai");
         l.add("kumar");
         l.add("phani");
         l.add(2, new String("pppp"));
         return l;
         
         
         
	}
	
	
	
}
