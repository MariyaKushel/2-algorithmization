package by.javacource.algorithmization.arrayofarrays;

import java.util.Scanner;

//Сформировать квадратную матрицу порядка n по заданному образцу (n - четное):
// | 	1	 2		3	...	 n	|
// |	n	n-1	   n-2	...	 1	|
// | 	1	 2		3	...	 n	|
// |	n	n-1	   n-2	...	 1	|
// |	.	 .      .   .    .	|
// |	.	 .      .    .   .	|
// |	.	 .      .     .  .	|
// |	n	n-1	   n-2	...	 1	|

public class Task4 {

	public static void main(String[] args) {

		int k;
		k = consoleInputEvenNaturalNumber("Enter the size (even number) of the matrix >> ");

		int arr[][] = new int[k][k];

		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				
				if (i % 2 == 0) {
					arr[i][j] = j + 1;
				} else {
					arr[i][j] = arr[i].length - j;
				}
			}
		}
		
		printArrayI(arr);

	}

	public static int consoleInputEvenNaturalNumber(String str) {

		Scanner scan = new Scanner(System.in);

		int number = -1;
		while (number <= 0 || number % 2 != 0) {
			System.out.print(str);
			while (!scan.hasNextInt()) {
				scan.next();
				System.out.print(str);
			}
			number = scan.nextInt();
		}
		return number;
	}

	public static void printArrayI(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				System.out.print(mas[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println();
	}
}
