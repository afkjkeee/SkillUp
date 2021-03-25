package by.epam.skillup.Classes.SimplestClasses;

public class Task2 {
	private int a;
	private int b;

	public static void main(String[] args) {
		Task2 task2 = new Task2();
		task2.setA(5);
		task2.setB(7);
		System.out.println("a - " + task2.getA());
		System.out.println("b - " + task2.getB());

	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
}
