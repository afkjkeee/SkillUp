package by.epam.skillup.BasicsOfOOP.Task4.entity;

public class Treasure {
	private String name;
	private int price;

	public Treasure(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return name + ", стоимость - " + price;
	}
}
