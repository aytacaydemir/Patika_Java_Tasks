package org.aytac;

import java.util.Arrays;

public class Main {

	public static int repeat(int[] arr, int n) {

		int counter = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				counter++;
			}
		}
		return counter;
	}

	public static boolean isHave(int[] arr, int n) {

		boolean a = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				a = true;

			}
		}
		return a;

	}

	public static void main(String[] args) {

		int[] list = { 10, 20, 20, 10, 10, 20, 5, 20 };
		int[] duplicates = new int[list.length];
		Arrays.fill(duplicates, -99999999);

		for (int i = 0; i < list.length; i++) {

			if (!isHave(duplicates, list[i])) {

				int x = repeat(list, list[i]);
				System.out.println(list[i] + " sayisi " + x + " kere tekrar edildi. ");
				duplicates[i] = list[i];
			} else {
				continue;
			}

		}
	}
}
