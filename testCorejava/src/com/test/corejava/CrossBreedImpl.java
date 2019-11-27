package com.test.corejava;

public class CrossBreedImpl {
	
	public static void main(String[] args) {
		
	    crossBreed cb= new crossBreed();
		cb.eat();
		
		Human human= new crossBreed();
		human.eat();
		
		Animal animal= new crossBreed();
		animal.eat();
		
	}

}

class crossBreed  implements Human,Animal{
	
	@Override
	public void eat() {
		System.out.println("I am eat anything");
		
	}
}
