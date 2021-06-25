package by.java_online_cource.algorithmization.array_of_arrays;

import java.util.Scanner;

//Сформировать квадратную матрицу порядка N по правилу:
//A[I,J] = sin ((I*I - J*J) / N)
//и посчитать количество положительных элементов в ней.

public class Task7 {

	public static void main(String[] args) {

		int n;
		n = consoleInputNaturalNumber("Enter the size of the matrix >> ");

		double arr[][] = new double[n][n];
		
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				arr[i][j] = Math.sin((i * i - j * j) / n);

				if (arr[i][j] > 0) {
					count++;
				}
			}
		}

		//printArrayD(arr);

		System.out.println("There are " + count + " positive elements in the array.");
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

	public static void printArrayD(double[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				System.out.print(mas[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println();
	}
}
