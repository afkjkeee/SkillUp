package by.epam.skillup.Classes.SimplestClasses;

import java.util.ArrayList;

public class BookTest {
	public static void main(String[] args) {
		BooksBase booksBase = new BooksBase("Oz");

		booksBase.addBook("��������� �����������", "��������", "�������", 2012, 286, 9.7, "�������");
		booksBase.addBook("�������� � �����", "�����������", "������", 2015, 220, 12, "�������");
		booksBase.addBook("�������� � �������", "���������", "������", 2018, 318, 16, "������");

		for (int i = 0; i < booksBase.getBase().size(); i++) {
			System.out.println(booksBase.getBase().get(i));
		}
		System.out.println("\n" + "�����, ���������� �����������:");
		ArrayList<Book> byAuthors = booksBase.printByAuthors("�����������");
		for (Book book : byAuthors) {
			System.out.println(book);
		}
		System.out.println("\n" + "�����, ���������� ����� ������:");
		ArrayList<Book> byPubHouse = booksBase.printByPubHouse("������");
		for (Book book : byPubHouse) {
			System.out.println(book);
		}

		System.out.println("\n" + "�����, ���������� ����� 2013 ����:");
		ArrayList<Book> afterYear = booksBase.printAfterThisYear(2013);
		for (Book book : afterYear) {
			System.out.println(book);
		}
	}
}

class Book {
	private int startId = 1;
	private int id;
	private String name;
	private String author;
	private String pubHouse;
	private int yearOfPub;
	private int numbersOfPages;
	private double price;
	private String bindingType;

	public Book(String name, String author, String pubHouse, int yearOfPub, int numbersOfPages, double price,
			String bindingType) {
		this.id = startId++;
		this.name = name;
		this.author = author;
		this.pubHouse = pubHouse;
		this.yearOfPub = yearOfPub;
		this.numbersOfPages = numbersOfPages;
		this.price = price;
		this.bindingType = bindingType;
	}

	public int getStartId() {
		return startId;
	}

	public void setStartId(int startId) {
		this.startId = startId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPubHouse() {
		return pubHouse;
	}

	public void setPubHouse(String pubHouse) {
		this.pubHouse = pubHouse;
	}

	public int getYearOfPub() {
		return yearOfPub;
	}

	public void setYearOfPub(int yearOfPub) {
		this.yearOfPub = yearOfPub;
	}

	public int getNumbersOfPages() {
		return numbersOfPages;
	}

	public void setNumbersOfPages(int numbersOfPages) {
		this.numbersOfPages = numbersOfPages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBindingType() {
		return bindingType;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}

	@Override
	public String toString() {
		return "����� id=" + id + ", name=" + name + ", author=" + author + ", pubHouse=" + pubHouse + ", yearOfPub="
				+ yearOfPub + ", numbersOfPages=" + numbersOfPages + ", price=" + price + ", bindingType=" + bindingType
				+ "]";
	}
}

class BooksBase {
	private String storeName;
	private ArrayList<Book> base;

	public BooksBase(String storeName) {
		this.storeName = storeName;
		this.base = new ArrayList<>();
	}

	void addBook(String name, String author, String pubHouse, int yearOfPub, int numbersOfPages, double price,
			String bindingType) {
		base.add(new Book(name, author, pubHouse, yearOfPub, numbersOfPages, price, bindingType));
	}

	ArrayList<Book> printByAuthors(String authorName) {
		ArrayList<Book> byAuthors = new ArrayList<>();
		for (Book book : base) {
			if (book.getAuthor().equalsIgnoreCase(authorName)) {
				byAuthors.add(book);
			}
		}

		return byAuthors;
	}

	ArrayList<Book> printByPubHouse(String PubHouseName) {
		ArrayList<Book> byPubHouse = new ArrayList<>();
		for (Book book : base) {
			if (book.getPubHouse().equalsIgnoreCase(PubHouseName)) {
				byPubHouse.add(book);
			}
		}

		return byPubHouse;
	}

	ArrayList<Book> printAfterThisYear(int year) {
		ArrayList<Book> afterThisYear = new ArrayList<>();
		for (Book book : base) {
			if (book.getYearOfPub() > year) {
				afterThisYear.add(book);
			}
		}

		return afterThisYear;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public ArrayList<Book> getBase() {
		return base;
	}

	public void setBase(ArrayList<Book> base) {
		this.base = base;
	}
}
