package com.ndmm.internship.SalaryCalculator;

import java.util.Scanner;

public class Employee {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		WageCalcu employee = new WageCalcu();

		System.out.print("Enter Employee %s name: ");
		String name = input.nextLine();
		employee.setEmployeeName(name);

		System.out.print("Enter how many hours worked: ");
		int hours = input.nextInt();

		System.out.print("Enter hourly rate: ");
		double rate = input.nextDouble();

		employee.calculatePay(hours, rate);
		employee.displayEmployee();

		System.out.println();

	}
}