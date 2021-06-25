package by.java_online_cource.algorithmization.array_of_arrays;

import java.util.Scanner;

//Отсортировать строки матрицы по возрастанию
//и убыванию значений элементов.

public class Task12 {

	public static void main(String[] args) {

		int k;
		k = consoleInputNaturalNumber("Enter the number of rows in the array >> ");

		int p;
		p = consoleInputNaturalNumber("Enter enter the number of columns in the array >> ");

		int arr[][] = new int[k][p];
		arrayFillingInteger(arr);

		printArrayI(arr);

		System.out.println("Sort ascending >>");

		for (int i = 0; i < arr.length; i++) {

			boolean flag = false;

			while (!flag) {
				flag = true;

				for (int j = 1; j < arr[i].length; j++) {

					if (arr[i][j - 1] > arr[i][j]) {
						swap(arr, i, j - 1, j);
						flag = false;
					}
				}
			}
		}

		printArrayI(arr);

		System.out.println("Sort descending >>");

		for (int i = 0; i < arr.length; i++) {

			boolean flag = false;

			while (!flag) {
				flag = true;

				for (int j = 1; j < arr[i].length; j++) {

					if (arr[i][j - 1] < arr[i][j]) {
						swap(arr, i, j - 1, j);
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

		temp = mas[f][m];
		mas[f][m] = mas[f][n];
		mas[f][n] = temp;
	}

}
