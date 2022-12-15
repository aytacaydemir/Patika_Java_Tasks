package org.aytac;

public class Employee {

	String name;
	int salary;
	int workHours;
	int hireYear;

	Employee(String name, int salary, int workHours, int hireYear) {

		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public double tax(double salary) {

		if (salary < 1000) {
			return 0;
		} else {
			return salary * 0.03;

		}

	}

	public int bonus(int workHours) {

		if (workHours > 40) {
			return 30 * (workHours - 40);
		}

		else {
			return 0;
		}

	}

	public double raiseSalary(int hireYear) {
		int x = 2021 - hireYear;

		if (x < 10) {
			return 0.05 * salary;
		} else if ((x < 20 && x > 9)) {
			return 0.10 * salary;
		} else {
			return 0.15 * salary;
		}

	}

	public String toString() {
		return (  "Adi: " + name + "\n" 
				+ "Maasi: " + salary + "\n" 
				+ "Calisma Saati: " + workHours + "\n"
				+ "Baslangic Yili: " + hireYear + "\n" 
				+ "Vergi: " + tax(salary) + "\n" 
				+ "Bonus: " + bonus(workHours) + "\n" 
				+ "Maas Artisi: "+ raiseSalary(hireYear) + "\n" 
				+ "Vergi ve bonuslar ile birlikte maas: " + (salary+bonus(workHours)-tax(salary)) + "\n" 
				+ "Toplam Maas: " + (salary+raiseSalary(hireYear)) + "\n");

	}
}
