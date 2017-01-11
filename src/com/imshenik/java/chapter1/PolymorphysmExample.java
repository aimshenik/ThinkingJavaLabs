package com.imshenik.java.chapter1;

//page 56
public class PolymorphysmExample {

	public static void main(String[] args) {

		// в этом классе метод erase(); Ќ≈ переопределен и вызываетс€
		// родительский.
		Triangle t = new Triangle();

		// в этом классе метод erase(); переопределен и вызываетс€ уже
		// переопределенный
		Circle c = new Circle();

		// ќжидаетс€ Shape, но т.к. Triangle одновременно €вл€етс€ фигурой,
		// то с ним можно обращатьс€ так же как с любой фигурой
		// ѕроисходит так называемое "восход€щее преобразование" от Triangle к
		// Shape
		doSmth(t);
		doSmth(c);
	}

	static void doSmth(Shape shape) {
		shape.erase();
	}
}

class Shape {
	void erase() {
		System.out.println("—тираем фигуру");
	}
}

class Triangle extends Shape {

}

class Circle extends Shape {
	void erase() {
		System.out.println("—тираем фигуру Circle");
	}
}