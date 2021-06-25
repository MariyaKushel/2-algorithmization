package by.java_online_cource.algorithmization.one_dimensional_array;

import java.util.*;

//Дана последовательность действительных чисел a1, a2, ..., an.
//Заменить все ее члены больше данного Z, этим числом.
//Посчитать количество замен.

public class Task2 {

	public static void main(String[] args) {

		int n;
		int z;

		n = consoleInputNaturalNumber("Enter the size of array >> ");
		z = consoleInputInteger("Enter z >> ");

		double[] arr = new double[n];

		arrayFillingRealNumber(arr);
		printArrayD(arr);

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > z) {
				arr[i] = z;
				count = count + 1;
			}
		}

		printArrayD(arr);

		System.out.println("Made replacements " + count);
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

	public static int consoleInputInteger(String str) {

		Scanner scan = new Scanner(System.in);

		int number;

		System.out.print(str);
		while (!scan.hasNextInt()) {
			scan.next();
			System.out.print(str);
		}
		number = scan.nextInt();

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
