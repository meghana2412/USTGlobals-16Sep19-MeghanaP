package com.ustglobals.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobals.springcore.di.Animal;
import com.ustglobals.springcore.di.Hello;
import com.ustglobals.springcore.di.Pet;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	
    	Hello hello = context.getBean(Hello.class);
    	System.out.println(hello.getMsg());
    	
    	
    	Animal animal = context.getBean(Animal.class);
    	animal.makeSound();
    	
    	Animal animal2 = (Animal)context.getBean("dog");
    	animal2.makeSound();
    	System.out.println("");
    	
    	Pet pet = context.getBean(Pet.class);
    	System.out.println(pet.getName());
    	pet.getAnimal().makeSound();
    }
}
