package by.javacource.algorithmization.arrayofarrays;

import java.util.Scanner;

//Найти положительные элементы главной диаганали квадратной матрицы.

public class Task10 {

	public static void main(String[] args) {

		int n;
		n = consoleInputNaturalNumber("Enter the size of the matrix >> ");

		int arr[][] = new int[n][n];
		arrayFillingInteger(arr);

		printArrayI(arr);

		boolean flag = false;

		System.out.println("Answer >> ");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i][i] > 0) {
				System.out.print(arr[i][i] + "\t");
				flag = true;
			}
		}

		if (!flag) {
			System.out.println("There aren`t positive elements in the main diagonal matrix.");
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
