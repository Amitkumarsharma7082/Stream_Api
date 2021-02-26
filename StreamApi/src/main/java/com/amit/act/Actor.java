package com.amit.act;

public interface Actor 
{
	void act();
	void speak();
	default void comedy()//if you direct apply on that is show the error in villain.java so its defined
	{
		System.out.println("I Can make ppl laugh");
	}
}
