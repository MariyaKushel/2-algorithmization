package by.java_online_cource.algorithmization.destructuring;

import java.util.Scanner;
import java.math.*;

//Вычислить площадь правильного шестиугольника со строной а,
//использую метод вычисления площади треугольника.

public class Task3 {

	public static void main(String[] args) {

		double side = validationOfInput("Enter side >> ");

		double area = area(side);

		System.out.format("The area is %.3f", area);

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

	
	public static double area(double x) {

		double s;
		s = 3 * Math.sqrt(3) * x * x / 2;

		return s;
	}

}
