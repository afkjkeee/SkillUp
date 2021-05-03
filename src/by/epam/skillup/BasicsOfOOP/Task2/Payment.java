package by.epam.skillup.BasicsOfOOP.Task2;

import java.util.ArrayList;
import java.util.Collections;

public class Payment {
	private double price;
	private Purchase purchase;

	public Payment(Product... product) {
		ArrayList<Product> products = new ArrayList<>();
		Collections.addAll(products, product);
		this.purchase = new Purchase(products);
		this.price = purchase.getPrice();
	}

	public void makePayment(double deposit) {
		System.out.println("Выбранный товар на сумму " + price);
		if (price < deposit) {
			System.out.print("Внесено " + deposit + ", ");
			double change = deposit - price;
			System.out.println("сдача " + change);
		} else if (price == deposit) {
			System.out.print("Внесено " + deposit + ", оплата прошла успешно.");
		} else {
			System.out.print("Внесено " + deposit + ", ");
			price = price - deposit;
			System.out.println("Для покупки выбранного товара не хватает " + price + ", доплатите.");
		}
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Purchase getPurchase() {
		return purchase;
	}

	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}

	class Purchase {
		private ArrayList<Product> product;
		private double price;

		public Purchase(ArrayList<Product> product) {
			this.product = product;
			this.price = totalPrice();
		}

		public double totalPrice() {
			double totalPrice = 0;
			for (Product product : this.product) {
				totalPrice += product.getPrice();
			}
			return totalPrice;
		}

		public ArrayList<Product> getProduct() {
			return product;
		}

		public void setProduct(ArrayList<Product> product) {
			this.product = product;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}
	}
}