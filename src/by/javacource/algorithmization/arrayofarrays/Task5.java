package by.javacource.algorithmization.arrayofarrays;

import java.util.Scanner;

//Сформировать квадратную матрицу порядка n по заданному образцу (n - четное):
// | 1   1   1   ...   1   1   1 |
// | 2   2   2   ...   2   2   0 |
// | 3   3   3   ...   3   0   0 |
// | .   .   .   .     .   .   . |
// | .   .   .    .    .   .   . |
// | .   .   .     .   .   .   . |
// |n-1	n-1	 0   ...   0   0   0 |
// | n	 0	 0   ...   0   0   0 |

public class Task5 {

	public static void main(String[] args) {

		int k;
		k = consoleInputEvenNaturalNumber("Enter the size (even number) of the matrix >> ");

		int arr[][] = new int[k][k];

		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {

				if (j >= arr[i].length - i) {
					arr[i][j] = 0;
				} else {
					arr[i][j] = i + 1;
				}
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
