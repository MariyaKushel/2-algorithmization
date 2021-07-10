package by.javacource.algorithmization.destructuring;

import java.util.*;
import java.math.*;

//Найти все натуральные n - значные числа, цыфры в которых
//образуют сторого возрастающую последовательность (например 1234, 5789).
//Для решения задачи использовать декомпозицию.

//Мой комментарий.
//Задача решена для случая когда цифры числа образуют
//строго возрастающую последовательность с шагом 1.

public class Task15 {

	public static void main(String[] args) {

		int n;
		n = validationOfInput("Enter the size of the number >> ");

		if (n < 10) {

			numberSearch(n);

		} else {

			System.out.println("There aren`t such numbers.");
		}
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

	public static void numberSearch(int size) {

		for (int i = 1; i <= 10 - size; i++) {

			int num = 0;

			for (int power = size - 1, digit = i; power >= 0; power--, digit++) {
				num = num + digit * (int) (Math.pow(10, power));
			}

			System.out.print(num + "\t");
		}
	}
}
