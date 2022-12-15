/**
 * 
 */
package org.aytac;

import java.util.Scanner;

/**
 * @author aydem
 *
 */
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("n1 sayisini giriniz : ");
		int n1 = scanner.nextInt();
		System.out.print("n2 sayisini giriniz : ");
		int n2 = scanner.nextInt();
		scanner.close();
		int ebob = 1;
		int ekok;

		int i = 1;
		while (i <= n1) { // n1<n2

			if (n1 % i == 0 && n2 % i == 0) {
				ebob = i;
			}
			i++;
		}

		ekok = (n1 * n2) / ebob;

		System.out.println("Ebob : " + ebob);
		System.out.println("Ekok : " + ekok);
	}

}
