package org.aytac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Basamak sayýsýný giriniz : ");
		int n = scanner.nextInt();
		scanner.close();

		for (int i = 1; i <= (n); i++) { // i

			for (int k = 1; k <= Math.abs(i - (n + 1) / 2); k++) { // |i-(n+1)/2|
				System.out.print(" ");
			}

			for (int j = 1; j <= n - 2 * (Math.abs(i - (n + 1) / 2)); j++) { // n - (2*|i-(n+1)/2|)

				System.out.print("*");

			}
			System.out.println();
		}

	}

}
