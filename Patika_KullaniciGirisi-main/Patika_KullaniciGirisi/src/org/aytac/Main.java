package org.aytac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String userName, password;

		Scanner sc = new Scanner(System.in);

		System.out.print("Kullan�c� ad�n�z : ");
		userName = sc.nextLine();

		System.out.print("�ifreniz : ");
		password = sc.nextLine();

		if (userName.equals("patika") && password.equals("java123")) {

			System.out.println("Giris yaptiniz");

		} else if (userName.equals("patika") && !password.equals("java123")) {
			System.out.print("�ifreniz Yanl��, S�f�rlamak i�in 1'i tu�lay�n�z.. ");
			int x = sc.nextInt();

			if (x == 1) {
				System.out.print("Yeni bir �ifre giriniz: ");
				Scanner scanner = new Scanner(System.in);
				String newPass = scanner.nextLine();

				while (newPass.equals("java123")) {
					System.out.print("Yeni �ifreniz eski �ifreniz ile ayn� olamaz, l�tfen yeni bir �ifre giriniz. ");
					newPass = scanner.nextLine();

				}
				scanner.close();
				sc.close();
				System.out.println("Yeni �ifre olu�turuldu..Program sonland�.. ");
				

			}

			else {
				System.out.println("Yeni �ifre olu�turma iste�i yap�lmad�, Program sonland� ");
			}

		}

		else {
			System.out.println("Kullan�c� ad� hatal�! ");
		}
	}

}
