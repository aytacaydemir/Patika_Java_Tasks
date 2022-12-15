package org.aytac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int heat;

		Scanner input = new Scanner(System.in);
		System.out.println("Hava Sicakligini giriniz");
		heat = input.nextInt();

		if (heat < 5) {
			System.out.println("Kayak yapabilirsiniz ");
		} else if (heat >= 5 && heat < 15) {
			System.out.println("Sinemaya gidebilirsiniz");
		} else if (heat >= 15 && heat < 25) {
			System.out.println("Piknige gidebilirsiniz");
		} else {
			System.out.println("Yüzmeye gidebilirsiniz");
		}

		
	}

}

/*
 * Sýcaklýk 5'dan küçük ise "Kayak" yapmayý öner. Sýcaklýk 5 ve 15 arasýnda ise
 * "Sinema" etkinliðini öner. Sýcaklýk 15 ve 25 arasýnda ise "Piknik"
 * etkinliðini öner. Sýcaklýk 25'ten büyük ise "Yüzme" etkinliðini öner.
 */