package ejercicio5Constructores;

import java.util.Arrays;
import java.util.Scanner;

public class Student {

	Scanner scanner = new Scanner(System.in);
	ConsoleInput ci = new ConsoleInput(scanner);

	private String name;
	private int enrolmentNumber;
	private float[] grades = new float[2];

	public Student(String name, int enrolmentNumber) {
		this.name = name;
		this.enrolmentNumber = enrolmentNumber;
	}

	public void setGrades() {
		for (int i = 0; i < grades.length; i++) {
			System.out.printf("Insert the %s grade", i == 0 ? "first" : "second");
			grades[i] = ci.readFloat("\n> ");
		}

	}

	public float getAverage() {

		System.out.println(grades[0] + " + " + grades[1]);
		return (grades[1] + grades[0]) / 2;

	}

	@Override
	public String toString() {
		return "[name=" + name + ", enrolmentNumber=" + enrolmentNumber + ", grades=" + Arrays.toString(grades) + "]";
	}

}
