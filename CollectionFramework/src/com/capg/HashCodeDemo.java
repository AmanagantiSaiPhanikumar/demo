package com.capg;

import java.util.HashSet;
import java.util.Set;




public class HashCodeDemo {

	public static void main(String[] args) {
		
		Set<Employee2> set=new HashSet<Employee2>();
		
		Employee2 e1=new Employee2(101,"sai",4000);
		Employee2 e2=new Employee2(102,"sai",4000);
		Employee2 e3=new Employee2(103,"sai",4000);
		//ployee2 e4=new Employee2(101"sai",4000);
		set.add(e1);
		set.add(e2);
		System.out.println(set);
	}

}
