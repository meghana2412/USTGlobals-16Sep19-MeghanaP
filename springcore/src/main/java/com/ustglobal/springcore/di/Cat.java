package com.ustglobal.springcore.di;

import org.springframework.stereotype.Component;

@Component("cat")
public class Cat implements Animal {//autowire through byName because name=animal in pet class and inside CAT bean also id=animal

	@Override
	public void makeSound() {
		System.out.println("Meeaaooooooooooo");
		
	}

}
