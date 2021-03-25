package by.epam.skillup.Classes.SimplestClasses;

import java.util.Scanner;

public class Time {
	private int hours;
	private int minutes;
	private int seconds;

	public static void main(String[] args) {
		System.out.print("”становка вермени. ¬ведите количество часов (24h): ");
		Scanner sr = new Scanner(System.in);
		int hours = sr.nextInt();
		System.out.print("¬ведите количество минут: ");
		int minutes = sr.nextInt();
		System.out.print("¬ведите секунды: ");
		int seconds = sr.nextInt();

		Time time = new Time(hours, minutes, seconds);
		System.out.println(time.getTime(hours, minutes, seconds));

		System.out.print("»зменение вермени. ¬ведите количество часов дл€ изменени€: ");
		int addHours = sr.nextInt();
		System.out.print("¬ведите количество минут дл€ измменени€: ");
		int addMin = sr.nextInt();
		System.out.print("¬ведите секунды дл€ изменени€: ");
		int addSec = sr.nextInt();
		sr.close();

		time.changeHours(addHours);
		time.changeMinutes(addMin);
		time.changeSeconds(addSec);
		System.out.println(time.getNewTime(hours, minutes, seconds));
	}

	public Time(int hours, int minutes, int seconds) {
		hoursSet(hours);
		minutesSet(minutes);
		secondsSet(seconds);
	}

	public int hoursSet(int hours) {
		if (hours < 0 || hours > 23) {
			hours = 0;
		} else {
			return hours;
		}
		return hours;
	}

	public int minutesSet(int minutes) {
		if (minutes < 0 || minutes > 59) {
			minutes = 0;
		} else {
			return minutes;
		}
		return minutes;
	}

	public int secondsSet(int seconds) {
		if (seconds < 0 || seconds > 59) {
			seconds = 0;
		} else {
			return seconds;
		}
		return seconds;
	}

	private int changeHours(int hour) {
		this.hours = (this.hours + hour) % 24;
		if (this.hours < 0) {
			this.hours += 24;
		}
		return this.hours;
	}

	private int changeMinutes(int minute) {
		if ((this.minutes + minute) < 0) {
			changeHours(minute / 60 - 1);
			this.minutes = 60 + ((this.minutes + minute) % 60);
		} else {
			changeHours((this.minutes + minute) / 60);
			this.minutes = (this.minutes + minute) % 60;
		}
		return this.minutes;
	}

	private int changeSeconds(int second) {
		if ((this.seconds + second) < 0) {
			changeMinutes(second / 60 - 1);
			this.seconds = 60 + ((this.seconds + second) % 60);
		} else {
			changeMinutes((this.seconds + second) / 60);
			this.seconds = (this.seconds + second) % 60;
		}
		return this.seconds;
	}

	public String getTime(int hours, int minutes, int seconds) {
		return hoursSet(hours) + " ч. " + minutesSet(minutes) + " мин. " + secondsSet(seconds) + " сек.";
	}

	public String getNewTime(int hours, int minutes, int seconds) {
		return changeHours(hours) + " ч. " + changeMinutes(minutes) + " мин. " + changeSeconds(seconds) + " сек.";
	}
}
