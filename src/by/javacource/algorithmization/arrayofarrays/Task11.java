package by.javacource.algorithmization.arrayofarrays;

//Матрицу 10 х 20 заполнить случайными числами от 0 до 15.
//Вывести на экран саму матрицу и номера строк, 
//в которых число 5 встречается три и более раз.

public class Task11 {

	public static void main(String[] args) {

		int k = 10;
		int p = 20;

		int arr[][] = new int[k][p];

		arrayFillingInteger(arr);

		printArrayI(arr);

		System.out.println("The rows, which have three and more \"5\" are >>");

		boolean flag = false;

		for (int i = 0; i < arr.length; i++) {

			int countRep = 0;

			for (int j = 0; j < arr[i].length; j++) {

				if (arr[i][j] == 5) {
					countRep++;
				}
			}

			if (countRep >= 3) {
				System.out.print((i + 1) + "\t");
				flag = true;
			}
		}

		if (!flag) {
			System.out.print("There aran`t such rows.");
		}
	}

	public static void arrayFillingInteger(int[][] mas) {

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {

				mas[i][j] = (int) (Math.random() * 16);
			}
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
}
