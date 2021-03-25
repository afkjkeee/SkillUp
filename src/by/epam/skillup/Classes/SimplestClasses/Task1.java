package by.epam.skillup.Classes.SimplestClasses;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		System.out.print("Введите первую переменную: ");
		Scanner sr = new Scanner(System.in);
		int variableA = sr.nextInt();

		System.out.print("Введите вторую переменную: ");
		int variableB = sr.nextInt();
		sr.close();

		Task1 task1 = new Task1();
		String result = task1.variablePrint(variableA, variableB) + "\n" + task1.variablesSum(variableA, variableB)
				+ "\n" + task1.maxOfVariables(variableA, variableB);
		System.out.println(result);
	}

	public String variablePrint(double variableA, double variableB) {
		return "Введенные переменные - " + variableA + " и " + variableB;
	}

	public String variablesSum(double variableA, double variableB) {
		double sum = variableA + variableB;

		return "Сумма переменных равна - " + sum;
	}

	public String maxOfVariables(double variableA, double variableB) {
		if (variableA > variableB) {

			return "Максимальным числом среди данных переменных является - " + variableA;
		}

		return "Максимальным числом среди данных переменных является - " + variableB;
	}
}
