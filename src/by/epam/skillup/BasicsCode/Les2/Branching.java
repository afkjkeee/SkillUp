package by.epam.skillup.BasicsCode.Les2;

public class Branching {
	public static void main(String[] args) {
		
		Task1 task1 = new Task1();
		String a = task1.figure(89, 89);
		System.out.println(a);
		
		Task2 task2 = new Task2();
		String minAndMax = task2.minAndMax(7, 3, 4, 9);
		System.out.println(minAndMax);
		
		Task3 task3 = new Task3();
		String result = task3.coordinats(1, 2, 2, 4, 3, 7);
		System.out.println(result);
		
		Task4 task4 = new Task4();
		String brickToHole = task4.proportions(2, 4, 1.9, 2, 5);
		System.out.println(brickToHole);
		
		Task5 task5 = new Task5();
		double funcResult = task5.function(4);
		System.out.println(funcResult);
	}

}
