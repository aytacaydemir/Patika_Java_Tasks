package org.aytac;

public class Main {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 } };
		int row = 2, column = 3;

		int[][] transpose = new int[column][row];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				transpose[j][i] = arr[i][j];
			}
		}

		for (int i = 0; i < column; i++) {
			for (int j = 0; j < row; j++) {

				System.out.print(transpose[i][j] + " ");
			}

			System.out.println("");
		}

	}

}