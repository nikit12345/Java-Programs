package com.example;

abstract class B{
	B() {
		
	}
	abstract  void hi();
}
class C extends B{

	@Override
	 void hi() {
System.out.println("dsfd");		
	}
	
}
public class A {
public static void main(String[] args) {
	C c = new C();
	c.hi();
	
}
}
