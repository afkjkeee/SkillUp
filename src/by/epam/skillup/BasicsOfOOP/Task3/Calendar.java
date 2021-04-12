package by.epam.skillup.BasicsOfOOP.Task3;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Calendar {
	private int year;
	private ArrayList<Holiday> holiday;

	public Calendar(int year) {
		this.year = year;
		this.holiday = new ArrayList<>();
	}

	public void addHoliday(String name, LocalDate date) {
		this.holiday.add(new Holiday(name, date));
	}

	public void addWeekend() {
		LocalDate date = LocalDate.of(year, 1, 1);
		while (date.getDayOfWeek() != DayOfWeek.SATURDAY && date.getDayOfWeek() != DayOfWeek.SUNDAY) {
			date = date.plusDays(1);
		}
		while (date.getYear() == year) {
			if (date.getDayOfWeek() == DayOfWeek.SATURDAY) {
				holiday.add(new Holiday("Суббота", date));
				date = date.plusDays(1);
			} else if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
				holiday.add(new Holiday("Воскресенье", date));
				date = date.plusDays(6);
			} else {
				date = date.plusDays(1);
			}
		}
	}

	public void sortByDays() {
		this.holiday.sort(Comparator.comparing(Holiday::getDate));
	}

	public void printCalendar() {
		System.out.println("Календарь выходных дней на " + this.year + " год:");
		for (Holiday holiday : holiday) {
			System.out.println(holiday);
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public ArrayList<Holiday> getHoliday() {
		return holiday;
	}

	public void setHoliday(ArrayList<Holiday> holiday) {
		this.holiday = holiday;
	}

	class Holiday {
		private String name;
		private LocalDate date;

		public Holiday(String name, LocalDate date) {
			this.name = name;
			this.date = date;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public LocalDate getDate() {
			return date;
		}

		public void setDate(LocalDate date) {
			this.date = date;
		}

		@Override
		public String toString() {
			return name + " " + date;
		}
	}
}
