package by.epam.skillup.BasicsOfOOP.Task4;

import java.io.IOException;

import by.epam.skillup.BasicsOfOOP.Task4.actions.Menu;
import by.epam.skillup.BasicsOfOOP.Task4.entity.Cave;

public class Main {
	public static Cave cave = new Cave("Dragon");

	public static void main(String[] args) throws IOException {
		Menu menu = new Menu();
		menu.processingOperation();
	}
}