package com.ustglobal.maps;

import java.util.HashMap;

public class TestA {

	public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put("Meghana",94813);
		hm.put("Pavan",99164);
		hm.put("Sachin",7026);

		System.out.println("data : "+hm);
		
		hm.put("Sachin",9765);
		System.out.println("after modify :"+hm);
		
		hm.put("sanmathi",23456);
		System.out.println("After sanmathi : "+hm);
		
		hm.put(null,4567);
		System.out.println("after null "+hm);
		
		hm.put(null,45678);
		System.out.println("After duplicate null : "+hm);
		
		System.out.println("******************** get method**********");
		
		Object phoneno = hm.get("Meghana");
		System.out.println("Value : "+phoneno);
		System.out.println("");
		
		Object phoneno1 = hm.get("Sahana");
		System.out.println("Value : "+phoneno1);
		System.out.println("");
		
		System.out.println("****************remove method***************");
		
		Object value = hm.remove("sanmathi");
		System.out.println("value : "+value);
		
		System.out.println("After remove method : "+hm);
		

	}
}
