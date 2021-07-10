package by.javacource.algorithmization.destructuring;

import java.util.*;

//Написать метод (методы), проверяющий,
//являются ли данные три числа взаимно простыми.

public class Task6 {

	public static void main(String[] args) {

		int[] arr = new int[3];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = validationOfInput("Enter number ", i + 1, " >> ");
		}

		bubbleSort(arr);

		int gcd;
		gcd = gcd(arr[0], gcd(arr[1], arr[2]));

		if (gcd == 1) {
			System.out.print("The numbers are coprime.");
		} else {
			System.out.print("The numbers aren`t coprime.");
		}

	}

	public static int validationOfInput(String str1, int j, String str2) {

		Scanner scan = new Scanner(System.in);

		int number = 0;
		while (number == 0) {
			System.out.print(str1 + j + str2);
			while (!scan.hasNextInt()) {
				scan.next();
				System.out.print(str1 + j + str2);
			}
			number = scan.nextInt();
		}

		if (number < 0) {
			number = (-1) * number;
		}

		return number;
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

	//НОД
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
}
