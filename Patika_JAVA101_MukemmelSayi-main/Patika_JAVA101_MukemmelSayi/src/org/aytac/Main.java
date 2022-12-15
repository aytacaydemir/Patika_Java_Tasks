package org.aytac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz : ");
		int n = scanner.nextInt();
		scanner.close();
		int toplam = 0;

		for (int i = 1; i < n; i++) {

			if (n % i == 0) {

				toplam = toplam + i;
			}
		}

		if (toplam == n)
			System.out.println(+n + " Bir mükemmel sayidir. ");
		else {
			System.out.println(+n + " Bir mükemmel sayi degildir. ");

		}

	}

}
