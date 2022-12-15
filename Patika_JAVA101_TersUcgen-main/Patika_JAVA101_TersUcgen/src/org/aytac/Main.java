/**
 * 
 */
package org.aytac;

import java.util.Iterator;
import java.util.Scanner;

/**
 * @author aydem
 *
 */
public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Basamak sayisini giriniz : ");
		int n = scanner.nextInt();
		scanner.close();
		int p = 0;

		for (int i = 1; i <= (n); i++) { // i

			for (int k = 1; k <= i - 1; k++) { // i-1
				System.out.print(" ");
			}

			for (int j = 1; j <= 2 * n - i - p; j++) { //

				System.out.print("*");

			}
			System.out.println();
			p++;
		}

	}

}
