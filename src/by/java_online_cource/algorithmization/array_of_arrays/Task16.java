package by.java_online_cource.algorithmization.array_of_arrays;

import java.util.Scanner;

//Магическим квадратом порядка n называется квадратная матрица размера n x n, 
//составленная из чисел 1, 2, 3, ..., n^2 так, что суммы по каждому столбцу,
//каждой строке и каждой из двух больших диагоналей равны между собой.
//Построить такой квадрат. Пример магического квадрата порядка 3:
//	6   1   8
//	7   5   3
//	2   9   4

public class Task16 {

	public static void main(String[] args) {

		int n;
		n = consoleInputNaturalNumber("Enter the size of matrix >> ");

		int arr[][] = new int[n][n];

		if (n == 2) {

			System.out.println("The such magic square doesn`t exist.");

		} else if (n % 2 == 1) { // n = 1, 3, 5, 7, ...

			magicSquareOddOrder(arr);
			printArrayI(arr);
			check(arr);

		} else if (n % 4 == 0) { // n = 4, 8, 12, 16, ...

			magicSquareEvenEven(arr);
			printArrayI(arr);
			check(arr);

		} else { // n = 6, 10, 14, 18, ...

			magicSquareEvenOdd(arr);
			printArrayI(arr);
			check(arr);
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

	// Метод террас
	public static void magicSquareOddOrder(int mas[][]) {

		int size;
		int a;
		int b;
		int number = 1;

		size = mas.length;
		a = (int) size / 2;
		b = a + 1;

		for (int i = a, j = b, iterationsIJ = 0; iterationsIJ < size; i++, j++, iterationsIJ++) {

			if (i == size) {
				i = 0;
			}

			if (j == size) {
				j = 0;
			}

			for (int k = i, m = j, iterationsKM = 0; iterationsKM < size; k--, m++, iterationsKM++) {

				if (k == -1) {
					k = size - 1;
				}

				if (m == size) {
					m = 0;
				}

				mas[k][m] = number;
				number++;
			}
		}
	}

	// Метод квадратных рамок
	public static void magicSquareEvenEven(int mas[][]) {

		int number = 1;
		int size;

		size = mas.length;

		for (int i = 0, j = 0, iterationsIJ = 1; iterationsIJ <= size; i++, iterationsIJ++) {

			if (iterationsIJ % 4 == 0 || iterationsIJ % 4 == 1) {
				j = 0;
			} else {
				j = size - 1;
			}

			for (int k = i, m = j, iterationsKM = 1; iterationsKM <= size; iterationsKM++) {

				mas[k][m] = number;

				number++;

				if (j == 0) {
					m++;
				} else {
					m--;
				}

				if (i % 2 == 0 && iterationsKM > size / 2 || i % 2 == 1 && iterationsKM < size / 2) {

					k++;
					if (k == size) {
						k = 0;
					}
				} else if (i % 2 == 0 && iterationsKM < size / 2 || i % 2 == 1 && iterationsKM > size / 2) {

					k--;
					if (k == -1) {
						k = size - 1;
					}
				}
			}
		}
	}

	// Метод четырех квадратов
	public static void magicSquareEvenOdd(int[][] mas) {

		int number = 1;
		int size;
		int halfSize;

		size = mas.length;
		halfSize = size / 2;

		int masTemp[][] = new int[halfSize][halfSize];

		magicSquareOddOrder(masTemp);

		//Заполняем каждую четверь матрицы нечетным магическим квадратом
		for (int i = 0, k = 0; k < halfSize; i++, k++) {

			for (int j = 0, m = 0; m < halfSize; j++, m++) {

				mas[i][j] = masTemp[k][m] + 0;
				
				mas[halfSize + i][halfSize + j] = masTemp[k][m] + halfSize * halfSize;
				
				mas[i][halfSize + j] = masTemp[k][m] + 2 * halfSize * halfSize;
				
				mas[halfSize + i][j] = masTemp[k][m] + 3 * halfSize * halfSize;
			}
		}

		//Меняем местами верхнюю и нижнюю половины центральных столбцов
		int x;
		x = (halfSize - 3) / 2;

		if (x > 0) {
			for (int i = 0; i < halfSize; i++) {

				for (int j = halfSize - x; j < halfSize + x; j++) {

					swap(mas, i, j, halfSize);
				}
			}
		}

		//Меняем местами верхнюю и нижнюю половины двух первых столбцов
		for (int i = 0, j = 0; i < halfSize; i++) {

			if (i == 0 || i == halfSize - 1) {
				j = 0;
			} else {
				j = 1;
			}
			swap(mas, i, j, halfSize);
		}
	}

	// Проверка моих вычислений, через вычисление магической константы
	public static void check(int[][] mas) {

		int size;
		size = mas.length;

		int magicConst;
		magicConst = (size * (size * size + 1)) / 2;

		int sum = 0;
		boolean flag = true;

		// Суммы по рядам
		for (int i = 0; i < size && flag; i++) {

			sum = 0;

			for (int j = 0; j < size && flag; j++) {

				sum = sum + mas[i][j];
			}

			if (sum != magicConst) {
				flag = false;
			}
		}

		// Суммы по столбцам
		for (int j = 0; j < size && flag; j++) {

			sum = 0;

			for (int i = 0; i < size && flag; i++) {

				sum = sum + mas[i][j];
			}

			if (sum != magicConst) {
				flag = false;
			}
		}

		// Сумма по первой диаганали
		sum = 0;

		for (int i = 0, j = 0; i < size && flag; i++, j++) {
			sum = sum + mas[i][j];
		}

		if (sum != magicConst) {
			flag = false;
		}

		// Сумма по второй диаганали
		sum = 0;

		for (int i = 0, j = size - 1; i < size && flag; i++, j--) {
			sum = sum + mas[i][j];
		}

		if (sum != magicConst) {
			flag = false;
		}

		if (flag) {
			System.out.println("The magic const of the magic square is " + magicConst);

		} else {
			System.out.println("Oh, something is wrong in my calculations...");
		}
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

	public static void swap(int[][] mas, int x, int y, int half) {

		int temp;
		temp = mas[x][y];
		mas[x][y] = mas[half + x][y];
		mas[half + x][y] = temp;
	}
}
