package by.javacource.algorithmization.destructuring;

import java.util.*;

//Написать метод (методы) для вычисления суммы факториалов
//всех нечетных чисел от 1 до 9.

public class Task7 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 9; i = i + 2) {
			
			sum = sum + factorial(i);
		}

		System.out.print(sum);
	}

	public static int factorial(int x) {

		int factor = 1;
		
		for (int j = 1; j <= x; j++) {
			
			factor = factor * j;
		}

		return factor;
	}

}
