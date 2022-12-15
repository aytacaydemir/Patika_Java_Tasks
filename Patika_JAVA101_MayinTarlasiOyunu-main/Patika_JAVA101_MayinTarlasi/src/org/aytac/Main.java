package org.aytac;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner scanner= new Scanner(System.in);
		System.out.print("Satýr Sayisini Giriniz : ");
		int row=scanner.nextInt();
		System.out.print("Sutun Sayisini Giriniz : ");
		int column = scanner.nextInt();
		
		MineSweeper game=new MineSweeper(row, column);
		game.run();
		
		
		
		
	}

}
