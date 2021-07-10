package by.javacource.algorithmization.arrayofarrays;

import java.util.Scanner;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

public class Task3 {

	public static void main(String[] args) {

		int row;
		row = consoleInputNaturalNumber("Enter the number of rows in the matrix >> ");

		int column;
		column = consoleInputNaturalNumber("Enter enter the number of columns in the matrix >> ");

		int arr[][] = new int[row][column];

		arrayFillingInteger(arr);

		printArrayI(arr);

		int k;
		k = consoleInputIndex(row, "Which row (k) to output >> ");

		System.out.println("The row k >>");

		for (int j = 0; j < arr[k].length; j++) {
			System.out.print(arr[k][j] + "\t");
		}
		System.out.println();

		int p;
		p = consoleInputIndex(column, "Which column (p) to output >> ");

		System.out.println("The column p >>");

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i][p]);
		}
		System.out.println();

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

	public static int consoleInputIndex(int x, String str) {

		Scanner scan = new Scanner(System.in);

		int number = 0;
		while (number <= 0 || number > x) {
			System.out.print(str);
			while (!scan.hasNextInt()) {
				scan.next();
				System.out.print(str);
			}
			number = scan.nextInt();
		}

		number = number - 1;

		return number;
	}

}
