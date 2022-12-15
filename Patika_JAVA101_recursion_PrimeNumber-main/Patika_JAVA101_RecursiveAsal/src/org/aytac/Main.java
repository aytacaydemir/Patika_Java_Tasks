package org.aytac;

import java.util.Scanner;

public class Main {

	static boolean isPrime(int n, int i) {

		if (n <= 1)
			return false;
		if (n == 2)
			return true;
		if (n % i == 0)
			return false;
		if (i * i > n)
			return true;

		return isPrime(n, i + 1);
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz :");
		int n = scanner.nextInt();
		scanner.close();

		boolean isPrimeNumber = isPrime(n, 2);

		if (isPrimeNumber)
			System.out.println(n + " Asal Bir Sayidir. ");
		else {
			System.out.println(n + " Bir Asal Sayi Degildir. ");
		}
	}

}
