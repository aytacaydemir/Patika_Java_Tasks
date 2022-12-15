package org.aytac;

import java.util.Scanner;

public class MineSweeper {

	int row;
	int column;

	public MineSweeper(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public void run() {

		int[][] arrMine = locateMineArr(row, column);

		int[][] gameArr = GameArr(arrMine, row, column);

		String[][] arrShow = printField(arrMine, row, column, true); // mayýnlý halini yazdýrýr.

		boolean gameRun = true;

		while (gameRun) {

			Scanner scanner = new Scanner(System.in);
			System.out.print("Satir giriniz: ");
			int a = scanner.nextInt();

			System.out.print("Sütun giriniz: ");
			int b = scanner.nextInt();

			if (isInside(a, b, row, column) == false) {

				System.out.println("Girdiðiniz noktalar oyun alaný içerisinde deðil! \n "
						+ "Lütfen yeni satir ve sütun giriniz: ");

			}

			else if (arrMine[a][b] == 1) {
				System.out.println("/////////////////////////////////////");
				System.out.println("Mayýna Bastýnýz!  GAME OVER ! ");
				gameRun = false;
				break;
			}

			else {
				arrShow[a][b] = String.valueOf(gameArr[a][b] + " ");
				printShow(arrShow, row, column);
				// System.out.println("Kodlamaya devam. ");
				System.out.println("/////////////////////////////////////");
			}

		}

	}

	public String[][] printField(int[][] arrMine, int row, int column, boolean a) {

		String[][] arrShow = new String[row][column];

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < column; j++) {

				arrShow[i][j] = "- ";

				if (arrMine[i][j] == 1 && a == true) { // a true ise mayýnlarý yazdýrýr.

					System.out.print("* ");
				} else {

					System.out.print("- ");

				}

			}
			System.out.println("");
		}

		return arrShow;

	}

	public void printShow(String[][] arrShow, int row, int column) {

		for (int i = 0; i < row; i++) {

			for (int j = 0; j < column; j++) {

				System.out.print(arrShow[i][j]);

			}
			System.out.println(" ");
		}

	}

	public int[][] locateMineArr(int row, int column) { // gerçek array boyutlarýnda
														// mine array'im oluþturuldu
		int mineNum = (int) (row * column) / 4;
		int[][] arrMine = new int[row][column];

		int k = 0;
		while (k < mineNum) {
			int i = (int) (Math.random() * row);
			int j = (int) (Math.random() * column);

			if (arrMine[i][j] != 1) {
				arrMine[i][j] = 1;
				k++;
			}
		}
		return arrMine;
	}

	public boolean isInside(int i, int j, int row, int column) {

		if ((i >= 0) && (i < row) && (j >= 0) && (j < column)) {
			return true;
		} else {
			return false;
		}

	}

	public int[][] GameArr(int[][] arrMine, int row, int column) {

		int[][] gameArray = new int[row][column];

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {

				if (isInside(i - 1, j, row, column)) {

					if (arrMine[i - 1][j] == 1) {
						gameArray[i][j] += 1;
					}
				}

				if (isInside(i + 1, j, row, column)) {

					if (arrMine[i + 1][j] == 1) {
						gameArray[i][j] += 1;
					}
				}

				if (isInside(i, j - 1, row, column)) {

					if (arrMine[i][j - 1] == 1) {
						gameArray[i][j] += 1;
					}
				}

				if (isInside(i, j + 1, row, column)) {

					if (arrMine[i][j + 1] == 1) {
						gameArray[i][j] += 1;
					}
				}

				if (isInside(i - 1, j - 1, row, column)) {

					if (arrMine[i - 1][j - 1] == 1) {
						gameArray[i][j] += 1;
					}
				}

				if (isInside(i + 1, j + 1, row, column)) {

					if (arrMine[i + 1][j + 1] == 1) {
						gameArray[i][j] += 1;
					}
				}

				if (isInside(i - 1, j + 1, row, column)) {

					if (arrMine[i - 1][j + 1] == 1) {
						gameArray[i][j] += 1;
					}
				}

				if (isInside(i + 1, j - 1, row, column)) {

					if (arrMine[i + 1][j - 1] == 1) {
						gameArray[i][j] += 1;
					}
				}
			}

		}

		return gameArray;

	}

}
