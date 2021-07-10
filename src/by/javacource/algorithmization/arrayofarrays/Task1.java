package by.javacource.algorithmization.arrayofarrays;

import java.util.Scanner;

//Дана матрица. Вывести на экран все нечетные столбцы,
//у которых первый элемент больше последнего.

public class Task1 {

	public static void main(String[] args) {

		int k;
		k = consoleInputNaturalNumber("Enter the number of rows in the matrix >> ");

		int p;
		p = consoleInputNaturalNumber("Enter enter the number of columns in the matrix >> ");

		int arr[][] = new int[k][p];

		arrayFillingInteger(arr);

		printArrayI(arr);

		System.out.println("Answer >>");

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[0].length; j = j + 2) {

				if (arr[0][j] > arr[arr.length - 1][j]) {

					System.out.print(arr[i][j] + "\t");
				}
			}
			System.out.println();
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
