package by.javacource.algorithmization.arrayofarrays;

import java.util.Scanner;

//Найдите наибольший элемент матрицы 
//и заменить все нечетные элементы на него.

public class Task15 {

	public static void main(String[] args) {

		int m;
		m = consoleInputNaturalNumber("Enter the number of rows in the array >> ");

		int n;
		n = consoleInputNaturalNumber("Enter enter the number of columns in the array >> ");

		int arr[][] = new int[m][n];

		arrayFillingInteger(arr);

		printArrayI(arr);

		// Ищем наибольший элемент в массиве
		int maxElement = arr[0][0];

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (maxElement < arr[i][j]) {
					maxElement = arr[i][j];
				}
			}
		}

		System.out.println("The max element of array is " + maxElement);

		// Меняем нечетные элементы на наибольший
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] % 2 != 0) {
					arr[i][j] = maxElement;
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
}
