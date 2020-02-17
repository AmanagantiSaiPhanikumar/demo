package com.capg;

public class Employee2 implements Comparable{

	
		private int eid;
		private String ename;
		private double salary;
		
		
		public Employee2 (int eid, String ename,double salary)
		{
			super();
			this.eid=eid;
			this.ename=ename;
			this.salary=salary;
		
		
		
		
		
		
		
	}



	int compareTo(Employee2 e1)
	{
		Employee2 e1=this;
		String s1=e1.toString();
		String s2=e2.toString();
		return - s1.compareTo(s2);
		
		
	}



}
