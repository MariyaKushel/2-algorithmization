package by.java_online_cource.algorithmization.destructuring;

import java.util.Scanner;
import java.math.*;

//На плоскости заданы своими координатами n точек.
//Написать метод (методы), определяющие, между какими из пар точек
//самое большое расстояние.
//Указание. Координаты точек занести в массив.

public class Task4 {

	public static void main(String[] args) {

		int n;
		n = validationOfInput("Enter number of points >> ");

		int[][] points = new int[n][2];

		coordinate(points);
		printArrayI(points);

		double distances = 0;
		double temp = 0;
		int a = 0;
		int b = 0;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				temp = distance(points[i][0], points[i][1], points[j][0], points[j][1]);

				if (distances < temp) {
					distances = temp;
					a = i;
					b = j;
				}
			}
		}

		System.out.println("Max distances is " + distances + " between points >>");
		System.out.println("[ " + points[a][0] + "; " + points[a][1] + " ]");
		System.out.println("[ " + points[b][0] + "; " + points[b][1] + " ]");

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

	public static void coordinate(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {

			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = (int) (Math.random() * 200 - 100);
			}
		}

		return;
	}

	public static double distance(int x1, int y1, int x2, int y2) {

		double dis;
		double deltaX;
		double deltaY;

		deltaX = Math.pow((x2 - x1), 2);
		deltaY = Math.pow((y2 - y1), 2);

		dis = Math.sqrt(deltaX + deltaY);

		return dis;
	}

	public static void printArrayI(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {

			System.out.print("[ ");

			for (int j = 0; j < mas[i].length; j++) {

				System.out.print(mas[i][j]);
				if (j == 0) {
					System.out.print("; ");
				}
			}
			System.out.println(" ]");
		}
		System.out.println();

		return;
	}
}
