package Homeworks.Lesson10.Task1;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;

import javax.swing.JFrame;

public class Game {
	public static int width = 640;
	public static int height = 480;
	public static Color bgColor = new Color(255, 0, 0);

	public static void main(String[] args) {
		JFrame frame = new JFrame("Gabi`s Game");
		frame.setSize(width, height);
		frame.setBackground(bgColor);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new MyPanel(bgColor));
		frame.setVisible(true);

	}
	
}
