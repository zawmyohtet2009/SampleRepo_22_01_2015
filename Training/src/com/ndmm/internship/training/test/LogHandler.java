package com.ndmm.internship.training.test;

import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public final class LogHandler {
	private static JTextField logField = null;

	public static boolean setLogField(JTextField tf) {
		if (logField == null) {
			logField = tf;
		}
		return true;
	}

	public static void writeLogField(final String logString) {
		if (logField != null) {
			SwingUtilities.invokeLater(new Runnable() {
				public void run() {
					if (logField != null) {
						System.out.println("Writing: " + logString);
						logField.setText(logString);
					}
				}
			});
		}
	}

	public static void clearLogField() {
		if (logField != null) {
			logField.setText("");
		}
	}

}