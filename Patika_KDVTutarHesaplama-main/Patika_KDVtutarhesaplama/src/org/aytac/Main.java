package org.aytac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double kdvRate = 0.18;
		double kdvliTutar;
		double kdvTutar;

		Scanner sc = new Scanner(System.in);

		System.out.print("KDV'siz fiyat : ");
		double value = sc.nextDouble();
		sc.close();

		if (value > 0 && value < 1000) {
			kdvRate = 0.18;
		} else if (value >= 1000) {
			kdvRate = 0.08;
		}

		kdvTutar = value * kdvRate;
		kdvliTutar = value + kdvTutar;

		System.out.println("KDV'siz tutar : " + value);
		System.out.println("KDV orani : " + kdvRate);
		System.out.println("KDV Tutari : " + kdvTutar);
		System.out.println("KDV'li Tutari : " + kdvliTutar);

	}

}
