//write a java program to create a class called Dog with a name and age attribbute
//Create two instances of the "Dog" class, set their attributes using the 
//constructor and modify the attributes using the setter methods and print the updated values.

import java.util.*;
public class Dog {

	private String name,breed;
	
	Dog(String name,String breed){
		this.name = name;
		this.breed = breed;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public static void main(String args[]) {
		Dog dog1 = new Dog("Sophie","German Shepherd");
		Dog dog2 = new Dog("Chinnu","Bulldog");
		
		//Dog1
		System.out.println("\nDog 1 \n");
		System.out.println("Name : "+dog1.name+"\nBreed : "+dog1.breed);
		
		//dog2
		System.out.println("\nDog2 \n");
		System.out.println("Name : "+dog2.name+"\nBreed : "+dog2.breed);
		
		System.out.println("\nAfter updating\n");
		
		
		dog1.setBreed("Golden Retriever");
		dog1.setName("Charlie");
		
		
		dog2.setName("Buddy");
		dog2.setBreed("Siberian Husky");
		
		System.out.println("\nDog 1 \n");
		System.out.println("Name : "+dog1.name+"\nBreed : "+dog1.breed);
		
		System.out.println("\nDog 2 \n");
		System.out.println("Name : "+dog2.name+"\nBreed : "+dog2.breed);
	
	}
	
}
