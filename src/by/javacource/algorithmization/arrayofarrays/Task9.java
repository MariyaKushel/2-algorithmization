package by.javacource.algorithmization.arrayofarrays;

import java.util.Scanner;

//Задана матрица неотрицательных чисел.
//Посчитать сумму элементов в каждом столбце.
//Определить, какой столбец содержит максимальную сумму.

public class Task9 {

	public static void main(String[] args) {

		int k;
		k = consoleInputNaturalNumber("Enter the number of rows in the array >> ");

		int p;
		p = consoleInputNaturalNumber("Enter enter the number of columns in the array >> ");

		int arr[][] = new int[k][p];

		arrayFillingPositiveInteger(arr);

		printMatrixI(arr);

		int arrayOfSum[] = new int[p];

		for (int j = 0; j < p; j++) {
			for (int i = 0; i < k; i++) {
				arrayOfSum[j] = arrayOfSum[j] + arr[i][j];
			}
		}

		printArrayI(arrayOfSum);

		int maxIndex = 0;

		for (int i = 1; i < arrayOfSum.length; i++) {
			
			if (arrayOfSum[maxIndex] < arrayOfSum[i]) {
				maxIndex = i;
			}
		}

		System.out.println("The largest sum is " + arrayOfSum[maxIndex]);

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

	public static void arrayFillingPositiveInteger(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = (int) (Math.random() * 10);
			}
		}
	}

	public static void printMatrixI(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				System.out.print(mas[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println();
	}

	public static void printArrayI(int[] mas) {

		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + "\t");
		}

		System.out.println();
	}

}
