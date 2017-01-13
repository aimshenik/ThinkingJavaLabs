package com.imshenik.java.chapter3;

import java.util.*;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int j = rand.nextInt();

		System.out.println(j % 2 == 0 ? "орёл" : "решка");
	}

}
