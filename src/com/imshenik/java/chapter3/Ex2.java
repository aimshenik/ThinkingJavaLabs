package com.imshenik.java.chapter3;

public class Ex2 {

	/** Демонстрация совмещения имен когда две ссылки ссылаются на один объект
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KK kk1 = new KK();
		KK kk2 = new KK();
		kk1.x = 2;
		kk2.x = (float) 312312322222222.2;
		System.out.println(kk2.x);
		kk2 = kk1;
		System.out.println(kk2.x);
		
	}

}
class KK{
	float x;
	
}