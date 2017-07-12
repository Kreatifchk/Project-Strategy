﻿package base;

import javax.swing.JFrame;

public class Main {
	
	static boolean history = false;

	public static void main(String[] args) {
		if (args.length > 0 && args[0].equals("history")) {
			history = true;
		}
		
		new Initialize(); //Инициализация всего
		
		Menu m = new Menu();
		m.setVisible(true);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.setSize(600, 561); //541
		m.setResizable(false);
		m.setLocationRelativeTo(null);
	}

}