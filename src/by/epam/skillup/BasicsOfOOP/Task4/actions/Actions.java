package by.epam.skillup.BasicsOfOOP.Task4.actions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import by.epam.skillup.BasicsOfOOP.Task4.Main;
import by.epam.skillup.BasicsOfOOP.Task4.entity.Treasure;

public class Actions {
	public ArrayList<Treasure> addTreasures() {
		ArrayList<Treasure> treasures = new ArrayList<>();
		try {
			FileReader fileReader = new FileReader("src/by/epam/skillup/BasicsOfOOP/Task4/data/treasures");
			Scanner scanner = new Scanner(fileReader);
			while (scanner.hasNextLine()) {
				String[] treasureLine = scanner.nextLine().split(" / ");
				String name = treasureLine[0];
				int price = Integer.parseInt(treasureLine[1]);
				treasures.add(new Treasure(name, price));
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("Файл не найден.");
		}

		return treasures;
	}

	public void printTreasures() {
		for (Treasure treasure : Main.cave.getTreasures()) {
			System.out.println(treasure);
		}
	}

	public void mostExpensiveTreasure() {
		int max = 0;
		Treasure maxTreasure = null;
		for (Treasure treasure : Main.cave.getTreasures()) {
			if (treasure.getPrice() > max) {
				max = treasure.getPrice();
				maxTreasure = treasure;
			}
		}
		System.out.println(maxTreasure);
	}

	public void searchTreasuresBySum(int sum) {
		ArrayList<Treasure> treasures = new ArrayList<>();
		for (Treasure treasure : Main.cave.getTreasures()) {
			if (treasure.getPrice() <= sum) {
				treasures.add(treasure);
			}
		}
		if (treasures.size() == 0) {
			System.out.println("По Вашему запросу ничего не найдено, попробуйте повысить цену.");
			return;
		}
		for (Treasure treasure : treasures) {
			System.out.println(treasure);
		}
	}
}
