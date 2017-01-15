package com.imshenik.java.chapter4;

/*Exercise 10: (3) Write a program with two constant values, one with alternating binary 
ones and zeroes, with a zero in the least-significant digit, and the second, also alternating, 
with a one in the least-significant digit (hint:It’s easiest to use hexadecimal constants for 
this). Take these two values and combine them in all possible ways using the bitwise 
operators, and display the results using Integer.toBinaryString( ). */

public class Ex5 {

	public static void main(String[] args) {
		final int i = 0b1000101111;
		final int j = 0xff56;
		printBinaryInt("i : ", i);
		printBinaryInt("j : ", j);
		printBinaryInt("i & j", i & j);
		printBinaryInt("i | j", i | j);
		printBinaryInt("i ^ j", i ^ j);
		printBinaryInt("~i", ~i);
		printBinaryInt("~j", ~j);

	}

	static void printBinaryInt(String s, int i) {
		String z = Integer.toBinaryString(i);
		char c[] = z.toCharArray();
		System.out.print(s + ", int: " + i + ", binary:\n   ");
		for (int j = 0; j < z.length(); j++) {
			System.out.print(c[j] == '1' ? 1 : 0);
		}
		System.out.println();
	}

}
