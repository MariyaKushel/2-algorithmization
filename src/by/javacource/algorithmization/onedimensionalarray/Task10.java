package by.javacource.algorithmization.onedimensionalarray;

import java.util.*;

//Дан целочисленный массив с количеством элементов n.
//Сжать массив, выбросив из него каждый второй элемент
//(освободившиеся элементы заполнить нулями).
//Примичания. Дополнительный массив не использовать.

public class Task10 {

	public static void main(String[] args) {

		int n;
		n = consoleInputNaturalNumber("Enter the size of array >> ");

		int[] arr = new int[n];

		arrayFillingInteger(arr);
		printArrayI(arr);

		for (int i = 1; i < arr.length; i++) {

			if (i % 2 == 0) {
				arr[i / 2] = arr[i];
				arr[i] = 0;
			} else {
				arr[i] = 0;
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

	public static void arrayFillingInteger(int[] mas) {

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
