package org.aytac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int n1, n2, islem;
		double sonuc;

		Scanner sc = new Scanner(System.in);
		System.out.print("�lk Sayiyi giriniz : ");
		n1 = sc.nextInt();
		System.out.print("�kinci Sayiyi Giriniz : ");
		n2 = sc.nextInt();

		System.out.println("Hangi i�lemi yapmak istersin? \n " + "1-Toplama \n 2-�ikarma \n 3-�arpma \n 4-B�lme");
		islem = sc.nextInt();

		sc.close();

		switch (islem) {

		case 1:
			sonuc = n1 + n2;
			System.out.println("n1 + n2 = " + sonuc);
			break;
		case 2:
			sonuc = n1 - n2;
			System.out.println("n1 - n2 = " + sonuc);

			break;
		case 3:
			sonuc = n1 * n2;
			System.out.println("n1 * n2 = " + sonuc);
			break;
		case 4:
			sonuc = n1 / n2;
			System.out.println("n1 / n2 = " + sonuc);
			break;

		default:
			break;

		}

	}

}
