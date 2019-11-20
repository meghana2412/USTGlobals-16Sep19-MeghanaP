package com.ustglobal.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestE {

	public static void main(String[] args) {
		
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("Bangalore", 560068);
		tm.put("Crp", 573116);
		tm.put("Hassan", 573201);//cant add anything except generics
		
		
		System.out.println("tree map element are : "+ tm);
		
		for(Map.Entry<String,Integer> m : tm.entrySet())
		{
			String key = m.getKey();
			Integer value = m.getValue();
			System.out.println("key is : "+key);
			System.out.println("value is : "+value);
			System.out.println("");
		}
	}
}
