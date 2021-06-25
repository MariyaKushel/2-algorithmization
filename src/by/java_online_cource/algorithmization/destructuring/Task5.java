package by.java_online_cource.algorithmization.destructuring;

import java.lang.*;
import java.util.*;

//Составить программу, которая в массиве A[N]
//находит второе по величине число (вывести на печать число,
//которое меньше максимального элемента массива,
//но больше всех других элементов).

public class Task5 {

	public static void main(String[] args) {

		int n;
		n = validationOfInput("Enter the size of the array >> ");

		if (n <= 1) {

			System.out.println("The array is too small. There isn`t 2-nd largest number in it.");
		} else {

			int[] arr = new int[n];
			arrayFillingInteger(arr);

			bubbleSort(arr);
			printArray(arr);

			System.out.println("The desirable number >> " + arr[1]);
		}
	}

	public static int validationOfInput(String str) {

		Scanner scan = new Scanner(System.in);

		int number = -1;
		while (number < 0) {
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

	public static void printArray(int[] mas) {

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "\t");
		}

		System.out.println();

		return;
	}

	public static void bubbleSort(int[] mas) {

		boolean flag = true;

		while (flag) {

			flag = false;

			for (int i = 1; i < mas.length; i++) {

				if (mas[i] > mas[i - 1]) {
					swap(mas, i, i - 1);
					flag = true;
				}
			}
		}

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
