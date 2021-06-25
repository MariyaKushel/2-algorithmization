package by.java_online_cource.algorithmization.destructuring;

import java.util.Scanner;

//Написать метод (методы) для нахождения наибольшего общего делителя и
//наименьшего общего кратного двух натуральных чисел.
//НОК(А,В) = (А*В) / НОД(А,В) 

public class Task1 {

	public static void main(String[] args) {

		int a = validationOfInput("Enter a = ");
		int b = validationOfInput("Enter b = ");

		int gcd = gcd(a, b);
		int lcm = lcm(a, b, gcd);
		
		System.out.println("The greatest common divisor (НОД) is " + gcd);
		System.out.println("The least common multiple (НОК) is " + lcm);

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

	
	// НОК
	public static int lcm(int x, int y, int d) {

		int k;
		k = (x * y) / d;

		return k;
	}

}