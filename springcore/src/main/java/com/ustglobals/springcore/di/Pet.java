package com.ustglobals.springcore.di;

public class Pet {
	
	
	 public Pet(String name, Animal animal ) 
	 { 
		 this.name = name;
		 this.animal =animal; 
		 }
	 
	private String name;
	private Animal animal;
	
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
