package by.java_online_cource.algorithmization.destructuring;

import java.util.Scanner;

//Написать метод (методы) для нахождения наибольшего общего делителя
//четырех натуральных чисел.

public class Task2 {

	public static void main(String[] args) {

		int size = 4;

		int[] arr = new int[size];
		arrayFillingNaturalNumber(arr);
		//int [] arr = {56, 16 , 80, 8};
		
		printArrayI(arr);
		
		bubbleSort(arr);
		
		int gcd = arr[arr.length - 1];

		for (int i = arr.length - 2; i >= 0; i--) {

			gcd = gcd(arr[i], gcd);
		}

		System.out.println("The greatest common divisor (НОД) is " + gcd);
	}

	public static void arrayFillingNaturalNumber(int[] mas) {

		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 100) + 1;
		}
		return;
	}

	public static void bubbleSort(int[] mas) {

		boolean flag = true;

		while (flag) {

			flag = false;

			for (int i = 1; i < mas.length; i++) {

				if (mas[i] < mas[i - 1]) {
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
	
	public static void printArrayI(int[] mas) {

		for (int i = 0; i < mas.length; i++) {

			System.out.print(mas[i] + "\t");
		}

		System.out.println();
		System.out.println();

		return;
	}
}
