package by.java_online_cource.algorithmization.destructuring;

import java.util.*;

//Два простых числа называются "близнецами",
//если они отличаются друг от друга на 2 (например 41 и 43).
//найти и напечатать все пары "близнецов" из отрезка [n, 2n],
//где n - заданное число натуральное число больше 2.
//Для решения задачи использовать декомпозицию.

public class Task13 {

	public static void main(String[] args) {

		int n;
		n = validationOfInput("Enter n (n > 2) >> ");

		boolean flag = true;

		for (int i = n; i < 2 * n - 1; i++) {
			if (primeNumber(i) && primeNumber(i + 2)) {

				System.out.println(i + "\t" + (i + 2));
				flag = false;
			}
		}

		if (flag) {
			System.out.println("There aren`t the such numbers on the segment [" + n + "; " + 2 * n + "]");
		}
	}

	public static int validationOfInput(String str) {

		Scanner scan = new Scanner(System.in);

		int number = 0;
		while (number <= 2 || number > 1073741824) {
			System.out.print(str);
			while (!scan.hasNextInt()) {
				scan.next();
				System.out.print(str);
			}
			number = scan.nextInt();
		}
		return number;
	}

	public static boolean primeNumber(int x) {

		boolean flag = true;

		for (int i = 2; i < x / 2; i++) {
			if (x % i == 0) {
				flag = false;
				return flag;
			}
		}

		return flag;
	}

}
