package org.aytac;

import java.util.Scanner;
import java.util.function.DoubleToLongFunction;

public class Main {

	public static void main(String[] args) {

		double pArmut = 2.14, kArmut;
		double pElma = 3.67, kElma;
		double pDomates = 1.11, kDomates;
		double pMuz = 0.95, kMuz;
		double pPatl�can = 5.00, kPatl�can;

		Scanner input = new Scanner(System.in);

		System.out.print("Armut Ka� Kilo ? : ");
		kArmut = input.nextDouble();

		System.out.print("Elma Ka� Kilo ? : ");
		kElma = input.nextDouble();

		System.out.print("Domates Ka� Kilo ? : ");
		kDomates = input.nextDouble();

		System.out.print("Muz Ka� Kilo ? : ");
		kMuz = input.nextDouble();

		System.out.print("Patl�can Ka� Kilo ? : ");
		kPatl�can = input.nextDouble();
		input.close();

		double totalPrice = (pArmut * kArmut) + (pElma * kElma) + (pDomates * kDomates) + (pMuz * kMuz)
				+ (pPatl�can * kPatl�can);

		System.out.print("Toplam tutar : " + totalPrice);

	}

}
