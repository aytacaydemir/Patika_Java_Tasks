package org.aytac;

import java.util.Scanner;
import java.util.function.DoubleToLongFunction;

public class Main {

	public static void main(String[] args) {

		double pArmut = 2.14, kArmut;
		double pElma = 3.67, kElma;
		double pDomates = 1.11, kDomates;
		double pMuz = 0.95, kMuz;
		double pPatlýcan = 5.00, kPatlýcan;

		Scanner input = new Scanner(System.in);

		System.out.print("Armut Kaç Kilo ? : ");
		kArmut = input.nextDouble();

		System.out.print("Elma Kaç Kilo ? : ");
		kElma = input.nextDouble();

		System.out.print("Domates Kaç Kilo ? : ");
		kDomates = input.nextDouble();

		System.out.print("Muz Kaç Kilo ? : ");
		kMuz = input.nextDouble();

		System.out.print("Patlýcan Kaç Kilo ? : ");
		kPatlýcan = input.nextDouble();
		input.close();

		double totalPrice = (pArmut * kArmut) + (pElma * kElma) + (pDomates * kDomates) + (pMuz * kMuz)
				+ (pPatlýcan * kPatlýcan);

		System.out.print("Toplam tutar : " + totalPrice);

	}

}
