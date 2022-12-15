package org.aytac;

import java.util.Scanner;

public class Main {

	static void isPalindrom(int number) {

		int temp = number;
		int reverseNumber = 0;
		int lastNumber;

		while (temp != 0) {

			lastNumber = temp % 10;
			reverseNumber = (reverseNumber * 10) + lastNumber;
			temp /= 10;

		}

		if (number == reverseNumber) {
			System.out.println("Palindrom sayidir.  ");
		} else {
			System.out.println("Palindrom sayi degildir !  ");
		}

	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz: ");
		int number = scanner.nextInt();

		isPalindrom(number);

	}

}
