package by.epam.skillup.Classes.SimplestClasses;

import java.util.Scanner;

public class TriangleTest {
	public static void main(String[] args) {
		System.out.print("����� �. ������� x: ");
		Scanner sr = new Scanner(System.in);
		double x1 = sr.nextInt();
		System.out.print("������� y: ");
		double y1 = sr.nextInt();
		System.out.print("����� B. ������� x: ");
		double x2 = sr.nextInt();
		System.out.print("������� y: ");
		double y2 = sr.nextInt();
		System.out.print("����� C. ������� x: ");
		double x3 = sr.nextInt();
		System.out.print("������� y: ");
		double y3 = sr.nextInt();
		sr.close();

		Point a = new Point(x1, y1);
		Point b = new Point(x2, y2);
		Point c = new Point(x3, y3);

		Triangle triangle = new Triangle(a, b, c);
		System.out.println("�������� ������������: " + triangle.trianglePerimeter());
		System.out.println("������� ������������: " + triangle.triangleSquare());
		System.out.printf("����� ���������� ������: " + "x: " + triangle.medianCrossing().x + ", y: "
				+ triangle.medianCrossing().y);
	}
}

class Triangle {
	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double trianglePerimeter() {
		return Point.distance(a, b) + Point.distance(b, c) + Point.distance(a, c);
	}

	public double triangleSquare() {
		double p = trianglePerimeter() / 2;

		return Math.sqrt(p * (p - Point.distance(a, b)) * (p - Point.distance(b, c)) * (p - Point.distance(a, c)));
	}

	public Point medianCrossing() {
		return new Point((a.x + b.x + c.x) / 3, (a.y + b.y + c.y) / 3);
	}
}

class Point {
	public double x;
	public double y;

	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public static double distance(Point a, Point b) {
		double dx = a.x - b.x;
		double dy = a.y - b.y;

		return Math.sqrt(dx * dx + dy * dy);
	}
}
