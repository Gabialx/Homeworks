package Homeworks.Lesson10.Task2;

import java.util.List;

public class Teacher extends Human {
	private String predmet;
	private int trydovstaj;
	private List<Student> studentsList;

	public List<Student> getStudentsList() {
		return studentsList;
	}

	public void setStudentsList(List<Student> studentsList) {
		this.studentsList = studentsList;
	}

	public String getPredmet() {
		return predmet;
	}

	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}

	public int getTrydovstaj() {
		return trydovstaj;
	}

	public void setTrydovstaj(int trydovstaj) {
		this.trydovstaj = trydovstaj;
	}

	public int broiStudents() {
		return studentsList.size();
	}

}
