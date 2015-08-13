package Homeworks.Lesson10.Task2;

import java.util.List;

public class Student extends Human {
	private int fn;
	private int nomerstkn;
	private List<Integer> scores;

	public List<Integer> getScores() {
		return scores;
	}

	public void setScores(List<Integer> scores) {
		this.scores = scores;
	}

	public int getFn() {
		return fn;
	}

	public void setFn(int fn) {
		this.fn = fn;
	}

	public int getNomerstkn() {
		return nomerstkn;
	}

	public void setNomerstkn(int nomerstkn) {
		this.nomerstkn = nomerstkn;
	}

	public int countSix() {
		int count = 0;
		for (int i = 0; i < scores.size(); i++) {
			if (scores.get(i) == 6) {
				count++;

			}

		}
		return count;

	}
}
