package org.aytac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int maxDeneme = 10;
		int denemeSayisi = 0;
		boolean run = true;

		int randNum = (int) ((Math.random() * 100));
		System.out.println(randNum);

		System.out.print("Sayi Tahmin Oyununa Hosgeldiniz ! \n Lütfen 0-99 arasinda bir sayi giriniz : ");

		while (run) {

			int inp = scanner.nextInt();

			if (inp > 99 || inp < 0) {
				run = false;
				System.out.println("0-99 araliginda bir sayi girmediginiz icin program sonlandirildi. ");
				break;
			} else {

				if (inp == randNum) {

					denemeSayisi++;
					System.out.println("#######   Tebrikler! " + denemeSayisi + ". denemenizde kazandiniz!   ######");

				}

				else {

					if (maxDeneme - denemeSayisi <= 1) {
						System.out.println("************ Deneme hakkiniz sona erdi! GAME OVER! *********");
						run = false;
						break;
					}

					else {

						denemeSayisi++;
						System.out.println("------------------------ \n Yanlis sayi tahmini! \n Kalan Tahmin Hakki:"
								+ (maxDeneme - denemeSayisi) + "\nLütfen yeni bir sayi giriniz: ");

					}
				}

			}

		}
		scanner.close();
	}

}
