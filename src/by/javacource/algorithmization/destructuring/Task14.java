package by.javacource.algorithmization.destructuring;

import java.util.*;
import java.math.*;

//Натуральное число, в записи которого n цифр, называется числом Амстронга,
//если сумма его цифр, возведенная в степень n, равна самому числу.
//Найти все числа Армстронга от 1 до k.
//Для решения задачи использовать декомпозицию.

public class Task14 {

	public static void main(String[] args) {

		int k;

		k = validationOfInput("Enter k (k > 1) >> ");

		for (int i = 1; i < k; i++) {

			if (armstrongNumber(i)) {
				System.out.println(i);
			}
		}

	}

	public static int validationOfInput(String str) {

		Scanner scan = new Scanner(System.in);

		int number = 0;
		while (number <= 1 || number > 1073741824) {
			System.out.print(str);
			while (!scan.hasNextInt()) {
				scan.next();
				System.out.print(str);
			}
			number = scan.nextInt();
		}
		return number;
	}

	public static int power(int x) {

		int power = 0;

		for (int i = x; i > 0; i = i / 10) {

			power++;
		}

		return power;
	}

	public static boolean armstrongNumber(int number) {

		boolean flag = false;

		int pow;
		pow = power(number);

		int sum = 0;

		for (int i = number; i > 0; i = i / 10) {

			sum = (int) (sum + Math.pow(i % 10, pow));
		}

		if (sum == number) {

			flag = true;
		}

		return flag;
	}
}
