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
			System.out.println("Y�zmeye gidebilirsiniz");
		}

		
	}

}

/*
 * S�cakl�k 5'dan k���k ise "Kayak" yapmay� �ner. S�cakl�k 5 ve 15 aras�nda ise
 * "Sinema" etkinli�ini �ner. S�cakl�k 15 ve 25 aras�nda ise "Piknik"
 * etkinli�ini �ner. S�cakl�k 25'ten b�y�k ise "Y�zme" etkinli�ini �ner.
 */