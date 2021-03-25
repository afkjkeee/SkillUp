package by.epam.skillup.Classes.SimplestClasses;

public class Train {
	private String city;
	private int trainNumber;
	private String time;

	public static void main(String[] args) {
		Train[] trains = new Train[5];
		trains[0] = new Train("�����", 132, "12:45");
		trains[1] = new Train("������", 22, "20:00");
		trains[2] = new Train("������", 321, "17:30");
		trains[3] = new Train("����", 756, "04:23");
		trains[4] = new Train("�������", 100, "07:00");

		sortTrainsByNumbers(trains);
		System.out.println("���������� �� ������� �������:");
		for (Train train : trains) {
			System.out.println(train.city + " " + train.trainNumber + " - " + train.time);
		}

		int request = 22;
		System.out.printf("%n����� �%s - ", request);
		System.out.println(printTrainInformation(trains, request) + "\n");

		sortTrainDestination(trains);
		for (Train train : trains) {
			System.out.println(train.city + " " + train.trainNumber + " - " + train.time);
		}
	}

	private Train(String city, int trainNumber, String time) {
		this.city = city;
		this.trainNumber = trainNumber;
		this.time = time;
	}

	public static void sortTrainsByNumbers(Train[] trains) {
		for (int i = trains.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (trains[j].trainNumber > trains[j + 1].trainNumber) {
					Train temp = trains[j];
					trains[j] = trains[j + 1];
					trains[j + 1] = temp;
				}
			}
		}
	}

	private static String printTrainInformation(Train[] trains, int trainNumber) {
		String result = "�������� ����� ������. �������� ����� �� ������ ����.";
		for (Train train : trains) {
			if (train.trainNumber == trainNumber) {
				result = "����� ����������: " + train.city + ", ����� ��������: " + train.time;
			}
		}

		return result;
	}

	private static void sortTrainDestination(Train[] trains) {
		Train temp;
		for (int i = 0; i < trains.length; i++) {
			for (int j = trains.length - 1; j > i; j--) {
				int compare = trains[i].city.compareTo(trains[j].city);
				if (compare > 0) {
					temp = trains[i];
					trains[i] = trains[j];
					trains[j] = temp;
				} else if (compare == 0) {
					if (trains[i].time.compareTo(trains[j].time) > 0) {
						temp = trains[i];
						trains[i] = trains[j];
						trains[j] = temp;
					}
				}
			}
		}
	}
}
