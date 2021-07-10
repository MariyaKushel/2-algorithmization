package by.javacource.algorithmization.arrayofarrays;

import java.util.Scanner;

//Сформировать квадратную матрицу порядка n по заданному образцу (n - четное):
// | 1   1   1   ...   1   1   1 |
// | 0   1   1   ...   1   1   0 |
// | 0   0   1   ...   1   0   0 |
// | .   .   .   .     .   .   . |
// | .   .   .    .    .   .   . |
// | .   .   .     .   .   .   . |
// | 0   1   1   ...   1   1   0 |
// | 1   1   1   ...   1   1   1 |

public class Task6 {

	public static void main(String[] args) {

		int n;
		n = consoleInputEvenNaturalNumber("Enter the size (even number) of the matrix >> ");

		int arr[][] = new int[n][n];

		for (int i = 0; i < arr.length / 2; i++) {

			int p = arr.length - 1 - i;

			for (int j = i; j < arr[i].length / 2; j++) {

				int m = arr.length - 1 - j;

				arr[i][m] = 1; // 1 quarter
				arr[i][j] = 1; // 2 quarter
				arr[p][j] = 1; // 3 quarter
				arr[p][m] = 1; // 4 quarter

			}
		}

		printArrayI(arr);
	}

	public static int consoleInputEvenNaturalNumber(String str) {

		Scanner scan = new Scanner(System.in);

		int number = -1;
		while (number <= 0 || number % 2 != 0) {
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
