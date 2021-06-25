package by.java_online_cource.algorithmization.sorting;

import java.util.*;

//Сортировка выбором.
//Дана последовательность чисел a1 <= a2 <= ... <= an.
//Требуется переставить элементы так, чтобы они были расположены по убыванию.
//Для этого в массиве, начиная с первого, выбирается наибольший элемент
//и ставится на первое место, а первый - на место наибольшего.
//Затем, начиная со второго, эта процедура повторяется.
//Написать алгоритм сортировки выбором.

public class Task3 {

	public static void main(String[] args) {

		int n;
		n = consoleInputNaturalNumber("Enter the size of the array >> ");

		int[] arr = new int[n];

		arrayFillingInt(arr);
		printArrayI(arr);

		int maxIndex;

		for (int i = 0; i < arr.length; i++) {

			maxIndex = i;

			for (int j = i; j < arr.length; j++) {

				if (arr[i] < arr[j]) {
					maxIndex = j;
				}
			}

			swap(arr, maxIndex, i);

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

	public static void arrayFillingInt(int[] mas) {

		mas[0] = (int) (Math.random() * 20);

		for (int i = 1; i < mas.length; i++) {

			mas[i] = mas[i - 1] + (int) (Math.random() * 20);

		}
		return;
	}

	public static void printArrayI(int[] mas) {

		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + "\t");
		}

		System.out.println();
		System.out.println();

		return;
	}

	public static void swap(int[] mas, int x, int y) {

		int temp;
		temp = mas[x];
		mas[x] = mas[y];
		mas[y] = temp;

		return;
	}
}
