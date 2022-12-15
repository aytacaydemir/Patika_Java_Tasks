package org.aytac;

import java.util.Scanner;

public class Main {

	static int pow(int a , int b) {
		
		if(b==0) {
			return 1;
		}
		return a*pow(a, b-1);	
	}
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Taban degerini giriniz : ");
		int taban = scanner.nextInt();
		System.out.println("Us degerini giriniz : ");
		int us = scanner.nextInt();
		
		scanner.close();
		
		System.out.println(pow(taban, us));
	
	}

}
