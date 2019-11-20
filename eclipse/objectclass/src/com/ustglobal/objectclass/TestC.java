package com.ustglobal.objectclass;

public class TestC {

	public static void main(String[] args) {
		
		Marker m = new Marker();
		int h = m.hashCode();
		String s = m.toString();
		System.out.println("Hashcode value of m is "+h);
		System.out.println("toString value of m is "+s);
		
		
		Marker p = new Marker();
		System.out.println(p);
		}
}
