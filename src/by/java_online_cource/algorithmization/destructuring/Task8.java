package by.java_online_cource.algorithmization.destructuring;

import java.util.*;

//Задан массив D. Определить следующие суммы:
//D[1]+D[2]+D[3]; D[3]+D[4]+D[5]; D[4]+D[5]+D[6].
//Пояснение. Составить метод (матоды) для вычисления суммы
//трех последовательно расположенных элементов массива
//с номерами от k до m.

public class Task8 {

	public static void main(String[] args) {

		int n;
		int k;

		n = consoleInputNaturalNumber("Enter the size of the array >> ");
		k = n;

		while (k > n - 2) {
			k = consoleInputNaturalNumber("Enter the number of element (k) to start summing up >> ");
			k = k - 1;
		}

		int[] arr = new int[n];
		arrayFillingInteger(arr);
		printArray(arr);

		int sum;

		sum = sumOfElements(arr, k);

		System.out.println("The sum of the elements from " + (k + 1) + " to " + (k + 3) + " is " + sum);

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
			mas[i] = (int) (Math.random() * 200 - 100);
		}
		return;
	}

	public static void printArray(int[] mas) {

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "\t");
		}

		System.out.println();

		return;
	}

	public static int sumOfElements(int[] mas, int x) {

		int result = 0;

		for (int i = x; i < x + 3; i++) {
			result = result + mas[i];
		}

		return result;
	}
}
