package ejercicio5GetYSet;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Person persona = new Person();
		Scanner scanner = new Scanner(System.in);
		ConsoleInput ci = new ConsoleInput(scanner);

		persona.setName("Manuel");
		System.out.println(persona.getName());

		persona.setName(ci.readString(null));
		System.out.println(persona.getName());

	}

}
