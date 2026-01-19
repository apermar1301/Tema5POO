package ejercicio5This;

public class Person {

	private String name;
	private int age;
	private float height;
	private String work;
	private double salary;

	public Person() {
		this("Alvaro", 18, 1.8f, "Programador");
	}

	public Person(String name, int age, float height, String work) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.work = work;
	}

	public String getName() {
		return name;
	}

	public float getHeight() {
		return height;
	}

	public int getAge() {
		return age;
	}

	public String getWork() {
		return work;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public double addSalary(Person person) {
		return salary + person.salary;
	}

	public void doubleSalary() {
		salary = addSalary(this);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", work=" + work + ", salary=" + salary
				+ "]";
	}

}