package by.java_online_cource.algorithmization.sorting;

import java.util.*;

//Заданы два одномерных массива с различным количеством элементов
//и натуральное число k. Обьеденить их в один массив,
//включив второй массив между k-м и (k+1)-м элементами первого,
//при этом не используя дополнительный массив.

public class Task1 {

	public static void main(String[] args) {

		int n;
		int m;
		int k;

		n = consoleInputNaturalNumber("Enter the size of first array >> ");

		m = n;
		while (m == n) {
			m = consoleInputNaturalNumber("Enter the size of second array >> ");
		}

		k = n;
		while (k > n - 1) {
			k = consoleInputNaturalNumber("Enter natural number k >> ");
		}

		int[] arr1 = new int[n];
		int[] arr2 = new int[m];
		
		arrayFillingInt(arr1);
		arrayFillingInt(arr2);
		
		System.out.println("First array >>");
		printArrayI(arr1);
		System.out.println("Second array >>");
		printArrayI(arr2);

		arr1 = Arrays.copyOf(arr1, n + m);

		for (int i = k, j = 0; i < m + k; i++, j++) {

			if (i < arr1.length - arr2.length) {
				arr1[i + m] = arr1[i];
			}

			arr1[i] = arr2[j];

		}

		System.out.println("Result >>");
		printArrayI(arr1);
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
			mas[i] = (int) (Math.random() * 20 - 10);
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
