package com.ndmm.internship.SalaryCalculator;

public class WageCalcu {
	private String employeeName;
	private int hours;
	private double rate, pay;

	public void setEmployeeName(String name) {
		employeeName = name;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public double calculatePay(int hours, double rate) {
		if (hours > 40) {
			int extraHours = hours - 40;
			pay = (40 * rate) + (extraHours *(rate*1.5));
		} else
			pay = hours * rate;

		return pay;
	}

	public void displayEmployee() {
		System.out.printf("Employee's name: %s", getEmployeeName());
		// System.out.printf("\nGross Salary: ", +pay);
		System.out.printf("\nGross Salary: %f", pay);
	}
}