package com.capg;

import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
	TreeSet<Employee1> set=new TreeSet<Employee1>();
			
	public static void main(String[] args) {
	
		SetDemo sd= new SetDemo();
		Set ss=sd.getSet();
		System.out.println(ss);	
	}
  
	public Set getSet()
	{
		
		set.add(new Employee1(101));
		set.add(new Employee1(102));
		//set.add("B");
		
	return	set;
		
		
	}
	
	
	
	
	
	
}
