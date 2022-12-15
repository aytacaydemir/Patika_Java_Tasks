package org.aytac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int a, b, c;
		Scanner scanner = new Scanner(System.in);

		System.out.print("Birinci sayiyi giriniz: ");
		a = scanner.nextInt();

		System.out.print("Ikinci sayiyi giriniz: ");
		b = scanner.nextInt();

		System.out.print("Ucuncu sayiyi giriniz: ");
		c = scanner.nextInt();

		scanner.close();

		if (a < b && a < c) {

			if (b < c) {

				System.out.println("a < b < c");
			} else {
				System.out.println("a < c < b");
			}
		} else if (b < a && b < c) {

			if (a < c) {
				System.out.println("b < a < c");
			} else {
				System.out.println("b < c < a");
			}

		} else {

			if (b < a) {
				System.out.println("c < b < a");
			} else {
				System.out.println("c < a < b");
			}

		}

	}
}
