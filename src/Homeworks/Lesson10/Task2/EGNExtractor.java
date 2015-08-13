package Homeworks.Lesson10.Task2;

public class EGNExtractor {
	public static char getGender(int egn) {
		return ((egn % 100) / 10) % 2 == 0 ? 'M' : 'F';
	}
}
