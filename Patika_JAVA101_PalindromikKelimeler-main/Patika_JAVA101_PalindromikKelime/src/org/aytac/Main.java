package org.aytac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen bir kelime giriniz : ");
		String inpString = scanner.nextLine();
		scanner.close();
		System.out.println("Girdiginiz kelime : " + inpString);

		if (isPalindrome(inpString)) {
			System.out.println(inpString + " kelimesi palindrome'dur. ");
		} else {
			System.out.println(inpString + " kelimesi palindrome degildir. ");
		}

	}

	static boolean isPalindrome(String s) {

		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;

	}

}
