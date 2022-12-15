package org.aytac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int mat, fizik, turkce, kimya, muzik;
		double sum = 0;
		int count = 0;

		Scanner scanner = new Scanner(System.in);

		System.out.print("Matematik notunuzu giriniz : ");
		mat = scanner.nextInt();
		if (mat <= 100 && mat > 0) {
			sum = sum + mat;
			count++;
		}

		System.out.print("Fizik notunuzu giriniz : ");
		fizik = scanner.nextInt();
		if (fizik <= 100 && fizik > 0) {
			sum = sum + fizik;
			count++;
		}

		System.out.print("Turkce notunuzu giriniz : ");
		turkce = scanner.nextInt();
		if (turkce <= 100 && turkce > 0) {
			sum = sum + turkce;
			count++;
		}

		System.out.print("Kimya notunuzu giriniz : ");
		kimya = scanner.nextInt();
		if (kimya <= 100 && kimya > 0) {
			sum = sum + kimya;
		}

		System.out.print("Muzik notunuzu giriniz : ");
		muzik = scanner.nextInt();
		if (muzik <= 100 && muzik > 0) {
			sum = sum + muzik;
			count++;
		}

		scanner.close();

		System.out.println("Ortalamaya katýlan ders sayýsý : " + count);
		double avarage = sum / count;

		System.out.println("Ortalamanýz : " + avarage);
		System.out.println((avarage >= 55) ? "Tebrikler sýnýfý geçtiniz " : "Sýnýfta kaldýnýz");

	}

}
