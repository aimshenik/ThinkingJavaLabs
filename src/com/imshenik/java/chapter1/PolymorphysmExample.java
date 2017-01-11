package com.imshenik.java.chapter1;

//page 56
public class PolymorphysmExample {

	public static void main(String[] args) {

		// � ���� ������ ����� erase(); �� ������������� � ����������
		// ������������.
		Triangle t = new Triangle();

		// � ���� ������ ����� erase(); ������������� � ���������� ���
		// ����������������
		Circle c = new Circle();

		// ��������� Shape, �� �.�. Triangle ������������ �������� �������,
		// �� � ��� ����� ���������� ��� �� ��� � ����� �������
		// ���������� ��� ���������� "���������� ��������������" �� Triangle �
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
		System.out.println("������� ������");
	}
}

class Triangle extends Shape {

}

class Circle extends Shape {
	void erase() {
		System.out.println("������� ������ Circle");
	}
}