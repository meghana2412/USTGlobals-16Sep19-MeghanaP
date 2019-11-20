package com.ustglobal.lambaexpressions;

public class TestGreet {

	public static void main(String[] args) {
		
		GreetInterface greeting = (message) -> {
			System.out.println("hello");
			System.out.println(message);
		};
		greeting.greet("hello welcome");
		
	}
}
