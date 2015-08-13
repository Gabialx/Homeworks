package Homeworks.Lesson10.Task1;

import java.awt.Color;
import java.awt.Graphics;

public class GameObject {
	protected int x;
	protected int y;
	protected Color color;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void paint(Graphics g) {

	}
}
