package Homeworks.Lesson10.Task1;

import java.awt.Graphics;

public class FlappyBird extends MovingObject {
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void flap() {
		x = x - 10;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.fillOval(x, y, x + 10, y + 10);
	}

}
