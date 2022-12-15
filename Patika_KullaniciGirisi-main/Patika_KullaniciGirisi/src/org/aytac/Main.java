package org.aytac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String userName, password;

		Scanner sc = new Scanner(System.in);

		System.out.print("Kullanýcý adýnýz : ");
		userName = sc.nextLine();

		System.out.print("Þifreniz : ");
		password = sc.nextLine();

		if (userName.equals("patika") && password.equals("java123")) {

			System.out.println("Giris yaptiniz");

		} else if (userName.equals("patika") && !password.equals("java123")) {
			System.out.print("Þifreniz Yanlýþ, Sýfýrlamak için 1'i tuþlayýnýz.. ");
			int x = sc.nextInt();

			if (x == 1) {
				System.out.print("Yeni bir þifre giriniz: ");
				Scanner scanner = new Scanner(System.in);
				String newPass = scanner.nextLine();

				while (newPass.equals("java123")) {
					System.out.print("Yeni þifreniz eski þifreniz ile ayný olamaz, lütfen yeni bir þifre giriniz. ");
					newPass = scanner.nextLine();

				}
				scanner.close();
				sc.close();
				System.out.println("Yeni þifre oluþturuldu..Program sonlandý.. ");
				

			}

			else {
				System.out.println("Yeni þifre oluþturma isteði yapýlmadý, Program sonlandý ");
			}

		}

		else {
			System.out.println("Kullanýcý adý hatalý! ");
		}
	}

}
