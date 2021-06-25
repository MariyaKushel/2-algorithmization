package by.java_online_cource.algorithmization.sorting;

import java.util.*;
import java.math.*;

//Сортировка Шелла.
//Дан массив n действительных элементов. Требуется упорядочить его по возрастанию.
//Делается это следующим образом: сравниваются два соседних элементв ai и ai+1.
//Если ai <= ai+1, то продвигаются на один элемент вперед. Если ai > ai+1, 
//то производится перестановка и сдвигаются на один элемент назад.
//Составить алгорит этой сортировки.

public class Task6 {

	public static void main(String[] args) {

		int n;
		n = consoleInputNaturalNumber("Enter the size of the array >> ");

		double[] arr = new double[n];

		arrayFillingDouble(arr);
		printArrayD(arr);

		int g = n / 2;

		while (g > 0) {

			for (int i = g; i < arr.length; i++) {

				for (int j = i - g; j >= 0; j = j - g) {

					if (arr[j] > arr[j + g]) {
						swap(arr, j, j + g);
						//printArrayD(arr);
					}
				}

			}

			g = g / 2;
		}

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

	public static void arrayFillingDouble(double[] mas) {

		for (int i = 0; i < mas.length; i++) {

			mas[i] = Math.round(Math.random() * 20 - 10);

		}
		return;
	}

	public static void printArrayD(double[] mas) {

		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + "\t");
		}

		System.out.println();
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
