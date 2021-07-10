package by.javacource.algorithmization.arrayofarrays;

import java.util.Scanner;

//Сформировать случайную матрицу m x n, состроящую из нулей и единиц,
//причем в каждом столбце число единиц равно номеру столбца.

public class Task14 {

	public static void main(String[] args) {

		int m;
		m = consoleInputNaturalNumber("Enter the number of rows in the array >> ");

		int n = m + 1;

		// Дополнительная проверка m должно быть >= n.
		// Иначе, если например m = 3, n = 5,
		// не получиться заполнить нужное количеством единиц в 4 и 5 столбце.

		while (n > m) {
			n = consoleInputNaturalNumber("Enter enter the number of columns in the array >> ");
			if (n > m) {
				System.out.println("Try agan. The number of columns must be equals or less than the number of row.");
			}
		}

		int arr[][] = new int[m][n];

		for (int j = 0; j < n; j++) {

			int temp = j + 1;// Number of "1" in the row
			int i;

			while (temp > 0) {

				i = (int) (Math.random() * m);

				if (arr[i][j] == 0) {
					arr[i][j] = 1;

					temp--;
				}
			}
		}
		
		printArrayI(arr);
	}

	public static int consoleInputNaturalNumber(String str) {

		Scanner scan = new Scanner(System.in);

		int number = 0;
		while (number <= 0) {
			System.out.print(str);
			while (!scan.hasNextInt()) {
				scan.next();
				System.out.print(str);
			}
			number = scan.nextInt();
		}
		return number;
	}

	public static void printArrayI(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				System.out.print(mas[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
}
