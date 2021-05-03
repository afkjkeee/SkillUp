package by.epam.skillup.BasicsOfOOP.Task5.entity;

import java.util.ArrayList;

public class Bouquet {
	private double price;
	private Packaging packaging;
	private ArrayList<Flower> flowers;

	public String printFlowers() {
		String result = "";
		for (Flower flower : flowers) {
			result = result + flower + "\n";
		}

		return result;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Packaging getPackaging() {
		return packaging;
	}

	public void setPackaging(Packaging packaging) {
		this.packaging = packaging;
	}

	public ArrayList<Flower> getFlowers() {
		return flowers;
	}

	public void setFlowers(ArrayList<Flower> flowers) {
		this.flowers = flowers;
	}

	@Override
	public String toString() {
		return "Стоимость букета - " + price + ", упаковка - " + packaging + ", содержимое:\n" + printFlowers();
	}
}
