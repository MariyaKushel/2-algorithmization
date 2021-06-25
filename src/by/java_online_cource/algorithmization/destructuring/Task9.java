package by.java_online_cource.algorithmization.destructuring;

import java.util.*;
import java.math.*;

//Даны числа X, Y, Z, T - длины сторон четырехугольника.
//Написать метод (методы) вычисления его площади,
//если угол между сторонами X и Y - прямой.

//Мой комментрарий.
//Буду производить расчет считая четырехугольник выпуклым.

public class Task9 {

	public static void main(String[] args) {

		double x = 0;
		double y = 0;
		double z = 0;
		double t = 0;

		boolean flag = false;
		while (!flag) {
			x = validationOfInput("Enter x >> ");
			y = validationOfInput("Enter y >> ");
			z = validationOfInput("Enter z >> ");
			t = validationOfInput("Enter t >> ");

			flag = verificationOfExistence(x, y, z, t);

			if (!flag) {
				System.out.println("This quadrangle doesn`t exist.");
				System.out.println("Please enter the size of the sides again.");
			}
		}

		double area;

		area = area(x, y, z, t);

		System.out.println("The area is " + area);

	}

	public static double validationOfInput(String str) {

		Scanner scan = new Scanner(System.in);

		double number = 0;
		while (number <= 0) {
			System.out.print(str);
			while (!scan.hasNextDouble()) {
				scan.next();
				System.out.print(str);
			}
			number = scan.nextDouble();
		}
		return number;
	}

	public static boolean verificationOfExistence(double a, double b, double c, double d) {

		boolean marker = false;
		if (a < (b + c + d) && b < (a + c + d) && c < (a + b + d) && d < (a + b + c)) {
			marker = true;
		}

		return marker;
	}

	// The area of ​​a quadrangle is equal to the sum of the areas of 2 triangles.
	public static double area(double a, double b, double c, double d) {

		double s;
		double s1;
		double s2;

		s1 = a * b / 2;

		double hyp;
		hyp = Math.sqrt(a * a + b * b);

		double p;
		p = (hyp + c + d) / 2;

		s2 = Math.sqrt(p * (p - hyp) * (p - c) * (p - d));

		s = s1 + s2;

		return s;
	}
}
