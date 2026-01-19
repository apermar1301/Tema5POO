package ejercicio5GetYSet;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Person2 persona = new Person2();
		Scanner scanner = new Scanner(System.in);
		ConsoleInput ci = new ConsoleInput(scanner);

		System.out.println(
				persona.getAge() + "\n" + persona.getHeight() + "\n" + persona.getName() + "\n" + persona.getWork());

		persona.setName(ci.readString("Cual es mi nombre?: "));
		persona.setAge(ci.readInt("Cual es mi edad?: "));
		persona.setHeight(ci.readFloat("Cual es mi altura?: "));
		persona.setWork(ci.readString("Cual es mi trabajo?: "));

		System.out.println(
				persona.getAge() + "\n" + persona.getHeight() + "\n" + persona.getName() + "\n" + persona.getWork());

	}

}
