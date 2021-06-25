package by.java_online_cource.algorithmization.one_dimensional_array;

import java.util.*;

//В массиве целых чисел с количеством элементов n
//найти наиболее часто встречающие число.
//Если таких чисел несколько, то определить наименьшее из них.

public class Task9 {

	public static void main(String[] args) {

		int n;
		n = consoleInputNaturalNumber("Enter the size of array >> ");

		int[] arr = new int[n];
		
		arrayFillingInteger(arr);
		printArrayI(arr);

		int[] repetitions = new int[n]; // The repetition array

		for (int i = 0; i < repetitions.length; i++) {
			
			repetitions[i] = countRepetitions(arr, arr[i]);
		}
		
		//printArrayI(repetitions);

		int index = 0;

		for (int i = 1; i < arr.length; i++) {
			
			if (repetitions[i] > repetitions[index]) {
				index = i;

			} else if (repetitions[i] == repetitions[index]) {
				
				if (arr[i] < arr[index]) {
					index = i;
				}
			}
		}

		if (repetitions[index] == 1) {
			System.out.print("All elements are unique.");
		} else {
			System.out.print("The smallest of the most common elements is " + arr[index]);
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
			mas[i] = (int) (Math.random() * 20 - 10);
		}
		return;
	}

	public static int countRepetitions(int[] mas, int temp) {

		int count = 0;

		for (int i = 0; i < mas.length; i++) {
			
			if (mas[i] == temp) {
				count++;
			}
		}
		return count;
	}

	public static void printArrayI(int[] mas) {

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "\t");
		}

		System.out.println();
		return;
	}
}
