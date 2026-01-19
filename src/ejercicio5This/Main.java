package ejercicio5This;

public class Main {

	public static void main(String[] args) {

		Person alvaro = new Person("alvaro", 19, 1.8f, "Programador");
		Person oleh = new Person("oleh", 19, 1.8f, "Programador");

		alvaro.setSalary(1500);
		oleh.setSalary(1000);

		System.out.println(alvaro.toString());
		System.out.println(oleh.toString());

		System.out.println("addSalary()");
		alvaro.setSalary(alvaro.addSalary(oleh));
		System.out.println(alvaro.toString());
		System.out.println(oleh.toString());

		System.out.println("doubleSalary()");
		oleh.doubleSalary();
		System.out.println(alvaro.toString());
		System.out.println(oleh.toString());

	}

}
