package by.epam.skillup.BasicsOfOOP.Task5.actions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

import by.epam.skillup.BasicsOfOOP.Task5.entity.Bouquet;
import by.epam.skillup.BasicsOfOOP.Task5.entity.Flower;
import by.epam.skillup.BasicsOfOOP.Task5.entity.Packaging;
import by.epam.skillup.BasicsOfOOP.Task5.entity.PackagingType;
import by.epam.skillup.BasicsOfOOP.Task5.entity.Recipient;

public class Actions {
	private static Scanner scanner = new Scanner(System.in);
	private static Recipient recipient = new Recipient();

	public void run() throws IOException {
		System.out.println("Введите имя получателя букета:");
		recipient.setName(checkName());
		Magazine magazine = new Magazine();
		magazine.setBuilder(new Builder());
		recipient.setBouquet(magazine.buildBouquet());
		recipient.getBouquet().setFlowers(fillBouquet());
		System.out.println("Ваш подарок для " + recipient.getName() + " готов!\n");
		printBouquet(recipient.getBouquet());
	}

	public static String checkName() {
		Pattern pattern = Pattern.compile("[\\D\\w ]{2,15}");
		scanner.useDelimiter("[\r\n]");
		while (!scanner.hasNext(pattern)) {
			scanner.nextLine();
			System.out.println("Неверно! Длина имени должна составлять от 2 до 15 символов.");
		}
		return scanner.nextLine();
	}

	public static double checkInputPrice() {
		Pattern pattern = Pattern.compile("[\\d ]{1,3}");
		scanner.useDelimiter("[\r\n]");
		while (true) {
			while (!scanner.hasNext(pattern)) {
				scanner.nextLine();
			}
			double input = scanner.nextDouble();
			if (input >= 5 && input <= 100) {
				return input;
			} else {
				System.out.println("Минимальная сумма 5, максимальная 100");
			}
		}
	}

	public static Packaging choosePackaging() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String start = "Выберите упаковку, введя число от 1 до 3:\n1. " + PackagingType.КОРОБКА + "\n2. "
				+ PackagingType.ЛЕНТА + "\n3. " + PackagingType.УПАКОВОЧНАЯ_БУМАГА;
		String choise = "";
		System.out.println(start);
		choise = reader.readLine();
		Packaging packaging = null;

		switch (choise) {
		case "1":
			packaging = new Packaging(PackagingType.КОРОБКА);
			break;
		case "2":
			packaging = new Packaging(PackagingType.ЛЕНТА);
			break;
		case "3":
			packaging = new Packaging(PackagingType.УПАКОВОЧНАЯ_БУМАГА);
			break;
		}

		return packaging;
	}

	public static ArrayList<Flower> fillBouquet() {
		ArrayList<Flower> products = randomFill();

		return products;
	}

	private static ArrayList<Flower> randomFill() {
		ArrayList<Flower> flowers = addFlowers();
		ArrayList<Flower> bouquet = new ArrayList<>();
		double minPrice = 1;
		Random random = new Random();
		double restOfMoney = recipient.getBouquet().getPrice();
		while (restOfMoney > 0) {
			Flower flower = flowers.get(random.nextInt(flowers.size()));
			double flowerPrice = flower.getPrice();
			if (restOfMoney - flowerPrice > 0) {
				bouquet.add(flower);
				restOfMoney = restOfMoney - flowerPrice;
			} else if (minPrice > restOfMoney) {
				break;
			}
		}
		recipient.getBouquet().setPrice(recipient.getBouquet().getPrice() - restOfMoney);

		return bouquet;
	}

	private static ArrayList<Flower> addFlowers() {
		ArrayList<Flower> flowers = new ArrayList<>();
		try {
			FileReader fileReader = new FileReader("src/by/epam/skillup/BasicsOfOOP/Task5/data/flowers");
			Scanner scanner = new Scanner(fileReader);
			while (scanner.hasNextLine()) {
				String[] productLine = scanner.nextLine().split(" / ");
				try {
					String flower = productLine[0];
					double price = Double.parseDouble(productLine[1]);
					flowers.add(new Flower(flower, price));
				} catch (NullPointerException e) {
					e.printStackTrace();
				}
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			System.out.println("Файл не найден.");
		}

		return flowers;
	}

	public void printBouquet(Bouquet bouquet) {
		System.out.println(bouquet);
	}
}
