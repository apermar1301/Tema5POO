package ejercicio5Constructores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ConsoleInput ci = new ConsoleInput(scanner);

		Student student = new Student(ci.readString("Inserta tu nombre:\n> "), 123456789);

		student.setGrades();

		System.out.println(student.getAverage());

		System.out.print(student.toString());

	}

}
