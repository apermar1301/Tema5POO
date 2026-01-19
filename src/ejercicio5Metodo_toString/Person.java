package ejercicio5Metodo_toString;

public class Person {

	private String name;

	private int age;

	private float height;

	private String work;

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

	@Override
	public String toString() {
		return String.format("Mi nombre es %s, tengo %d años, mido %.2f y trabajo de %s", name, age, height, work);
	}

}