package by.javacource.algorithmization.array;

import java.util.*;

//Дана последовательность целых чисел a1, a2, ..., an.
//Образовать новую последовательность, выбросив из исходной те члены,
//которые равны min(a1, a2, ... , an).

public class Task8 {

	public static void main(String[] args) {

		int n;
		n = consoleInputNaturalNumber("Enter the size of array >> ");

		int[] arr = new int[n];
		arrayFillingInteger(arr);

		printArrayI(arr);

		// Находим самый маленький элемент в массиве
		int minElement = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (minElement > arr[i]) {
				minElement = arr[i];
			}
		}

		// Находим сколько таких самых маленьких элементов в массиве
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (minElement == arr[i]) {
				count++;
			}
		}

		int[] mas = new int[n - count];

		if (n > 1) {

			for (int i = 0, j = 0; i < arr.length; i++) {

				if (arr[i] != minElement) {
					
					mas[j] = arr[i];
					
					j++;
				}
			}

			printArrayI(mas);

		} else {

			System.out.println("The new array can`t be formed.");
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

	public static void arrayFillingInteger(int[] mas) {

		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 2000 - 1000);
		}
		return;
	}

	public static void printArrayI(int[] mas) {

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "\t");
		}

		System.out.println();
		return;
	}
}
