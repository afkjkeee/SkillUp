package by.epam.skillup.BasicsOfOOP.Task1;

import java.util.ArrayList;

public class Directory {
	private String directoryName;
	private ArrayList<File> files;

	public Directory(String directoryName) {
		this.directoryName = directoryName;
		this.files = new ArrayList<>();
	}

	public void addFile(File newFile) {
		files.add(newFile);
	}

	public void deleteFile(String fileName) {
		for (int i = 0; i < files.size(); i++) {
			if (files.get(i).getFileName().equalsIgnoreCase(fileName)) {
				files.remove(i);
			}
		}
	}

	public void renameFile(String fileName, File newFileName) {
		for (int i = 0; i < files.size(); i++) {
			if (files.get(i).getFileName().equalsIgnoreCase(fileName)) {
				files.set(i, newFileName);
			}
		}
	}

	public void printFiles() {
		String inf = "";
		System.out.println("Файлы в папке: ");
		for (File file : files) {
			inf = file.getFileName();

			System.out.println(inf);
		}
	}

	public String getDirectoryName() {
		return directoryName;
	}

	public void setDirectoryName(String directoryName) {
		this.directoryName = directoryName;
	}
}
