package by.epam.skillup.BasicsOfOOP.Task1;

public class Main {
	public static void main(String[] args) {
		Directory directory = new Directory("Work");
		File test = new File("Test");
		File answers = new File("Test answers");
		File rename = new File("New answers");

		directory.addFile(answers);
		directory.addFile(test);
		directory.printFiles();
		directory.deleteFile("Test");
		directory.printFiles();
		directory.renameFile("Test answers", rename);
		directory.printFiles();

		rename.addText("This file contains the answers to the test.");
		rename.printText();
		rename.addText("For test number 2.");
		rename.printText();
	}
}
