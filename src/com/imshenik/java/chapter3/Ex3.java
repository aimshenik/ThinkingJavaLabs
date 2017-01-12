package com.imshenik.java.chapter3;

public class Ex3 {

	/**
	 * Демонстрация совмещения имен при вызове методов
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.x = 555;
		System.out.println(a.x);
		B.gogogo(a);
		System.out.println(a.x);
	}

}
class A {
	float x = 0;
}
class B{
	static void gogogo(A a){
		a.x = (float) 3.4225;
	}
}