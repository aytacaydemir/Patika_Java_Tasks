package org.aytac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Taban sayýsýný giriniz : ");
		int taban = scanner.nextInt();
		System.out.print("Us sayisini giriniz : ");
		int us = scanner.nextInt();
		scanner.close();
		int sonuc = 1;

		for (int i = 1; i <= us; i++) {
			sonuc *= taban;
		}
		System.out.println(taban + " ussu " + us + " = " + sonuc);

	}
}
