package by.java_online_cource.algorithmization.array_of_arrays;

import java.util.Scanner;

//Дана квадратная матрица.
//Вывести на экран элементы, стоящие на диаганали.

public class Task2 {

	public static void main(String[] args) {

		int k;
		k = consoleInputNaturalNumber("Enter the size of the matrix >> ");

		int arr[][] = new int[k][k];
		arrayFillingInteger(arr);

		printArrayI(arr);

		System.out.println("First diagonal >>");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i][i] + "\t");
		}

		System.out.println();
		System.out.println("Second diagonal >>");

		for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {

			System.out.print(arr[i][j] + "\t");
		}

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
}
