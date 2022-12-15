package org.aytac;

public class Main {

	public static void main(String[] args) {

		for (int i = 3; i <= 100; i++) {

			boolean asal = true;
			// System.out.println("i " + i);
			for (int j = 2; j < i; j++) {
				// System.out.println("j " + j);
				if (i % j == 0) {

					asal = false;
				}

			}

			if (asal) {
				System.out.println(i);
			}

		}

	}

}
