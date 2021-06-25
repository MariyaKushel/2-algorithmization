package by.java_online_cource.algorithmization.sorting;

import java.util.*;

//Сортировка обменами.
//Дана последовательность чисел a1 <= a2 <= ... <= an.
//Требуется переставить числа в порядке возрастания.
//Для этого сравниваются два соседних числа ai и ai+1.
//Если ai > ai+1, то делается перестановка.
//Так продолжается до тех пор, пока все элементы не станут
//расположены в порядке возрастания. 
//Составить алгоритм сортировки, подсчитывая при этом количество перестановок.

//Мой комментарий. Если считать что дана последовательность a1 <= a2 <= ... <= an
//то она уже отсортирована в порядке возрастания и не будет ни одной перестановки.
//В своем решении отображу так же сортировку последовательности a1 >= a2 >= ... >= an

public class Task4 {

	public static void main(String[] args) {

		int n;
		n = consoleInputNaturalNumber("Enter the size of the array >> ");

		int[] arr = new int[n];

		// Для последовательности a1 <= a2 <= ... <= an
		// arrayFillingIntRise(arr);
		// printArrayI(arr);

		// Для последовательности a1 >= a2 >= ... >= an
		arrayFillingIntDecrease(arr);
		printArrayI(arr);

		boolean flag = true;
		int count = 0;

		while (flag) {

			flag = false;

			for (int i = 1; i < arr.length; i++) {

				if (arr[i] < arr[i - 1]) {

					swap(arr, i, i - 1);
					count++;
					flag = true;
				}
			}
		}

		printArrayI(arr);
		System.out.println("Number of replacements is " + count);

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

	// a1 <= a2 <= ... <= an
	public static void arrayFillingIntRise(int[] mas) {

		mas[0] = (int) (Math.random() * 20);

		for (int i = 1; i < mas.length; i++) {

			mas[i] = mas[i - 1] + (int) (Math.random() * 20);

		}

		return;
	}

	// a1 >= a2 >= ... >= an
	public static void arrayFillingIntDecrease(int[] mas) {

		mas[0] = (int) (Math.random() * 20);

		for (int i = 1; i < mas.length; i++) {

			mas[i] = mas[i - 1] - (int) (Math.random() * 20);

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
