package by.java_online_cource.algorithmization.one_dimensional_array;

import java.util.*;

//Даны действительные числа a1, a2, ..., an.
//Найти max (a1 + a2n, a2 + a2n-1, an + an+1).

//Мой комментарий.
//Если даны действительные числа от a1 до an, то число a2n не попадает в последоательность.
//Поэтому, я буду считать, что даны действительные числа a1, a2, ..., a2n.  

public class Task7 {

	public static void main(String[] args) {

		int n;
		n = consoleInputNaturalNumber("Enter half the size of array >> ");

		double[] arr = new double[2 * n];

		arrayFillingRealNumber(arr);
		printArrayD(arr);

		double[] arrOfSums = new double[n];

		for (int i = 0, j = arr.length - 1; i < arrOfSums.length; i++, j--) {
			arrOfSums[i] = arr[i] + arr[j];
		}
		printArrayD(arrOfSums);

		int maxIndex = 0;

		for (int ind = 1; ind < arrOfSums.length; ind++) {

			if (arrOfSums[maxIndex] < arrOfSums[ind]) {
				maxIndex = ind;
			}
		}

		System.out.println("Max sum is " + arrOfSums[maxIndex]);
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

	public static void printArrayD(double[] mas) {

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "\t");
		}

		System.out.println();
		return;
	}

}
