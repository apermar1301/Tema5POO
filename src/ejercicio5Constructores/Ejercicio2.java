package ejercicio5Constructores;

public class Ejercicio2 {

	public static void main(String[] args) {

		Person2 p1, p2;

		p1 = new Person2("Álvaro", 19, 1.8f, "Programador");
		p2 = new Person2("Oleh", 19, 1.8f, "Programador");

		System.out.println(p1.toString());
		System.out.println(p2.toString());

	}

}
