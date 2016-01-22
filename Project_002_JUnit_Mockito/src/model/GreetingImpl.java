package model;

import interfaces.Greeting;

public class GreetingImpl implements Greeting{

	//INTERFACE Greeting
	@Override
	public String greet(String name) {
		//CONDITIONS
		if (name == null || name.length() == 0) {
			throw new IllegalArgumentException();
		}
		
		return "Hello " + name;
	}
}
