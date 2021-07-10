package by.javacource.algorithmization.onedimensionalarray;

import java.util.*;

//Дан массив действительных чисел, размерность которого N.
//Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.

public class Task3 {

	public static void main(String[] args) {

		int n;

		n = consoleInputNaturalNumber("Enter the size of array >> ");

		double[] arr = new double[n];

		arrayFillingRealNumber(arr);

		printArrayD(arr);

		int countZero = 0;
		int countPositive = 0;
		int countNegative = 0;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > 0) {
				countPositive++;
			} else if (arr[i] == 0) {
				countZero++;
			} else {
				countNegative++;
			}
		}

		System.out.println("Elements > 0 -> " + countPositive);
		System.out.println("Elements = 0 -> " + countZero);
		System.out.println("Elements < 0 -> " + countNegative);

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

	public static void arrayFillingRealNumber(double[] mas) {

		for (int i = 0; i < mas.length; i++) {
			mas[i] = Math.random() * 2000.0 - 1000;
		}
		return;
	}

	public static void printArrayD(double[] mas) {

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "\t");
		}

		System.out.println();
		return;
	}
}
