package by.java_online_cource.algorithmization.destructuring;

import java.util.*;

//Из заданного числа вычли сумму его цифр.
//Из результата вновь вычли сумму его цифр и т.д.
//Сколько таких действий надо произвести, чтобы получился нуль?
//Для решения задачи использовать декомпозицию.

public class Task17 {

	public static void main(String[] args) {

		int n;
		n = validationOfInput("Enter a number >> ");

		int count = 0;

		while (n > 0) {

			n = n - sum(n);

			count++;
		}

		System.out.println("Made " + count + " operations.");

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

	public static int sum(int x) {

		int sum = 0;

		for (int i = x; i > 0; i = i / 10) {

			sum = sum + i % 10;
		}

		return sum;
	}
}
