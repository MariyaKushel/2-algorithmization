package by.javacource.algorithmization.arrayofarrays;

import java.util.Scanner;

//В числовой матрице поменять местами два столбца любых столбца,
//т.е. все элементы одного столбца поставить на соответствующие им позиции другого,
//а его элементы второго переместить в первый.
//Номера столбцов вводит пользователь с клавиатуры.

public class Task8 {

	public static void main(String[] args) {

		int k;
		k = consoleInputNaturalNumber("Enter the number of rows in the matrix >> ");

		int p;
		p = consoleInputNaturalNumber("Enter enter the number of columns in the matrix >> ");

		int arr[][] = new int[k][p];

		arrayFillingInteger(arr);

		printArrayI(arr);

		int firstColumn;
		firstColumn = consoleInputIndex(p, "Enter first column to swap >> ");

		int secondColumn;
		secondColumn = consoleInputIndex(p, "Enter second column to swap >> ");

		for (int i = 0; i < arr.length; i++) {
			
			int temp;
			temp = arr[i][firstColumn];
			arr[i][firstColumn] = arr[i][secondColumn];
			arr[i][secondColumn] = temp;
		}

		System.out.println("Answer >>");
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
