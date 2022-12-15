package org.aytac;

import java.util.Scanner;

public class Main {

	static int pattern(int n) {

		boolean b = true; // büyüktür sýfýr
		int m = n;
		return pattern(n, m, b);
	}

	static int pattern(int n, int m, boolean b) {

		if (b) {

			if (n > 0) {
				System.out.print(n + " ");
				return pattern(n - 5, m, b);
			} else {
				b = false;
				return pattern(n, m, b);
			}

		} else {
			if (n == m) {
				System.out.print(n + " ");
				return 0;

			} else {
				System.out.print(n + " ");
				return pattern(n + 5, m, b);
			}
		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz : ");
		int n = scanner.nextInt();
		scanner.close();

		pattern(n);

	}

}
