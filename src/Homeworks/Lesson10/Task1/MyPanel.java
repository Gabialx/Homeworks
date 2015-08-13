package Homeworks.Lesson10.Task1;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	public MyPanel(Color bgColor) {
		setBackground(bgColor);

	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		g.setColor(new Color(0, 0, 255));
		g.fillOval(100, 100, 30, 30);
	}

}