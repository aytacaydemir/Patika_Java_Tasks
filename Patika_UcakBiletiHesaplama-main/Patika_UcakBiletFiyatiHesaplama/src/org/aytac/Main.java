package org.aytac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Mesafeyi km türünden giriniz : ");
		int mesafe = scanner.nextInt();
		System.out.print("Yasinizi giriniz : ");
		int yas = scanner.nextInt();
		System.out.print("Yolculuk tipini giriniz (1=> Tek Yön , 2=> Gidis-Dönüs):  ");
		int tip = scanner.nextInt();
		scanner.close();

		double normalFiyat = mesafe * 0.10;
		double toplamTutar = 0;

		if ((tip == 1 || tip == 2) && (mesafe > 0) && (yas > 0)) {

			if (yas < 12) {
				toplamTutar = normalFiyat - (normalFiyat * 0.5);
			} else if (yas >= 12 && yas <= 24) {
				toplamTutar = normalFiyat - (normalFiyat * 0.1);
			} else if (yas > 65) {
				toplamTutar = normalFiyat - (normalFiyat * 0.3);
			}

			if (tip == 2) {
				toplamTutar = toplamTutar - toplamTutar * 0.2;
				toplamTutar *= 2;
			}

			System.out.println("Toplam tutar = " + toplamTutar);
		}

		else {
			System.out.println("Hatali Veri Girdiniz ..");
		}

	}

}
