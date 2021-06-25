package by.java_online_cource.algorithmization.one_dimensional_array;

import java.util.*;

//Задана последовательность N вещественных чисел.
//Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.

public class Task6 {

	public static void main(String[] args) {

		int n;
		n = consoleInputNaturalNumber("Enter the size of array >> ");

		double[] arr = new double[n];
		arrayFillingRealNumber(arr);

		boolean[] primeIndex = new boolean[n];
		primeIndex(primeIndex);

		double sum = 0;

		if (n > 2) {
			
			for (int i = 2; i < arr.length; i++) {
				if (!primeIndex[i]) {
					sum = sum + arr[i];
				}
			}
			
			System.out.print("The sum is " + sum);
		} else {
			
			System.out.print("The sum can`t be found.");
		}
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

	public static void arrayFillingRealNumber(double[] mas) {

		for (int i = 0; i < mas.length; i++) {
			mas[i] = Math.random() * 2000.0 - 1000;
		}
		return;
	}

	public static void primeIndex(boolean[] mas) {

		for (int i = 2; i < mas.length; i++) {
			if (!mas[i]) {

				for (int j = i + i; j < mas.length; j = j + i) {
					mas[j] = true;
				}
			}
		}
		return;
	}

}
