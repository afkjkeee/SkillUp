package by.epam.skillup.Classes.AggregationAndComposition;

public class CarTest {
	public static void main(String[] args) {
		Car car = new Car();
		car.printCarModel();
		car.drive();
		car.reFuel(car, 30);
		car.drive();
		car.changeWheels();
	}
}

class Car {
	private String carModel;
	private Engine engine;
	private Wheel wheel;
	private int volumeOfTheTank;
	private double fuelRemaining;

	public Car() {
		engine = new Engine();
		wheel = new Wheel();
		carModel = "Mercdedes-Benz e200d W213";
		volumeOfTheTank = 65;
		fuelRemaining = 10;
	}

	public Car(String carModel, int volumeOfTheTank, Engine engine, Wheel wheel) {
		this.carModel = carModel;
		this.volumeOfTheTank = volumeOfTheTank;
		this.engine = engine;
		this.wheel = wheel;
	}

	public double distance() {
		return fuelRemaining / engine.getFuelConsumption() * 100;
	}

	public void drive() {
		System.out.println(
				"Что ж, с Богом, поехали. Упс, топлива хватило только на " + distance() + " км. Надо заправиться.");
		setFuelRemaining(0);
	}

	public void reFuel(Car car, int petrol) {
		double fuelRemaining = car.getFuelRemaining();
		int volumeOfTheTank = car.getVolumeOfTheTank();

		if (petrol + fuelRemaining > volumeOfTheTank) {
			double temp = volumeOfTheTank - fuelRemaining;
			car.setFuelRemaining(volumeOfTheTank);
			System.out.println("Бак полный. Объем залитого топлива = " + temp + " литров");
		} else {
			fuelRemaining = fuelRemaining + petrol;
			System.out.println("Объем топлива в баке после заправки = " + fuelRemaining + " литров");
			car.setFuelRemaining(fuelRemaining);
		}
	}

	public void changeWheels() {
		System.out.println(
				"Заменены все колеса, теперь их диаметр составляет " + wheel.getDiameter() + " дюймов, класс!");
	}

	public void printCarModel() {
		System.out.println("Марка автомобиля - " + carModel + "\n" + "Объем двигателя - " + engine.getCapacity() + "\n"
				+ "Мощность - " + engine.getPower() + "\n" + "Расход топлива - " + engine.getFuelConsumption());
	}

	public String getCarModel() {
		return carModel;
	}

	public Engine getEngine() {
		return engine;
	}

	public double getFuelRemaining() {
		return fuelRemaining;
	}

	public int getVolumeOfTheTank() {
		return volumeOfTheTank;
	}

	public void setFuelRemaining(double fuelRemaining) {
		this.fuelRemaining = fuelRemaining;
	}

	public Wheel getWheel() {
		return wheel;
	}
}

class Wheel {
	private int diameter;

	public Wheel() {
		diameter = 19;
	}

	public int getDiameter() {
		return diameter;
	}
}

class Engine {
	private double capacity;
	private int power;
	private double fuelConsumption;

	public Engine() {
		capacity = 2.0;
		power = 215;
		fuelConsumption = 7.0;
	}

	public Engine(double capacity, int power, double fuelConsumption) {
		this.capacity = capacity;
		this.power = power;
		this.fuelConsumption = fuelConsumption;
	}

	public double getCapacity() {
		return capacity;
	}

	public int getPower() {
		return power;
	}

	public double getFuelConsumption() {
		return fuelConsumption;
	}
}