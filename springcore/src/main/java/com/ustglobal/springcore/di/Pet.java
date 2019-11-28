package com.ustglobal.springcore.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("pet")
public class Pet {//autowire through constructor
	
	public Pet() {
		
	}
	public Pet(String name, Animal animal) {
		super();
		this.name = name;
		this.animal = animal;
	}
		
	private String name;
	@Autowired//Auto Wiring "byName" or "byType" or "constructor"
	@Qualifier("cat")//qualifies this particular name
	private Animal animal;//this name is used for Auto wiring through byName
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Animal getAnimal() {
		return animal;
	}
	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
}
