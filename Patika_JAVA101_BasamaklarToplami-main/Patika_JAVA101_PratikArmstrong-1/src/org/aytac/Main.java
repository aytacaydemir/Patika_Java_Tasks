package org.aytac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayý giriniz: ");
		int sayi = scanner.nextInt();
		int toplam = 0;
		scanner.close();
		// basamaklar toplamý

		while (sayi > 0) {

			toplam = toplam + sayi % 10;
			sayi = sayi / 10;
		}
		System.out.println(toplam);

	}

}
