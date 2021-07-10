package by.javacource.algorithmization.sorting;

import java.util.*;

//Даны две неуюывающие последовательности действительных чисел 
//a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm.
//Требуется указать те места, на которые нужно вставлять элементы
//последовательности b1 <= b2 <= ... <= bm  в первую последовательность так,
//чтобы новая последовательность оставалась возрастающей.

public class Task7 {

	public static void main(String[] args) {

		int n;
		int m;

		n = consoleInputNaturalNumber("Enter the size of first array >> ");
		m = consoleInputNaturalNumber("Enter the size of second array >> ");

		int[] arr1 = new int[n];
		int[] arr2 = new int[m];

		arrayFillingInt(arr1);
		arrayFillingInt(arr2);

		// int[] arr1 = { 2, 4, 12 };
		// int[] arr2 = { 0, 3, 9, 20, 39 };

		printArrayI(arr1);
		printArrayI(arr2);

		System.out.println("Tne element(s) of second array" + "\t\t" + "Tne element of first array");

		int i = 0;
		int j = 0;

		for (; i < arr1.length; i++) {

			boolean flag = true;

			while (j < arr2.length && arr2[j] < arr1[i]) {

				flag = false;
				System.out.print(j + ", ");
				j++;
			}

			if (!flag && i == 0) {
				System.out.println("\t\t\t\t\t" + "before " + i);
			}

			if (!flag && i != 0) {
				System.out.println("\t\t\t\t\t" + "between " + (i - 1) + " and " + i);
			}
		}

		boolean flag = true;
		
		while (j < arr2.length) {
			flag = false;
			System.out.print(j + ", ");
			j++;
		}
		if (!flag) {
			System.out.println("\t\t\t\t\t" + "after " + (i - 1));
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

}
