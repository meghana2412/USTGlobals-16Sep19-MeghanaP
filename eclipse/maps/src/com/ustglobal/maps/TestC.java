package com.ustglobal.maps;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;

public class TestC {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> lh = new LinkedHashMap<String, Integer>();
		lh.put("Bangalore", 560068);
		lh.put("crp", 573116);
		lh.put("Hassan", 573201);

		System.out.println(lh);
		System.out.println("******************using foe each method************");
		Set<String> s = lh.keySet();
		for(String key : s)
		{
			System.out.println("key values are : "+key);
		
		}
		System.out.println("");
		
		Collection<Integer> c = lh.values();
		
		for(Integer value : c)
		{
			System.out.println("Collection value are : "+value);
		}
		System.out.println("========================");
	}
}
