package org.aytac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Kaç tane sayi gireceksiniz ? : ");
		int n = scanner.nextInt();
		System.out.print("1. Sayiyi Giriniz : ");
		int n1 = scanner.nextInt();

		int tMin = n1, tMax = n1;
		int temp = 0;

		for (int i = 2; i <= n; i++) {

			System.out.print(+i + ". Sayiyi Giriniz : ");
			temp = scanner.nextInt();

			if (temp < tMin) {
				tMin = temp;
			} else if (temp > tMax) {
				tMax = temp;
			}

		}

		System.out.println("Min number: " + tMin + ", Max Number: " + tMax);
	}

}
