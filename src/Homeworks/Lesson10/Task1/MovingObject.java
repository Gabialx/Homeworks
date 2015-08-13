package Homeworks.Lesson10.Task1;

import java.awt.Graphics;

public class MovingObject extends GameObject {
	private int speed;

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.fillRect(x, y, x + 10, y + 10);
	}

}
