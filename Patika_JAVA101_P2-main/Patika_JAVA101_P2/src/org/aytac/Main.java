package org.aytac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int sum = 0;
		int sayi;
		int count = 0;

		do {
			System.out.println("Bir sayi giriniz : ");
			sayi = scanner.nextInt();

			if (sayi % 2 == 0 && sayi % 4 == 0) {

				sum = sayi + sum;
				count++;
			}
		} while (sayi % 2 != 1);

		scanner.close();

		if (count > 0) {
			System.out.println("Sonuc :" + sum / (count));
		} else {
			System.out.println("Sonuc = 0");
		}

	}

}
