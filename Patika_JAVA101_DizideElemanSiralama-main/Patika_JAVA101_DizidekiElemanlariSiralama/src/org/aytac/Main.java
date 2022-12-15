package org.aytac;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Dizinin boyutu : ");
		int n = scanner.nextInt();

		int[] arr = new int[n];
		System.out.println("Dizinin Elemanlarýný Giriniz: ");

		for (int i = 0; i < n; i++) {

			System.out.print("Dizinin " + (i + 1) + ". Elemaný : ");
			int x = scanner.nextInt();
			arr[i] = x;

		}

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if (arr[i] < arr[j]) {

					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}

		}
		scanner.close();
		System.out.println(Arrays.toString(arr));
	}

}
