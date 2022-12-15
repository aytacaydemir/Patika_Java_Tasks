package org.aytac;

import java.util.Scanner;

public class Main {

	static int toplama(int a, int b) {
		return a + b;
	}

	static int cikarma(int a, int b) {
		return a - b;
	}

	static int carpma(int a, int b) {
		return a * b;
	}

	static int bolme(int a, int b) {
		return a / b;
	}

	static int usAlma(int a, int b) {
		return (int) Math.pow(a, b);
	}

	static int modAlma(int a, int b) {
		return a % b;
	}

	static void diktortgen(int a, int b) {
		System.out.println("Dikdortgenin Alaný : " + a * b + " Cevresi: " + 2 * (a + b));
	}

	public static void main(String[] args) {

		String menu = "1- Toplama Islemi\n" + "2- Cikarma Islemi\n" + "3- Carpma Islemi\n" + "4- Bolme Islemi\n"
				+ "5- Uslu Sayi Hesaplama\n" + "6- Mod Alma\n" + "7- Diktortgen Alan ve Cevre Hesabý\n"
				+ "0- Cikis Yap";

		Scanner scanner = new Scanner(System.in);
		int select;

		do {
			System.out.print("\nLutfen yapmak istediginiz islemi seciniz :\n");

			System.out.println(menu);
			select = scanner.nextInt();
			int a = scanner.nextInt();
			int b = scanner.nextInt();

			switch (select) {

			case 1:
				System.out.println(toplama(a, b));
				break;

			case 2:
				System.out.println(cikarma(a, b));
				break;

			case 3:
				System.out.println(carpma(a, b));
				break;

			case 4:
				System.out.println(bolme(a, b));
				break;

			case 5:
				System.out.println(usAlma(a, b));
				break;

			case 6:
				System.out.println(modAlma(a, b));
				break;

			case 7:
				diktortgen(a, b);
				break;

			}

		} while (select != 0);

		System.out.println("Güle güle");
	}

}
