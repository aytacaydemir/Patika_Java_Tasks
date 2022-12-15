package org.aytac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int mat, fizik, kimya, turkce, tarih, muzik;

		Scanner sc = new Scanner(System.in);

		System.out.print("Matematik notunu giriniz : ");
		mat = sc.nextInt();

		System.out.print("Fizik notunu giriniz : ");
		fizik = sc.nextInt();

		System.out.print("Kimya notunu giriniz : ");
		kimya = sc.nextInt();

		System.out.print("Türkçe notunu giriniz : ");
		turkce = sc.nextInt();

		System.out.print("Tarih notunu giriniz : ");
		tarih = sc.nextInt();

		System.out.print("Müzik notunu giriniz : ");
		muzik = sc.nextInt();

		sc.close();

		double ort = (mat + fizik + kimya + tarih + turkce + muzik) / 6;

		System.out.println("Ortalama : " + ort);
		System.out.println(ort > 60 ? "Sinifi Geçti" : "Sinifta Kaldi");

	}

}
