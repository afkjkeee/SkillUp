package by.epam.skillup.Classes.AggregationAndComposition;

import java.util.ArrayList;

public class CountryTest {
	public static void main(String[] args) {
		Country country = new Country("Беларусь", new City("Минск"));

		country.addRegion(new Region("Брестская область", 32786, new City("Брест")));
		country.addRegion(new Region("Витебская область", 40051, new City("Витебск")));
		country.addRegion(new Region("Гомельская область", 40372, new City("Гомель")));
		country.addRegion(new Region("Гродненская область", 25127, new City("Гродно")));
		country.addRegion(new Region("Минская область", 40202, new City("Минск")));
		country.addRegion(new Region("Могилевская область", 29068, new City("Могилев")));

		country.printCapitalCity();
		country.numberOfRegions();
		country.countryArea();
		country.regionsCenters();
		country.getCapitalCity();
	}
}

class Country {
	private String countryName;
	private City capitalCity;
	private ArrayList<Region> regions;

	public Country(String countryName, City capitalCity) {
		this.countryName = countryName;
		this.capitalCity = capitalCity;
		this.regions = new ArrayList<>();
	}

	public void addRegion(Region region) {
		regions.add(region);
	}

	public void countryArea() {
		int allArea = 0;
		for (Region region : regions) {
			allArea = allArea + region.getRegionArea();
		}
		System.out.println("Площадь страны составляет " + allArea + " км. кв.");
	}

	public void numberOfRegions() {
		System.out.println("Количество областей в стране - " + regions.size());
	}

	public void printCapitalCity() {
		System.out.println("Cтолицей является город " + capitalCity.getName());
	}

	public void regionsCenters() {
		System.out.print("Областные центры: ");
		for (Region region : regions) {
			System.out.print(region.getRegionCenter().getName() + " ");
		}
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public City getCapitalCity() {
		return capitalCity;
	}

	public void setCapitalCity(City capitalCity) {
		this.capitalCity = capitalCity;
	}

	public ArrayList<Region> getRegions() {
		return regions;
	}

	public void setRegions(ArrayList<Region> regions) {
		this.regions = regions;
	}
}

class Region {
	private String regionName;
	private int regionArea;
	private City regionCenter;

	public Region(String regionName, int regionArea, City regionCenter) {
		this.regionName = regionName;
		this.regionArea = regionArea;
		this.regionCenter = regionCenter;
	}

	public String getRegionName() {
		return regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public int getRegionArea() {
		return regionArea;
	}

	public void setRegionArea(int regionArea) {
		this.regionArea = regionArea;
	}

	public City getRegionCenter() {
		return regionCenter;
	}

	public void setRegionCenter(City regionCenter) {
		this.regionCenter = regionCenter;
	}
}

class District {
	private String districtName;
	private int districtArea;
	private City distictCenter;

	public District(String districtName, int districtArea, City distictCenter) {
		this.districtName = districtName;
		this.districtArea = districtArea;
		this.distictCenter = distictCenter;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public double getDistrictArea() {
		return districtArea;
	}

	public void setDistrictArea(int districtArea) {
		this.districtArea = districtArea;
	}

	public City getDistictCenter() {
		return distictCenter;
	}

	public void setDistictCenter(City distictCenter) {
		this.distictCenter = distictCenter;
	}
}

class City {
	private String name;

	public City(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}