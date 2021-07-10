package by.javacource.algorithmization.onedimensionalarray;

import java.util.*;

//Даны действительные числа a1, a2, ..., an.
//Поменять местами наибольший и наименьший элементы.

public class Task4 {

	public static void main(String[] args) {

		int n;

		n = consoleInputNaturalNumber("Enter the size of array >> ");

		double[] arr = new double[n];

		arrayFillingRealNumber(arr);

		System.out.println("Before swap >> ");
		printArrayD(arr);

		int maxIndex = 0;
		int minIndex = 0;

		for (int i = 1; i < arr.length; i++) {
			
			if (arr[i] > arr[maxIndex]) {
				maxIndex = i;
			}
			if (arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}

		swap(arr, maxIndex, minIndex);

		System.out.println("After swap >> ");
		printArrayD(arr);

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

	public static void swap(double[] mas, int x, int y) {

		double temp;

		temp = mas[x];
		mas[x] = mas[y];
		mas[y] = temp;

		return;
	}
}
