package by.epam.skillup.Classes.SimplestClasses;

public class Student {
	private String name;
	private int groupNumber;
	private int[] academicPerfomance = new int[5];

	public static void main(String[] args) {
		Student[] students = new Student[10];

		students[0] = new Student("Петров А.А.", 10, new int[] { 4, 5, 8, 7, 9 });
		students[1] = new Student("Иванов И.И.", 10, new int[] { 9, 9, 1, 10, 9 });
		students[2] = new Student("Сидоров С.С.", 15, new int[] { 10, 10, 9, 9, 9 });
		students[3] = new Student("Соболев К.Г.", 15, new int[] { 10, 10, 9, 3, 10 });
		students[4] = new Student("Бобков Е.И.", 20, new int[] { 7, 6, 8, 7, 9 });
		students[5] = new Student("Луканович А.Г.", 17, new int[] { 9, 9, 10, 10, 9 });
		students[6] = new Student("Гамола А.М.", 9, new int[] { 9, 9, 8, 10, 9 });
		students[7] = new Student("Алешкович А.М.", 17, new int[] { 3, 6, 5, 7, 4 });
		students[8] = new Student("Григорьев Д.С.", 9, new int[] { 7, 9, 8, 7, 9 });
		students[9] = new Student("Чак И.П.", 20, new int[] { 10, 9, 9, 10, 9 });

		printStudent(students);
	}

	private Student(String name, int groupNumber, int[] academicPerfomance) {
		this.name = name;
		this.groupNumber = groupNumber;
		this.academicPerfomance = academicPerfomance;
	}

	private static void printStudent(Student[] students) {
		for (Student student : students) {
			int minGrade = 10;
			for (int grade : student.academicPerfomance) {
				if (grade < minGrade) {
					minGrade = grade;
				}
			}
			if (minGrade >= 9) {
				System.out.printf("Лучший студент: " + student.name + " из группы " + student.groupNumber + "\n");
			}
		}
	}
}
