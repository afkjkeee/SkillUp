package by.epam.skillup.BasicsOfOOP.Task3;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Calendar calendar2021 = new Calendar(2021);

		calendar2021.addWeekend();

		calendar2021.addHoliday("Новый год", LocalDate.of(calendar2021.getYear(), 1, 1));
		calendar2021.addHoliday("Рождество Христово", LocalDate.of(calendar2021.getYear(), 1, 7));
		calendar2021.addHoliday("День женщин", LocalDate.of(calendar2021.getYear(), 3, 8));
		calendar2021.addHoliday("Праздник труда", LocalDate.of(calendar2021.getYear(), 5, 1));
		calendar2021.addHoliday("День Победы", LocalDate.of(calendar2021.getYear(), 5, 9));
		calendar2021.addHoliday("Радуница", LocalDate.of(calendar2021.getYear(), 5, 11));
		calendar2021.addHoliday("День Независимости", LocalDate.of(calendar2021.getYear(), 7, 3));
		calendar2021.addHoliday("День Октябрьской революции", LocalDate.of(calendar2021.getYear(), 11, 7));
		calendar2021.addHoliday("Рождество Христово", LocalDate.of(calendar2021.getYear(), 12, 25));

		calendar2021.sortByDays();
		calendar2021.printCalendar();
	}
}
