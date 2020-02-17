package com.capg;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
class MapDemo
{
	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(101,"sai");
		map.put(102,"kumar");
		
		
		
		
		//map.put(null,"N");
		//map.put(, arg1)
		System.out.println(map);
		
		Set <Integer>set=map.keySet();
	 Collection <String> c=map.values();
		Iterator it=set.iterator();
		Iterator bt =c.iterator();
		while (it.hasNext()) {
			Integer key = (Integer) it.next();
			
			System.out.println(key+" "+map.get(key));
			
		}
		while (bt.hasNext()) {
			String values = (String) bt.next();
			System.out.println(values+" "+map.get(key));
		}
		
		

	}

}
