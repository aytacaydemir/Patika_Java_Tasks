package org.aytac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int yil;

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir yil giriniz : ");
		yil = scanner.nextInt();
		scanner.close();
		if (yil % 100 == 0) {

			if (yil % 400 == 0) {
				System.out.println(+yil + " bir artik yildir!");
			}

			else {
				System.out.println(+yil + " bir artik yil degildir !");

			}
		}

		else {

			if (yil % 4 == 0) {
				System.out.println(+yil + " bir artik yildir !");
			}

			else {
				System.out.println(+yil + " bir artik yil degildir !");

			}
		}
	}

}
