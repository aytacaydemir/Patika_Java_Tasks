package org.aytac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("N sayisini giriniz : ");
		int N = scanner.nextInt();
		scanner.close();
		double toplam = 0;

		for ( double i = 1; i <= N; i++) {

			toplam += 1.0 / i;

		}

		System.out.println(toplam);
	}

}
