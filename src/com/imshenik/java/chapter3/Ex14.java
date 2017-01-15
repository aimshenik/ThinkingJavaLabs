package com.imshenik.java.chapter3;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Compare2strings(new String("asdasdasd"), new String("asdasdasd"));
	}

	public static void Compare2strings(String s1, String s2) {
		if (s1 == s2) {
			System.out.println("одинаковые по ссылке");
		} else {
			System.out.println("НЕ одинаковые по ссылке");
		}
		if (s1.equals(s2)) {
			System.out.println("одинаковые по значению");
		} else {
			System.out.println("НЕ одинаковые по значению");
		}
		if (s1.length() > s2.length()) {
			System.out.println("S1 длиннее");
		} else if ((s1.length() < s2.length())) {
			System.out.println("S2 длиннее");
		} else {
			System.out.println("S1 и S2 равны");
		}

	}
}
