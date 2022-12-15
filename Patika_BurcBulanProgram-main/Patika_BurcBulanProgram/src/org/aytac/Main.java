package org.aytac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int gun, ay;
		boolean isError = false;
		String burc = "";

		Scanner scanner = new Scanner(System.in);

		System.out.print("Doðduðunuz gün nedir? : ");
		gun = scanner.nextInt();
		System.out.print("Doðduðunuz ay nedir? : ");
		ay = scanner.nextInt();
		scanner.close();

		if (ay == 1 && gun <= 31 && gun >= 1) {

			if (gun <= 21 && gun >= 1) {
				burc = "oglak";
			} else {
				burc = "kova";
			}

		} else if (ay == 2 && gun <= 28 && gun >= 1) {

			if (gun <= 20 && gun >= 1) {
				burc = "kova";
			} else {
				burc = "balik";
			}

		} else if (ay == 3 && gun <= 31 && gun >= 1) {

			if (gun <= 20 && gun >= 1) {
				burc = "balik";
			} else {
				burc = "koc";
			}

		} else if (ay == 4 && gun <= 30 && gun >= 1) {

			if (gun <= 20 && gun >= 1) {
				burc = "koc";
			} else {
				burc = "boga";
			}

		} else if (ay == 5 && gun <= 31 && gun >= 1) {

			if (gun <= 21 && gun >= 1) {
				burc = "boga";
			} else {
				burc = "ikizler";
			}

		} else if (ay == 6 && gun <= 30 && gun >= 1) {

			if (gun <= 22 && gun >= 1) {
				burc = "ikizler";
			} else {
				burc = "yengec";
			}

		} else if (ay == 7 && gun <= 31 && gun >= 1) {

			if (gun <= 23 && gun >= 1) {
				burc = "yengec";
			} else {
				burc = "aslan";
			}

		} else if (ay == 8 && gun <= 31 && gun >= 1) {

			if (gun <= 22 && gun >= 1) {
				burc = "aslan";
			} else {
				burc = "basak";
			}

		} else if (ay == 9 && gun <= 30 && gun >= 1) {

			if (gun <= 22 && gun >= 1) {
				burc = "basak";
			} else {
				burc = "terazi";
			}

		} else if (ay == 10 && gun <= 31 && gun >= 1) {

			if (gun <= 21 && gun >= 1) {
				burc = "terazi";
			} else {
				burc = "akrep";
			}

		} else if (ay == 11 && gun <= 30 && gun >= 1) {

			if (gun <= 21 && gun >= 1) {
				burc = "akrep";
			} else {
				burc = "yay";
			}

		} else if (ay == 12 && gun <= 31 && gun >= 1) {

			if (gun <= 21 && gun >= 1) {
				burc = "yay";
			} else {
				burc = "oglak";
			}

		}

		else {
			isError = true;

		}

		if (isError) {
			System.out.println("Hatali gün/ay girisi yaptiniz. ");
		} else {
			System.out.println("Burcunuz: " + burc);
		}
	}

}
