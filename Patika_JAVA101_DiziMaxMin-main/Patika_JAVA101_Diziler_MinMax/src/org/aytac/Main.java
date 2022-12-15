package org.aytac;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Bir sayi giriniz : ");
		int inp = scanner.nextInt();
		scanner.close();
		System.out.println("Girilen Sayi : " + inp);

		int[] list = { 15, 12, 788, 1, -1, -778, 2, 0 };
		int tempMin = inp;
		int tempMax = inp;
		Arrays.sort(list);

		// System.out.println(Arrays.toString(list));

		for (int i = 0; i < list.length; i++) {

			if (inp > list[i] && inp < list[i + 1]) {

				tempMin = list[i];
				tempMax = list[i + 1];
			}

		}

		System.out.println("Dizi: " + Arrays.toString(list));
		System.out.println("Girilen sayiden kucuk en yakin sayi : " + tempMin);
		System.out.println("Girilen sayiden buyuk en yakin sayi : " + tempMax);
	}

}
