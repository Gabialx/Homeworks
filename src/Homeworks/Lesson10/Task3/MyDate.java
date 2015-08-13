package Homeworks.Lesson10.Task3;

import java.util.Date;

public class MyDate extends Date {
	public boolean isNationallDay() {

		return getMonth() == 2 && getDate() == 3;
		
	}
}
