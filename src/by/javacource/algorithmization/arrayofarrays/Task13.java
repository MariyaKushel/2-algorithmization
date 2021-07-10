package by.javacource.algorithmization.arrayofarrays;

import java.util.Scanner;

//Отсортировать столбцы матрицы по возрастанию
//и убыванию значений элементов.

public class Task13 {

	public static void main(String[] args) {

		int k;
		k = consoleInputNaturalNumber("Enter the number of rows in the array >> ");

		int p;
		p = consoleInputNaturalNumber("Enter enter the number of columns in the array >> ");

		int arr[][] = new int[k][p];
		arrayFillingInteger(arr);

		printArrayI(arr);

		System.out.println("Sort ascending >>");

		for (int j = 0; j < p; j++) {

			boolean flag = false;

			while (!flag) {
				flag = true;

				for (int i = 1; i < arr.length; i++) {

					if (arr[i - 1][j] > arr[i][j]) {
						swap(arr, j, i - 1, i);
						flag = false;
					}
				}
			}
		}

		printArrayI(arr);

		System.out.println("Sort descending >>");

		for (int j = 0; j < p; j++) {

			boolean flag = false;

			while (!flag) {
				flag = true;

				for (int i = 1; i < arr.length; i++) {

					if (arr[i - 1][j] < arr[i][j]) {
						swap(arr, j, i - 1, i);
						flag = false;
					}
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

	public static void arrayFillingInteger(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = (int) (Math.random() * 20 - 10);
			}
		}
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

	public static void swap(int[][] mas, int f, int m, int n) {

		int temp;

		temp = mas[m][f];
		mas[m][f] = mas[n][f];
		mas[n][f] = temp;
	}

}
