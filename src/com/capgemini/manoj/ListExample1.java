package com.capgemini.manoj;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ListExample1 {

	public static void main(String[] args) {
		List al = new ArrayList();
		al.add("Manoj");
		al.add("Sharma");
		System.out.println("ArrayList : "+al);
		al.add(2, "aaa");
		/*System.out.println("ArrayList : "+al);
		al.addAll(al);
		System.out.println(al);
		al.clear();
		System.out.println(al);
		al.contains("Manoj");
		System.out.println(al);
		
		System.out.println(al.get(2));
		System.out.println(al.getClass());
		System.out.println(al.hashCode());
		System.out.println(al.indexOf("Manoj"));
		System.out.println(al.isEmpty());
		*/
		//System.out.println(al.lastIndexOf(al));
		//System.out.println(al.remove(2)+" "+al);
		//System.out.println(al.remove("aaa")+" "+al);
		//System.out.println(al.removeAll(al));
		//System.out.println(al);
		//System.out.println(al.set(1, "Kumar")+" "+al);
		System.out.println(al.size());
		/*Iterator it = al.iterator();
		while(it.hasNext()){
			Object o = it.next();
			System.out.println(o);
			
		}*/
		//System.out.println(al.toArray());
		//System.out.println(al);
		
		Set hs = new HashSet();
		Set ts = new TreeSet();
		hs.add("aaa");
		hs.add("bbb");
		System.out.println(hs);
		
		ts.add("mmm");
		ts.add("sss");
		System.out.println(ts);
				
		Map hm = new HashMap();
		hm.put(1, "Manoj");
		hm.put(2, "Sharma");
		hm.put(3, 2);
		hm.put(4, 2.5);
		hm.put(5, 961991665);
		System.out.println(hm);
		Map tm = new TreeMap();
		tm.put(1, "aaaa");
		tm.put(2, "12345");
		System.out.println(tm);
		
	}
}
