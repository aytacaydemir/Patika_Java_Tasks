package org.aytac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Kombinasyon n deðerini giriniz : ");
		int n = scanner.nextInt();
		System.out.println("Kombinasyon r deðerini giriniz : ");
		int r = scanner.nextInt();
		int nFac = 1;
		int rFac = 1;
		int nmrFac = 1;

		for (int i = 1; i <= n; i++) {
			nFac *= i;
		}

		for (int i = 1; i <= r; i++) {
			rFac *= i;
		}

		for (int i = 1; i <= (n - r); i++) {
			nmrFac *= i;
		}

		System.out.println("C(n,r)= " + nFac / (rFac * nmrFac));

	}

}
