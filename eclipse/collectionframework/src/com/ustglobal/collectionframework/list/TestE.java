package com.ustglobal.collectionframework.list;

import java.util.ArrayList;

public class TestE {
	public static void main(String[] args) {
		
		ArrayList al1 = new ArrayList();
		al1.add("Pavan");

		Object o = al1.get(0);
		String name = (String) o;
		
		name = name.toUpperCase();
		System.out.println(name);
	}
}
