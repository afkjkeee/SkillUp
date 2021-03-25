package by.epam.skillup.Classes.SimplestClasses;

import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		System.out.print("������� ������ ����������: ");
		Scanner sr = new Scanner(System.in);
		int variableA = sr.nextInt();

		System.out.print("������� ������ ����������: ");
		int variableB = sr.nextInt();
		sr.close();

		Task1 task1 = new Task1();
		String result = task1.variablePrint(variableA, variableB) + "\n" + task1.variablesSum(variableA, variableB)
				+ "\n" + task1.maxOfVariables(variableA, variableB);
		System.out.println(result);
	}

	public String variablePrint(double variableA, double variableB) {
		return "��������� ���������� - " + variableA + " � " + variableB;
	}

	public String variablesSum(double variableA, double variableB) {
		double sum = variableA + variableB;

		return "����� ���������� ����� - " + sum;
	}

	public String maxOfVariables(double variableA, double variableB) {
		if (variableA > variableB) {

			return "������������ ������ ����� ������ ���������� �������� - " + variableA;
		}

		return "������������ ������ ����� ������ ���������� �������� - " + variableB;
	}
}
