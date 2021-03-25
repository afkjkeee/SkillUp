package by.epam.skillup.Classes.AggregationAndComposition;

import java.util.ArrayList;
import java.util.Comparator;

public class BankTest {
	public static void main(String[] args) {
		Bank bank = new Bank("Alfa Bank");
		Client burak = new Client("Бурак", "Артем", "Сергеевич", "ВМ1234567");

		bank.addClient(burak);

		burak.addAccount(new Account(100, 1000));
		burak.addAccount(new Account(101, 228));
		burak.addAccount(new Account(102, -700));
		burak.addAccount(new Account(103, -328));
		burak.addAccount(new Account(104, 1785));

		burak.getInformation();
		burak.unblockAcc(100);
		burak.unblockAcc(104);
		burak.getInformation();
		burak.blockAcc(104);
		burak.getInformation();
		burak.printPositiveBalance();
		burak.printNegativeBalance();
		burak.printAllBalace();
		burak.sortByBalace();
		burak.getInformation();
	}
}

class Bank {
	private String bankName;
	private ArrayList<Client> clients;

	public Bank(String bankName) {
		this.bankName = bankName;
		this.clients = new ArrayList<>();
	}

	public void addClient(Client client) {
		clients.add(client);
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public ArrayList<Client> getClients() {
		return clients;
	}

	public void setClients(ArrayList<Client> clients) {
		this.clients = clients;
	}
}

class Client {
	private String name;
	private String surname;
	private String patronymic;
	private String passportNumber;
	private ArrayList<Account> accounts;

	public Client(String name, String surname, String patronymic, String passportNumber) {
		this.name = name;
		this.surname = surname;
		this.patronymic = patronymic;
		this.passportNumber = passportNumber;
		this.accounts = new ArrayList<>();
	}

	public void addAccount(Account account) {
		accounts.add(account);
	}

	public void getInformation() {
		String information = "";
		for (Account account : accounts) {
			information = information + "Счет №" + account.getAccountNumber() + ", баланс: " + account.getAccountSum()
					+ ", статус счета - " + account.getStatus() + ".\n";
		}

		System.out.println("Клиент " + toString() + ":\n" + information);
	}

	public void blockAcc(int accNumber) {
		for (Account account : accounts) {
			if (account.getAccountNumber() == accNumber) {
				account.block();
			}
		}
	}

	public void unblockAcc(int accNumber) {
		for (Account account : accounts) {
			if (account.getAccountNumber() == accNumber) {
				account.unblock();
			}
		}
	}

	public void sortByBalace() {
		accounts.sort(Comparator.comparing(Account::getAccountSum));
	}

	public void findAccount(int id) {
		for (Account account : accounts) {
			if (account.getAccountNumber() == id) {
				System.out.println("Счет №" + id + " найден. Его баланс составляет " + account.getAccountSum());
			} else {
				System.out.println("Счет не найден.");
			}
		}
	}

	public void printAllBalace() {
		double balance = 0;
		for (Account account : accounts) {
			balance = balance + account.getAccountSum();
		}
		System.out.println("Сумма по всем счетам составляет " + balance);
	}

	public void printPositiveBalance() {
		double positiveBalance = 0;
		for (Account account : accounts) {
			if (account.getAccountSum() > 0) {
				positiveBalance = positiveBalance + account.getAccountSum();
			}
		}
		System.out.println("Сумма по всем положительным счетам составляет " + positiveBalance);
	}

	public void printNegativeBalance() {
		double negativeBalance = 0;
		for (Account account : accounts) {
			if (account.getAccountSum() < 0) {
				negativeBalance = negativeBalance + account.getAccountSum();
			}
		}
		System.out.println("Сумма по всем положительным счетам составляет " + negativeBalance);
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

	public String getPassportNumber() {
		return passportNumber;
	}

	public void setPassportNumber(String passportNumber) {
		this.passportNumber = passportNumber;
	}

	public ArrayList<Account> getAccounts() {
		return accounts;
	}

	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}

	@Override
	public String toString() {
		return name + " " + surname + " " + patronymic + ", паспорт №" + passportNumber + " имеет счета";
	}
}

class Account {
	private int accountNumber;
	private double accountSum;
	private boolean active;

	public Account(int accountNumber, double accountSum) {
		this.accountNumber = accountNumber;
		this.accountSum = accountSum;
	}

	public void block() {
		active = false;
	}

	public void unblock() {
		active = true;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getAccountSum() {
		return accountSum;
	}

	public void setAccountSum(double accountSum) {
		this.accountSum = accountSum;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getStatus() {
		String status = active ? "разблокирован" : "заблокирован";
		return status;
	}
}
