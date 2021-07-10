package by.javacource.algorithmization.sorting;

import java.util.*;

//Даны две последовательности a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm.
//Образовать из них новую последовательность чисел так,
//чтобы она тоже была неубывающей.
//Примичание. Дополнительный массив не использовать.

public class Task2 {

	public static void main(String[] args) {

		int n;
		int m;

		n = consoleInputNaturalNumber("Enter the size of first array >> ");
		m = consoleInputNaturalNumber("Enter the size of second array >> ");

		int[] arr1 = new int[n];
		int[] arr2 = new int[m];

		arrayFillingInt(arr1);
		arrayFillingInt(arr2);

		System.out.println("First array >>");
		printArrayI(arr1);
		System.out.println("Second array >>");
		printArrayI(arr2);

		arr1 = Arrays.copyOf(arr1, n + m);

		for (int i = n, g = 0; i < arr1.length; i++, g++) {

			arr1[i] = arr2[g];

			for (int j = i; j > 0; j--) {

				if (arr1[j] < arr1[j - 1]) {

					swap(arr1, j, j - 1);
				}
			}
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
