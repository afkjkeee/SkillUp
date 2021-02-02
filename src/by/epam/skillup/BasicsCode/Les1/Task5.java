package by.epam.skillup.BasicsCode.Les1;

public class Task5 {

	public String convertSeconds(int seconds) {

		int secondsToHours = seconds / 3600;
		int secondsToMinutes = (seconds % 3600) / 60;
		int restOfSeconds = seconds - (secondsToHours * 3600 + secondsToMinutes * 60);

		return secondsToHours + "ч " + secondsToMinutes + "мин " + restOfSeconds + "с";

	}
}
