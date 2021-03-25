package by.epam.skillup.Classes.AggregationAndComposition.Task5;

import java.util.ArrayList;
import java.util.Comparator;

public class Travel {
	public static void main(String[] args) {
		TravelAgency travelAgency = new TravelAgency("Роза ветров");

		travelAgency.addTour(
				new BaseOfTours("Израиль", "Эйлат", 10, 980, Food.ВСЕ_ВКЛЮЧЕНО, Vaucher.ОТДЫХ, Transport.САМОЛЕТ));
		travelAgency.addTour(
				new BaseOfTours("Египет", "Шарм-Эль-Шейх", 8, 730, Food.ЗАВТРАК, Vaucher.ОТДЫХ, Transport.САМОЛЕТ));
		travelAgency.addTour(
				new BaseOfTours("Египет", "Хургада", 9, 830, Food.ВСЕ_ВКЛЮЧЕНО, Vaucher.ОТДЫХ, Transport.САМОЛЕТ));
		travelAgency.addTour(
				new BaseOfTours("Турция", "Анталия", 6, 590, Food.БЕЗ_ПИТАНИЯ, Vaucher.ЭКСКУРСИЯ, Transport.САМОЛЕТ));
		travelAgency.addTour(
				new BaseOfTours("Украина", "Львов", 3, 140, Food.ЗАВТРАК, Vaucher.ЭКСКУРСИЯ, Transport.АВТОБУС));
		travelAgency.addTour(
				new BaseOfTours("Польша", "Белосток", 2, 120, Food.БЕЗ_ПИТАНИЯ, Vaucher.ШОПИНГ, Transport.АВТОМОБИЛЬ));
		travelAgency.addTour(
				new BaseOfTours("Литва", "Вильнюс", 2, 120, Food.БЕЗ_ПИТАНИЯ, Vaucher.ШОПИНГ, Transport.ПОЕЗД));
		travelAgency.addTour(
				new BaseOfTours("Украина", "Карпаты", 4, 200, Food.ЗАВТРАК_И_УЖИН, Vaucher.ЛЕЧЕНИЕ, Transport.АВТОБУС));
		travelAgency.addTour(
				new BaseOfTours("Египет", "Хургада", 4, 260, Food.ВСЕ_ВКЛЮЧЕНО, Vaucher.ОТДЫХ, Transport.САМОЛЕТ));

		Request request = new Request();
		request.setCountry("Египет");
		request.setTypeOfVaucher(Vaucher.ОТДЫХ);
		request.setTypeOfFood(Food.ВСЕ_ВКЛЮЧЕНО);

		ArrayList<BaseOfTours> selectedTours = travelAgency.sortByRequest(request);

		travelAgency.sortByPrice(selectedTours);
		travelAgency.printTours(selectedTours);
	}
}

class TravelAgency {
	private String agencyName;
	private ArrayList<BaseOfTours> tour;

	public TravelAgency(String agencyName) {
		this.agencyName = agencyName;
		this.tour = new ArrayList<>();
	}

	public void addTour(BaseOfTours tourInf) {
		tour.add(tourInf);
	}

	ArrayList<BaseOfTours> sortByRequest(Request request) {
		ArrayList<BaseOfTours> sortByFirstRequest = new ArrayList<>();
		for (BaseOfTours base : tour) {
			if ((base.getCountry().equalsIgnoreCase(request.getCountry())) || (request.getCountry() == null)) {
				sortByFirstRequest.add(base);
			}
		}
		ArrayList<BaseOfTours> sortBySecondRequest = new ArrayList<>();
		for (BaseOfTours base : sortByFirstRequest) {
			if ((base.getTypeOfVaucher().equals(request.getTypeOfVaucher())) || (request.getTypeOfVaucher() == null)) {
				sortBySecondRequest.add(base);
			}
		}
		ArrayList<BaseOfTours> sortByThirdRequest = new ArrayList<>();
		for (BaseOfTours base : sortBySecondRequest) {
			if ((base.getTypeOfFood().equals(request.getTypeOfFood())) || (request.getTypeOfFood() == null)) {
				sortByThirdRequest.add(base);
			}
		}

		return sortByThirdRequest;
	}

	public void sortByPrice(ArrayList<BaseOfTours> tours) {
		tours.sort(Comparator.comparing(BaseOfTours::getPrice));
	}

	public void printTours(ArrayList<BaseOfTours> tours) {
		for (BaseOfTours tour : tours) {
			System.out.println("Страна: " + tour.getCountry() + ", город: " + tour.getResort() + ", тип путевки: "
					+ tour.getTypeOfVaucher() + ", вид транспорта: " + tour.getTypeOfTransport() + ", питание: "
					+ tour.getTypeOfFood() + ", длительность: " + tour.getTourDuration() + ", стоимость: "
					+ tour.getPrice());
		}
	}

	public String getAgencyName() {
		return agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	public ArrayList<BaseOfTours> getTour() {
		return tour;
	}

	public void setTour(ArrayList<BaseOfTours> tour) {
		this.tour = tour;
	}
}

class Request {
	private String country;
	private Food typeOfFood;
	private Vaucher typeOfVaucher;

	public Request() {

	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Food getTypeOfFood() {
		return typeOfFood;
	}

	public void setTypeOfFood(Food typeOfFood) {
		this.typeOfFood = typeOfFood;
	}

	public Vaucher getTypeOfVaucher() {
		return typeOfVaucher;
	}

	public void setTypeOfVaucher(Vaucher typeOfVaucher) {
		this.typeOfVaucher = typeOfVaucher;
	}
}

class BaseOfTours {
	private String country;
	private String resort;
	private int tourDuration;
	private int price;
	private Food typeOfFood;
	private Vaucher typeOfVaucher;
	private Transport typeOfTransport;

	public BaseOfTours(String country, String resort, int tourDuration, int price, Food typeOfFood,
			Vaucher typeOfVaucher, Transport typeOfTransport) {
		this.country = country;
		this.resort = resort;
		this.tourDuration = tourDuration;
		this.price = price;
		this.typeOfFood = typeOfFood;
		this.typeOfVaucher = typeOfVaucher;
		this.typeOfTransport = typeOfTransport;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getResort() {
		return resort;
	}

	public void setResort(String resort) {
		this.resort = resort;
	}

	public int getTourDuration() {
		return tourDuration;
	}

	public void setTourDuration(int tourDuration) {
		this.tourDuration = tourDuration;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Food getTypeOfFood() {
		return typeOfFood;
	}

	public void setTypeOfFood(Food typeOfFood) {
		this.typeOfFood = typeOfFood;
	}

	public Vaucher getTypeOfVaucher() {
		return typeOfVaucher;
	}

	public void setTypeOfVaucher(Vaucher typeOfVaucher) {
		this.typeOfVaucher = typeOfVaucher;
	}

	public Transport getTypeOfTransport() {
		return typeOfTransport;
	}

	public void setTypeOfTransport(Transport typeOfTransport) {
		this.typeOfTransport = typeOfTransport;
	}
}