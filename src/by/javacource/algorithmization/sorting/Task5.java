package by.javacource.algorithmization.sorting;

import java.util.*;

//Сортировка вставками.
//Дана последовательность чисел a1, a2, ..., an.
//Требуется переставить числа в порядке возрастания. Делается это следующим образом.
//Пусть a1, a2, ..., ai - упорядоченная последовательность, т.е. a1 <= a2 <= ... <= ai.
//Берется следующие число ai+1 и вставляется в последовательность так,
//чтобы новая последовательность была тоже возрастающей. 
//Процесс производится до тех пор, пока все элементы от i+1 д n не будут перебраны.
//Примичание. Место помещения очередного элемента в отсортированную часть
//с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

public class Task5 {

	public static void main(String[] args) {

		int n;
		n = consoleInputNaturalNumber("Enter the size of the array >> ");

		int[] arr = new int[n];
		arrayFillingInt(arr);

		printArrayI(arr);

		for (int i = 1; i < arr.length; i++) {

			int ind;
			ind = binarySearch(arr, i - 1, arr[i]);

			for (int j = i; j > ind; j--) {

				swap(arr, j, j - 1);

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

	public static void arrayFillingInt(int[] mas) {

		for (int i = 0; i < mas.length; i++) {

			mas[i] = (int) (Math.random() * 200 - 100);

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

		if (mas[x] != mas[y]) {

			int temp;
			temp = mas[x];
			mas[x] = mas[y];
			mas[y] = temp;
		}
		return;
	}

	public static int binarySearch(int[] mas, int right, int x) {

		int left = 0;
		int middle = (left + right) / 2;

		if (x <= mas[left]) {

			return left;
		}

		if (x >= mas[right]) {

			return right + 1;
		}

		do {

			if (x == mas[middle]) {

				return middle;
			}

			if (x < mas[middle]) {

				right = middle;
			} else {

				left = middle;
			}

			middle = (left + right) / 2;

		} while (middle != left);

		return right;
	}
}
