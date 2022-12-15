package org.aytac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Fibonacci serisinin eleman sayýsýný giriniz : ");
		int n = scanner.nextInt();
		scanner.close();
		int fiboNum = 0;
		int temp = 1;
		int sum;

		System.out.print(+n + " Elemanli Fibonacci Serisi : ");

		for (int i = 1; i <= n; i++) {

			System.out.print(" " + fiboNum + " ");

			sum = fiboNum + temp;
			fiboNum = temp;
			temp = sum;

		}

	}

}
