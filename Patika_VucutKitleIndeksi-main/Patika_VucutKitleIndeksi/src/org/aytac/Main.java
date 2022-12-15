/*
 * Vücut Kitle Endeksini Hesaplayan Program
 * 
 * @author Aytac Aydemir
 * 
 */

package org.aytac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double boy;
		double kilo;
		double vkIndex;

		Scanner input = new Scanner(System.in);

		System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
		boy = input.nextDouble();

		System.out.print("Lütfen kilonuzu giriniz : ");
		kilo = input.nextDouble();

		input.close();

		System.out.print("Vücut Kitle Ýndeksiniz : " + kilo / (boy * boy));

	}

}