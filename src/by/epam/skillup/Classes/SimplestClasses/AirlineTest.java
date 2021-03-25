package by.epam.skillup.Classes.SimplestClasses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class AirlineTest {
	public static void main(String[] args) throws ParseException {
		AirlineBase airlineBase = new AirlineBase("������������ �������� �����");
		airlineBase.addAirline("�����", 1716, "������������", Airline.date.parse("00:50"), "�����");
		airlineBase.addAirline("�������", 8213, "������������", Airline.date.parse("05:05"), "�����");
		airlineBase.addAirline("����", 2843, "������������", Airline.date.parse("08:35"), "�����������");
		airlineBase.addAirline("�������", 2783, "��������", Airline.date.parse("13:10"), "�����");
		airlineBase.addAirline("�������", 2895, "������������", Airline.date.parse("15:00"), "�������");
		airlineBase.addAirline("�������", 2803, "������������", Airline.date.parse("17:35"), "�����");
		airlineBase.addAirline("�������", 286, "������������", Airline.date.parse("21:40"), "�������");

		System.out.println("������ ���� ������:");
		for (int i = 0; i < airlineBase.getBase().size(); i++) {
			System.out.println(airlineBase.getBase().get(i));
		}

		System.out.println("\n" + "������ ������ � �������:");
		ArrayList<Airline> byDestination = airlineBase.sortByDestination("�������");
		for (Airline airline : byDestination) {
			System.out.println(airline);
		}

		System.out.println("\n" + "������ ������ �  �����:");
		ArrayList<Airline> byDayOfwweek = airlineBase.sortByDayOfWeek("�����");
		for (Airline airline : byDayOfwweek) {
			System.out.println(airline);
		}

		System.out.println("\n" + "������ ������ � ����� ����� 08:00:");
		ArrayList<Airline> byDayAndTime = airlineBase.sortByDayAndTime("�����", Airline.date.parse("08:00"));
		for (Airline airline : byDayAndTime) {
			System.out.println(airline);
		}
	}
}

class Airline {
	private String destination;
	private int flightNumber;
	private String planeType;
	private Date departureTime;
	private String dayOfWeek;

	static SimpleDateFormat date = new SimpleDateFormat("HH:mm");

	public Airline(String destination, int flightNumber, String planeType, Date departureTime, String dayOfWeek) {
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.planeType = planeType;
		this.departureTime = departureTime;
		this.dayOfWeek = dayOfWeek;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getPlaneType() {
		return planeType;
	}

	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}

	public Date getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Date departureTime) {
		this.departureTime = departureTime;
	}

	public String getDayOfWeek() {
		return dayOfWeek;
	}

	public void setDayOfWeek(String dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
	}

	@Override
	public String toString() {
		return "����� ���������� - " + destination + ", ����� ����� - " + flightNumber + ", ��� �������� - " + planeType
				+ ", ����� ������ - " + date.format(departureTime) + ", ���� ������ - " + dayOfWeek + "]";
	}

}

class AirlineBase {
	private String airport;
	private ArrayList<Airline> base;

	public AirlineBase(String airport) {
		this.airport = airport;
		this.base = new ArrayList<>();
	}

	void addAirline(String destination, int flightNumber, String planeType, Date departureTime, String dayOfWeek) {
		base.add(new Airline(destination, flightNumber, planeType, departureTime, dayOfWeek));
	}

	ArrayList<Airline> sortByDestination(String destination) {
		ArrayList<Airline> sortByDestination = new ArrayList<>();
		for (Airline airline : base) {
			if (airline.getDestination().equalsIgnoreCase(destination)) {
				sortByDestination.add(airline);
			}
		}

		return sortByDestination;
	}

	ArrayList<Airline> sortByDayOfWeek(String dayOfWeek) {
		ArrayList<Airline> sortByDayOfWeek = new ArrayList<>();
		for (Airline airline : base) {
			if (airline.getDayOfWeek().equalsIgnoreCase(dayOfWeek)) {
				sortByDayOfWeek.add(airline);
			}
		}

		return sortByDayOfWeek;
	}

	ArrayList<Airline> sortByDayAndTime(String dayOfWeek, Date afterthisTime) {
		ArrayList<Airline> sortByDayAndTime = new ArrayList<>();
		for (Airline airline : base) {
			if (airline.getDayOfWeek().equalsIgnoreCase(dayOfWeek)) {
				if (airline.getDepartureTime().compareTo(afterthisTime) >= 0) {
					sortByDayAndTime.add(airline);
				}
			}
		}

		return sortByDayAndTime;
	}

	public String getAirport() {
		return airport;
	}

	public void setAirport(String airport) {
		this.airport = airport;
	}

	public ArrayList<Airline> getBase() {
		return base;
	}

	public void setBase(ArrayList<Airline> base) {
		this.base = base;
	}
}
