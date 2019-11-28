package com.ustglobal.springcore.di;

public class Dog implements Animal {//autowiring through byType(property)

	@Override
	public void makeSound() {
		System.out.println("Bow Bow Bow");
	}
	
}
