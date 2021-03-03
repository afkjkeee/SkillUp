package by.epam.skillup.Strings.AsArray;

import java.util.Arrays;

public class Task1 {
	public static void main(String[] args) {
		String[] camelCaseArr = { "HelloJava", "CamelCase", "SnakeCase" };

		Task1 task1 = new Task1();
		String result = task1.fromCamelCaseToSnakeCase(camelCaseArr);
		System.out.println(result);
	}

	public String fromCamelCaseToSnakeCase(String[] camelCaseArr) {
		String regularExp = "([a-z])([A-Z]+)";
		String replacement = "$1_$2";
		String str = Arrays.toString(camelCaseArr);
		str = str.replaceAll(regularExp, replacement).toLowerCase();

		return str;
	}
}
