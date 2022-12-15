package org.aytac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("A kenarýnýn uzunluðunu giriniz : ");
		int a = sc.nextInt();

		System.out.print("B kenarýnýn uzunluðunu giriniz : ");
		int b = sc.nextInt();

		System.out.print("C kenarýnýn uzunluðunu giriniz : ");
		int c = sc.nextInt();

		sc.close();

		int cevre = a + b + c;
		double ycevre = cevre / 2; // yari cevre

		double Alan = Math.sqrt(ycevre * (ycevre - a) * (ycevre - b) * (ycevre - c));

		System.out.println("Ucgenin alaný : " + Alan);

	}

}
