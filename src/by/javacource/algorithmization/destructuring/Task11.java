package by.javacource.algorithmization.destructuring;

import java.util.*;

//Написать метод (методы), определяющий, 
//в каком из данных двух чисел больше цифр.

public class Task11 {

	public static void main(String[] args) {

		int a;
		int b;

		a = validationOfInput("Enter first number >> ");
		b = validationOfInput("Enter second number >> ");

		int countA;
		int countB;

		countA = countOfNumber(a);
		countB = countOfNumber(b);

		if (countA > countB) {
			System.out.println("The first number has more digits than the second.");
		} else if (countA == countB) {
			System.out.println("The first number has as many digits as the second.");
		} else {
			System.out.println("The first number has less digits than the second.");
		}

	}

	public static int validationOfInput(String str) {

		Scanner scan = new Scanner(System.in);

		int number;

		System.out.print(str);

		while (!scan.hasNextInt()) {
			scan.next();
			System.out.print(str);
		}
		number = scan.nextInt();

		return number;
	}

	public static int countOfNumber(int x) {

		int k = 0;

		while (x != 0) {
			x = x / 10;
			k = k + 1;
		}

		return k;
	}

}
