package by.epam.skillup.BasicsOfOOP.Task5.actions;

import java.io.IOException;

import by.epam.skillup.BasicsOfOOP.Task5.entity.Bouquet;

public class Magazine {
	private Builder builder;

	public void setBuilder(Builder builder) {
		this.builder = builder;
	}

	public Bouquet buildBouquet() throws IOException {
		builder.createPresent();
		builder.buildPrice();
		builder.buildPackaging();
		builder.buildFlowers();
		return builder.getBouquet();
	}

	public Builder getBuilder() {
		return builder;
	}
}
