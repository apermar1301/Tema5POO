package ejercicio5Metodo_toString;

public class Ejercicio1 {

	public static void main(String[] args) {

		Person person = new Person();

		person.setName("Álvaro");
		person.setAge(19);
		person.setHeight(1.8f);
		person.setWork("Programador");

		System.out.println(person.toString());

	}

}
