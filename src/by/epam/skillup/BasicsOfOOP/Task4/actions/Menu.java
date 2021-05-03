package by.epam.skillup.BasicsOfOOP.Task4.actions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	public boolean processingOperation() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Actions actions = new Actions();
		String start = "Выберите действие:\n1. Просмотр всех сокровищ;\n2. Самое дорогое сокровище;\n"
				+ "3. Выбор сокровищ на заданную сумму;\n4. Выход";
		String choice = "";
		System.out.println(start);
		choice = reader.readLine();
		switch (choice) {
		case "1":
			System.out.println("Все сокровища, находящиеся в пещере:");
			actions.printTreasures();
			break;
		case "2":
			System.out.println("Самое дорогое сокровище:");
			actions.mostExpensiveTreasure();
			break;
		case "3":
			int sum = 0;
			boolean isValid = false;
			while (!isValid) {
				System.out.println("Введите сумму:");
				Scanner scanner = new Scanner(System.in);
				try {
					sum = scanner.nextInt();
					isValid = true;
				} catch (InputMismatchException e) {
					System.out.println("Неверный ввод, повторите попытку.");
				}
				scanner.close();
			}
			System.out.println("Введенная сумма - " + sum);
			actions.searchTreasuresBySum(sum);
			break;
		case "4":
			System.out.println("Пока");
			return true;
		}
		return false;
	}
}
