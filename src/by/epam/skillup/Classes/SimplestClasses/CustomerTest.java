package by.epam.skillup.Classes.SimplestClasses;

import java.util.ArrayList;
import java.util.Comparator;

public class CustomerTest {
	public static void main(String[] args) {
		Customers customers = new Customers("ProStore");

		customers.addCustomer("Артур", "Журавлев", "Петрович", "Минск", 0606, 132);
		customers.addCustomer("Андрей", "Петрович", "Сергеевич", "Москва", 1734, 16);
		customers.addCustomer("Екатерина", "Варламова", "Артуровна", "Санкт-Петербург", 7894, 999);

		customers.sortByName();
		customers.printCustomers();

		System.out.println();
		ArrayList<Customer> arr = customers.sortByCreditCard(1000, 9000);
		for (Customer customer : arr) {
			System.out.println(customer);
		}
	}
}

class Customer {
	private int startId = 1;
	private int id;
	private String name;
	private String surname;
	private String patronymic;
	private String adress;
	private long cardNumber;
	private long bankAccount;

	public Customer(String name, String surname, String patronymic, String adress, long cardNumber, long bankAccount) {
		this.id = startId++;
		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
		this.adress = adress;
		this.cardNumber = cardNumber;
		this.bankAccount = bankAccount;
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

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public long getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}

	public long getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(long bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public String toString() {
		return "id = " + id + ", имя = " + name + ", фамилия = " + surname + ", отчество = " + patronymic + ", адрес = "
				+ adress + ", номер карты = " + cardNumber + ", номер счета = " + bankAccount;
	}
}

class Customers {
	private String shop;
	private ArrayList<Customer> base;

	public Customers(String shop) {
		this.shop = shop;
		this.base = new ArrayList<>();
	}

	void addCustomer(String name, String surname, String patronymic, String address, long cardNumber,
			long bankAccount) {
		base.add(new Customer(name, surname, patronymic, address, cardNumber, bankAccount));
	}

	public void sortByName() {
		base.sort(Comparator.comparing(Customer::getSurname));
	}

	ArrayList<Customer> sortByCreditCard(long min, long max) {
		ArrayList<Customer> cardList = new ArrayList<>();
		for (Customer customer : base) {
			if (customer.getCardNumber() >= min && customer.getCardNumber() <= max) {
				cardList.add(customer);
			}
		}
		return cardList;
	}

	public void printCustomers() {
		for (Customer customers : base) {
			System.out.println("id = " + customers.getId() + ", имя = " + customers.getName() + ", фамилия = "
					+ customers.getSurname() + ", отчество = " + customers.getPatronymic() + ", адрес = "
					+ customers.getAdress() + ", номер карты = " + customers.getCardNumber() + ", номер счета = "
					+ customers.getBankAccount());
		}
	}

	ArrayList<Customer> getBase() {
		return base;
	}

	public void setBase(ArrayList<Customer> base) {
		this.base = base;
	}

	public String getShop() {
		return shop;
	}

	public void setShop(String shop) {
		this.shop = shop;
	}
}
