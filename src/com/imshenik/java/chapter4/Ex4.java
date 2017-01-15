package com.imshenik.java.chapter4;

public class Ex4 {

	public static void main(String[] args) {
		
		short i = 1;
		
		do {
			System.out.print("Print  :" + i);
			boolean isSimple = true;
			
			for (int j = 2; j < i - 1; j++) {
				if (i % j == 0) {
					isSimple = false;
				}
			}
			if (isSimple) {
				System.out.print(" - простое");
			}
			
			isSimple = true;
			System.out.println();
			i++;

		} while (i <= 100);
	}

}
