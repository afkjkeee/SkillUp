package by.epam.skillup.BasicsCode.Les1;

public class Linear {
public static void main(String[] args) {
	
	Task1 task1 = new Task1();
	double func = task1.Function(4, 8, 5);
	System.out.println(func);

	Task2 task2 = new Task2();
	double func2 = task2.Function2(1, 2, 3);
	System.out.println(func2);
	
	Task3 task3 = new Task3();
	double func3 = task3.Function3(45, 90);
	System.out.println(func3);
	
	Task4 task4 = new Task4();
	double reverce = task4.reverceNumber(348.546);
	System.out.println(reverce);
    
	Task5 task5 = new Task5();
	String convert = task5.convertSeconds(6478);
	System.out.println(convert);
		
	Task6 task6 = new Task6();
	boolean p = task6.coordinate(-2, -1);
	System.out.println(p);
}
}

