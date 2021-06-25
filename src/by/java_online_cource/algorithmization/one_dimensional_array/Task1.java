package by.java_online_cource.algorithmization.one_dimensional_array;

import java.util.*;
import java.math.*;

//В массив A[N] занесены натуральные числа. 
//Найти сумму тех элементов, котрые кратны данному K.

public class Task1 {

	public static void main(String[] args) {

		int n;
		int k;

		n = consoleInputNaturalNumber("Enter the size of array >> ");
		k = consoleInputNaturalNumber("Enter k >> ");

		int[] arr = new int[n];
	
		arrayFilling(arr);
		printArrayInt(arr);

		long sum = 0;
		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i] % k == 0) {
				
				sum = sum + arr[i];
				flag = true;
			}
		}

		if (flag) {
			System.out.println("The sum is " + sum);
		} else {
			System.out.println("There aren`t elements multiple " + k);
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

	public static void arrayFilling(int[] mas) {

		for (int i = 0; i < mas.length; i++) {
			mas[i] = (int) (Math.random() * 1000000);
		}
		return;
	}

	public static void printArrayInt(int[] mas) {

		for (int i = 0; i < mas.length; i++) {
			System.out.print(mas[i] + "\t");
		}

		System.out.println();
		return;
	}
}
