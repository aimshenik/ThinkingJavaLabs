package com.imshenik.java.chapter2;

import com.imshenik.java.chapter2.A.B;

public class Fields {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.x = 10;
		B b = a.new B();
		
	}

}
class A{
	int x = 10;
	
	class B{
		int z = 20;
	}
}
