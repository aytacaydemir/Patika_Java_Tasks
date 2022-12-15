package org.aytac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir sayý giriniz : ");
		int sayi = scanner.nextInt();
		scanner.close();
		int sum = 0;
		int count = 0;

		for (int i = 0; i <= sayi; i++) {

			if (i % 3 == 0 && i % 4 == 0) {

				sum = sum + i;
				count++;

			}

		}

		System.out.println("0'dan " + sayi + "'ya kadar 3'e ve 4'e tam bölünen sayilarin ortalamasý = " + sum / count);

	}

}
