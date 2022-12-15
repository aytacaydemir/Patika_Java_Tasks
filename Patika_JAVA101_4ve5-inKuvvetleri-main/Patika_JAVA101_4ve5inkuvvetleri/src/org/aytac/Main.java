package org.aytac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Sýnýr sayisini giriniz : ");
		int sayi = scanner.nextInt();
		scanner.close();
		int i = 1;
		int j = 1;

		while (i < sayi) {

			System.out.println("4'ün kuvvetleri : " + i);

			i = i * 4;

		}

		while (j < sayi) {

			System.out.println("5'in kuvvetleri : " + j);

			j = j * 5;

		}

	}

}
