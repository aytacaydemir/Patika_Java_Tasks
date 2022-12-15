
public class Employee {

	private String name;
	private double salary;
	private double workHours;
	private int hireYear;

	public Employee(String name, int salary, int workHours, int hireYear) { // constructor method
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public double tax() { // tax method which calculates the tax of employee

		if (this.salary < 1000) {

			return 0;

		} else {

			return (this.salary * (0.03));
		}

	};

	public double bonus() { // bonus method which calculates employee's payment for extra working hours

		if (this.workHours <= 40) {
			return 0;

		} else {
			return (workHours - 40) * 30 * 4; // calculating bonus for one month (x4)
		}
	}

	public double raiseSalary() { // method for calculating employee's salary raise

		double bonusAndTaxes = bonus() - tax(); // processed salary with bonus and tax

		int currentYear = 2021; // current year
		int experience = currentYear - this.hireYear; // experience variable which calculates experience(years) of
														// employee

		if (experience > 19) {
			return ((this.salary + bonusAndTaxes) * (0.15));
		} else if ((experience > 9) && (experience < 20)) {
			return ((this.salary + bonusAndTaxes) * (0.1));
		} else {
			return ((this.salary + bonusAndTaxes) * (0.05));
		}

	}

	@Override
	public String toString() {
		return " Adý : " + name + "\n Maaþý : " + salary + "\n Çalýþma Saati : " + workHours + "\n Baþlangýç Yýlý : "
				+ hireYear + "\n Vergi : " + tax() + "\n Bonus (aylýk) : " + bonus() + "\n Maaþ Artýþý : "
				+ raiseSalary() + "\n Vergi ve Bonuslar ile birlikte maaþ : " + (this.salary + bonus() - tax())
				+ "\n Toplam Maaþ : " + (this.salary + raiseSalary() + bonus());
	}

}
