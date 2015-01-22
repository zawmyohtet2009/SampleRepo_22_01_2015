package com.ndmm.internship.File;

public class CharString {
	public static void main(String args[]) {
		String str5 = "select * from ; table; ";
		char[] a = str5.toCharArray();
		StringBuilder sb = new StringBuilder(str5);
		int index = sb.lastIndexOf(";");
		sb.deleteCharAt(index);
		String resultString = sb.toString();
		System.out.println("After converting " + resultString);
		// char[] a = { 'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd' };
		for (char i : a) {
			System.out.println(i);
		}
		String str1 = String.valueOf(a);
		System.out.println("str1 is " + str1);
		String str2 = a + " ";
		System.out.println("str1 is " + str2);
		String text = String.copyValueOf(a);
		System.out.println("text is " + text);

	}
}
