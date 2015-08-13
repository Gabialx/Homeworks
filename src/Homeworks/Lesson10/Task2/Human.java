package Homeworks.Lesson10.Task2;

public class Human {
	private String name;
	private int egn;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEgn() {
		return egn;
	}

	public void setEgn(int egn) {
		this.egn = egn;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return EGNExtractor.getGender(egn);
	}
}
