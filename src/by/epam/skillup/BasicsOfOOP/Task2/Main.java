package by.epam.skillup.BasicsOfOOP.Task2;

public class Main {
	public static void main(String[] args) {
		Product product = new Product("Лошадь", 700);
		Product product2 = new Product("Корова", 500);
		Product product3 = new Product("Телега", 200);
		Product product4 = new Product("Мороженое", 2);

		Payment payment = new Payment(product, product2, product3, product4);
		payment.makePayment(1000);
	}
}
