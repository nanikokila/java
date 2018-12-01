package com.app;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class DemoHashMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(null, "20");
		hm.put(0, "vijay");
		hm.put(1, "ashok");
		hm.put(2, "naresh");
		hm.put(3, "naveen");
		//hm.put(null, "null");//null=null
		//hm.put(null, "10");//null=10 replaced
		System.out.println(hm);
		
		Set<Integer> s = hm.keySet();//to get keys
		System.out.println(s);
		
		Collection<String> c = hm.values();//to get values
		System.out.println(c);
		
		//to get both k and v(all entries)
		Set<Entry<Integer,String>> set = hm.entrySet();
		Iterator<Entry<Integer,String>> itr = set.iterator();
		while(itr.hasNext())
		{
			Entry<Integer,String> e = itr.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}
