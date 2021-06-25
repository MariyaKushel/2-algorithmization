package by.java_online_cource.algorithmization.destructuring;

import java.util.*;
import java.math.*;

//Написать программу, определяющую сумму n - значных чисел, 
//содержащих только нечетные цифры.Определить также, 
//сколько четных цифр в найденной сумме.
//Для решения задачи использовать декомпозицию.

//мой комментарий.
//При n > 10 работает очень медленно.

public class Task16 {

	public static void main(String[] args) {

		int n;
		n = validationOfInput("Enter the size of the number >> ");

		BigInteger sum = BigInteger.valueOf(0);

		long start;
		long finish;

		start = start(n);
		finish = (long) Math.pow(10, n);

		for (; start < finish; start = start + 2) {

			if (checkingForOddDigits(start)) {

				sum = sum.add(BigInteger.valueOf(start));
			}
		}

		System.out.println(sum);

		System.out.println("There are " + counter(sum) + " even digits in the sum.");

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

	public static boolean checkingForOddDigits(long x) {

		boolean flag = true;

		for (long i = x / 10; i > 0; i = i / 10) {

			if (i % 2 == 0) {
				flag = false;
				return flag;
			}
		}

		return flag;
	}

	public static long start(int x) {

		long num = 0;

		for (int i = 0; i < x; i++) {

			num = num * 10 + 1;
		}

		return num;
	}

	public static int counter(BigInteger x) {

		int count = 0;

		int temp;
		BigInteger t;

		while (x.compareTo(BigInteger.ZERO) > 0) {

			t = x.mod(BigInteger.TEN);

			temp = t.intValue();

			if (temp % 2 == 0) {
				count++;
			}

			x = x.divide(BigInteger.TEN);

		}

		return count;
	}
}
