package by.epam.skillup.Strings.RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
	public static void main(String[] args) {
		String str = "<notes>\n" + "    <note id = \"1\">\n" + "        <to>Вася</to>\n"
				+ "        <from>Света</from>\n" + "        <heading>Напоминание</heading>\n"
				+ "        <body>Позвони мне завтра!</body>\n" + "    </note>\n" + "    <note id = \"2\">\n"
				+ "        <to>Петя</to>\n" + "        <from>Маша</from>\n"
				+ "        <heading>Важное напоминание</heading>\n" + "        <body/>\n" + "    </note>\n"
				+ " </notes>\n";
		Task2 task2 = new Task2();
		String result = task2.xmlAnalyz(str);
		System.out.println(result);
	}

	public String xmlAnalyz(String str) {
		StringBuilder strB = new StringBuilder();
		Pattern pOpen = Pattern.compile("<\\w.+?>");
		Pattern pClose = Pattern.compile("</\\w+>");
		Pattern pBody = Pattern.compile(">.+?<");
		Pattern pEmpty = Pattern.compile("<\\w.+?/>");

		String[] lines = str.split("\n\\s*");

		for (String line : lines) {
			Matcher mOpen = pOpen.matcher(line);
			Matcher mClose = pClose.matcher(line);
			Matcher mBody = pBody.matcher(line);
			Matcher mEmpty = pEmpty.matcher(line);
			if (mEmpty.find()) {
				strB.append(mEmpty.group());
				strB.append(" - тег без тела\n");
			} else if (mOpen.find()) {
				strB.append(mOpen.group());
				strB.append(" - открывающий тег\n");
			}
			if (mBody.find()) {
				strB.append(mBody.group().substring(1));
				strB.append("\b - содержимое тега\n");
			}
			if (mClose.find()) {
				strB.append(mClose.group());
				strB.append(" - закрывающий тег\n");
			}
		}

		return strB.toString();
	}
}
