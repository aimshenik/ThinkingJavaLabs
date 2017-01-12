package com.imshenik.java.chapter2;

import java.util.Date;

public class Exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex2.talk(10);
		new Ex3().doJob();
		new Ex4().doWork();
		new Ex5().doWork();
		Ex8.doWork();
		for (int i = 0; i < 0; i++) {
			if (args[i] != null) {
				Ex10.Say(args[i].toString());
			}
		}
	}

}

class ATypeName {
	static String talk() {
		return "MSG from ATypeName class";
	}
}

class DataOnly {
	static int i = 5;
	double d = 100;
	boolean b = true;
}

class Incrementable {
	static void increment() {
		System.out.println("Работающая программа");
	}
}

class AllTheColorsOfTheRainbow {
	int anIntegerRepresentingColors = 255;

	void changeTheHueOfTheColor(int newHue) {
		anIntegerRepresentingColors = anIntegerRepresentingColors - newHue;
		System.out.println(anIntegerRepresentingColors);
	}
}

class Ex1 {
	int x;
	char c;
}

class Ex2 {
	static void talk(int x) {
		System.out.println("Сегодня");
		System.out.println(new Date());
	}
}

class Ex3 {
	String s = ATypeName.talk();

	void doJob() {
		System.out.println(s);
	}
}

class Ex4 {
	DataOnly dOnly = new DataOnly();

	void doWork() {
		if (dOnly.b) {
			System.out.println(dOnly.i + dOnly.d);

		}
	}
}

class Ex5 {
	Ex4 ex4 = new Ex4();

	void doWork() {
		ex4.doWork();
	}
}

class Ex6 {
	int storage(String s) {
		return s.length() * 2;
	}
}

class Ex7 {
	void doWork() {
		Incrementable.increment();
	}
}

class Ex8 {
	static void doWork() {
		DataOnly d1 = new DataOnly();
		DataOnly d2 = new DataOnly();
		System.out.println(d1.i);
		System.out.println(d2.i);
		d1.i++;
		System.out.println(d2.i);
	}
}

class Ex9 {
	static void doWork() {
		Double double1 = new Double(0.1);
		Boolean b = new Boolean(false);
	}
}

class Ex10 {

	static void Say(String s) {
		System.out.println(s);

	}
}

class Ex11 {
	static void work(String s) {
		new AllTheColorsOfTheRainbow().changeTheHueOfTheColor(10);

	}
}
class Ex12 {
	static void work(String s) {
		HelloDate hs = new HelloDate();
		hs.talk();
	}
}
class Ex13 {
	static void work(String s) {
		System.out.println("Project -> Generate Javadoc");
	}
}
class Ex14 {
	
	/**
	 * Упражнение 14.
	 * @param s - Это какая-то строка
	 * Упражнение 14.
	 */
	static void work(String s) {
		
		Ex13.work("asd");
	}
}
class Ex15 {
	static Ex2 ss = new Ex2();
	static void work(String s) {
		ss.talk(0);
	}
}
class Ex16 {
	static Ex2 ss = new Ex2();
	static void work(String s) {
		System.out.println("ДА НУ НА");
	}
}


