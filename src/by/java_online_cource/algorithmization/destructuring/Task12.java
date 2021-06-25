package by.java_online_cource.algorithmization.destructuring;

import java.util.*;

//Даны натуральные числа K и N. Написать матод (методы)
//формирования массива A, элементами которого являются числа,
//сумма которых равна K и не больше N.

public class Task12 {

	public static void main(String[] args) {

		int k;
		int n;

		k = validationOfInput("Enter k >> ");
		n = validationOfInput("Enter n >> ");

		int[] arr = new int[0];

		int sum;

		for (int i = 1, j = 0; i <= n; i++) {

			sum = sum(i);

			if (sum == k) {
				arr = Arrays.copyOf(arr, arr.length + 1);
				arr[j] = i;
				j++;
			}

		}

		if (arr.length > 0) {
			printArrayI(arr);
		} else {
			System.out.println("The such numbers didn`t found.");
		}

	}

	public static int validationOfInput(String str) {

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

	public static int sum(int x) {

		int sum = 0;
		for (int i = x; i > 0; i = i / 10) {
			sum = sum + i % 10;
		}
		return sum;
	}

	public static void printArrayI(int[] mas) {

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "\t");
		}

		System.out.println();
		return;
	}
}
