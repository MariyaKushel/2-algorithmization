package by.javacource.algorithmization.destructuring;

import java.util.*;

//Дано натуральное число N. Написать метод (методы) для формирование массива,
//элементами которого являются цифры числа N.

public class Task10 {

	public static void main(String[] args) {

		int n;
		n = validationOfInput("Enter n >> ");

		int size;
		size = size(n);

		int[] arr = new int[size];
		arrayFilling(arr, n);

		printArray(arr);

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

	public static int size(int x) {

		int temp = x;
		int counter = 0;

		while (temp > 0) {
			temp = temp / 10;
			counter = counter + 1;
		}

		return counter;
	}

	public static void arrayFilling(int[] mas, int x) {

		for (int i = mas.length - 1; i >= 0; i--) {
			mas[i] = x % 10;
			x = x / 10;
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
}
