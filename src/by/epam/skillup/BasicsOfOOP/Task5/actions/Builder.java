package by.epam.skillup.BasicsOfOOP.Task5.actions;

import java.io.IOException;
import java.util.ArrayList;

import by.epam.skillup.BasicsOfOOP.Task5.entity.Bouquet;
import by.epam.skillup.BasicsOfOOP.Task5.entity.Packaging;

public class Builder {
	private Bouquet bouquet;

	public void createPresent() {
		bouquet = new Bouquet();
	}

	public void buildPrice() {
		System.out.println("Введите сумму букета:");
		double price = Actions.checkInputPrice();
		bouquet.setPrice(price);
	}

	public void buildPackaging() throws IOException {
		Packaging packaging = Actions.choosePackaging();
		bouquet.setPackaging(packaging);
	}

	public void buildFlowers() {
		bouquet.setFlowers(new ArrayList<>());
	}

	public Bouquet getBouquet() {
		return bouquet;
	}

	public void setPresent(Bouquet bouquet) {
		this.bouquet = bouquet;
	}
}
