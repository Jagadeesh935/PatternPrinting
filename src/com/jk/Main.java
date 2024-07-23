package com.jk;

public class Main {
	public static void main(String[] args) {

		System.out.println("\n------Pattern 1-----------------\n");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("\n------Pattern 2-----------------\n");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}

		System.out.println("\n-------Pattern 3----------------\n");

		for (int i = 1, j = 9; i < 6 && j > 0; i++, j--) {
			for (int x = 1; x < 10; x++) {
				if (x <= i || x >= 10 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int i = 5, j = 5; i > 0 && j < 9; i--, j++) {
			for (int x = 1; x < 10; x++) {
				if (x < i || x > 10 - i) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println("\n--------Pattern 4----------------\n");

		int i = 5;
		int j = 5;
		int row = 1;
		int col = 1;
		boolean reversed = false;

		int counter = 10;
		while (row <= 9) {
			while (col <= 9) {
				if (col >= i && col <= j) {
					if ((row % 2 == 0 && col % 2 == 1) || (row % 2 == 1 && col % 2 == 0))
						System.out.print(" ");
					else
						System.out.print("*");
				} else {
					System.out.print(" ");
				}
				col++;
			}
			System.out.println();
			if (i == 1 && j == 9)
				reversed = true;

			row++;
			col = 1;

			if (!reversed) {
				i--;
				j++;
			} else {
				i++;
				j--;
			}
		}

		System.out.println("\n--------Pattern 5----------------\n");

		for (int rows = 1; rows < 10; rows++) {
			for (int cols = 1; cols < 10; cols++) {
				if ((cols == rows) || (cols == 10 - rows) || (cols == 1 || cols == 9 || rows == 1 || rows == 9)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println("\n--------Pattern 6----------------\n");

		for (int rows = 1; rows <= 10; rows++) {
			for (int cols = 1; cols < 20; cols++) {
				if (cols >= rows && cols <= 20 - rows) {
					if ((cols % 2 == 0 && rows % 2 == 1) || (cols % 2 == 1 && rows % 2 == 0))
						System.out.print(" ");
					else
						System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int rows = 10; rows >= 1; rows--) {
			for (int cols = 1; cols < 20; cols++) {
				if (cols >= rows && cols <= 20 - rows) {
					if ((cols % 2 == 0 && rows % 2 == 1) || (cols % 2 == 1 && rows % 2 == 0))
						System.out.print(" ");
					else
						System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		System.out.println("\n--------Pattern 7----------------\n");

		for (int rows = 1; rows <= 7; rows++) {
			if (rows == 2)
				continue;
			for (int cols = 1; cols < 40; cols++) {
				if ((cols > 7 - rows && cols < 13 + rows) || (cols > 27 - rows && cols < 33 + rows)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		for (int rows = 1; rows <= 20; rows++) {
			for (int cols = 1; cols < 40; cols++) {
				if (cols >= rows && cols <= 40 - rows) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}

			System.out.println();
		}
		
	}
}
