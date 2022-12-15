package org.aytac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double pi = 3.14;
		double r;
		double angle;

		Scanner sc = new Scanner(System.in);

		System.out.print("Dairenin yaricabini giriniz: ");
		r = sc.nextDouble();

		System.out.print("Dairenin merkez acisinin olcusunu giriniz: ");
		angle = sc.nextDouble();

		sc.close();

		double alan = (pi * (r * r) * angle) / 360;
		System.out.println("Dairenin alani: " + alan);

	}

}