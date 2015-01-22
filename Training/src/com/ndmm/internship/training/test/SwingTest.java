package com.ndmm.internship.training.test;

import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class SwingTest extends JFrame {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new SwingTest();
				// start the simulator thread now
				Executors.newScheduledThreadPool(1).scheduleAtFixedRate(
						new Simulator(), 2, 3, TimeUnit.SECONDS);
			}
		});
	}

	public SwingTest() {
		initGui();
		setTitle("Test");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}

	static JTextField logField = new JTextField(20);

	public void initGui() {
		setLayout(new java.awt.FlowLayout());
		add(logField);
	}

	public static void writeLogField(final String logString) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				System.out.println("Writing: " + logString);
				logField.setText(logString);
			}
		});
	}
}

class Simulator implements Runnable {
	@Override
	public void run() {
		SwingTest.writeLogField(java.util.Calendar.getInstance().getTime()
				.toString());
	}
}