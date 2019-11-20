package com.ustglobals.thread.properties;

import com.ustglobals.thread.defining.MyThread;

public class MyTread extends Thread{
	
	public static void main(String[] args) {
		
		System.out.println("main started");
		
		String tname = Thread.currentThread().getName();
		System.out.println("current thread is : "+tname);
		
		MyThread t1 = new MyThread();
		String mname = t1.getName();
		System.out.println("MyThread name : "+mname);
		
		Thread.currentThread().setName("Bala");
		
		t1.setName("Golu");
		System.out.println("MyThread new name : "+t1.getName());
		
		System.out.println(10/0);
		
		System.out.println("main ended");
	}

}
