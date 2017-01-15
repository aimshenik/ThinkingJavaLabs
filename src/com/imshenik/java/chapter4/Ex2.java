package com.imshenik.java.chapter4;

import java.util.Random;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[25];

		Random rand = new Random(444);
		int j = rand.nextInt(100);

		for (int i = 0; i < arr.length; i++) {
			arr[i] = rand.nextInt(100);
			j = rand.nextInt(100);
			if (arr[i] < j) {
				System.out.println("arr[" + i + "] = " + arr[i] + " < случайного числа" + j);
			} else if (arr[i] > j) {
				System.out.println("arr[" + i + "] = " + arr[i] + " > случайного числа" + j);
			} else {
				System.out.println("arr[" + i + "] = " + arr[i] + " = случайному числу" + j);
			}

		}
	}

}
