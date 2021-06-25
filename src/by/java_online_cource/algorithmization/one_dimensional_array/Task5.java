package by.java_online_cource.algorithmization.one_dimensional_array;

import java.util.*;
import java.math.*;

//Даны целые числа a1, a2, ..., an.
//Вывести на печать только те числа, для которых ai > i.

public class Task5 {

	public static void main(String[] args) {

		int n;

		n = consoleInputNaturalNumber("Enter the size of array >> ");

		int[] arr = new int[n];

		arrayFillingInteger(arr);
		printArrayI(arr);

		System.out.println ("ai > i : ");
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] > i) {
				System.out.print(arr[i] + "\t");
			}
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

	public static void arrayFillingInteger(int[] mas) {

		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 2000 - 1000);
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
