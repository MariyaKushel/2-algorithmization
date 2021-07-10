package by.javacource.algorithmization.sorting;

import java.util.*;

//Даны дроби p1/q1, p2/q2, ..., pn/qn (pi, qi - натуральные).
//Составить программу, которая приводит эти дроби к общему знаменателю
//и упорядочивает их в порядке возрастания.

public class Task8 {

	public static void main(String[] args) {

		int n;
		n = consoleInputNaturalNumber("Enter the size of the array >> ");

		int[] numerator = new int[n];
		int[] denominator = new int[n];

		arrayFillingIntNatural(numerator);
		arrayFillingIntNatural(denominator);

		printArrayI(numerator, denominator);

		// сортируем по знаменателю
		bubbleSort(numerator, denominator);

		int gcd = denominator[denominator.length - 1];

		for (int i = denominator.length - 2; i >= 0 && gcd != 1; i--) {
			gcd = gcd(denominator[i], gcd);

		}

		System.out.println("GCD (НОД) >> " + gcd);

		int lcm = 1;

		for (int i = 1; i < denominator.length; i++) {
			lcm = denominator[i - 1] * denominator[i];
		}

		lcm = lcm / gcd;

		System.out.println("LSM (НОК) >> " + lcm);

		for (int i = 0; i < denominator.length; i++) {
			numerator[i] = lcm / denominator[i] * numerator[i];
			denominator[i] = lcm;
		}

		// сортируем по числителю
		bubbleSort(denominator, numerator);

		printArrayI(numerator, denominator);
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

	public static void arrayFillingIntNatural(int[] mas) {

		for (int i = 0; i < mas.length; i++) {

			mas[i] = (int) (Math.random() * 100 + 1);

		}
		return;
	}

	public static void printArrayI(int[] mas1, int[] mas2) {

		for (int i = 0; i < mas1.length; i++) {

			System.out.print(mas1[i] + "/" + mas2[i] + "\t");
		}

		System.out.println();
		System.out.println();

		return;
	}

	// НОД
	public static int gcd(int x, int y) {

		int temp;

		while (y != 0) {

			if (x < y) {
				temp = x;
				x = y;
				y = temp;
			}

			temp = y;
			y = x % y;
			x = temp;
		}

		return x;
	}

	public static void bubbleSort(int[] mas1, int[] mas2) {

		boolean flag = true;

		while (flag) {

			flag = false;

			for (int i = 1; i < mas2.length; i++) {

				if (mas2[i] < mas2[i - 1]) {
					swap(mas2, i, i - 1);
					swap(mas1, i, i - 1);
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
