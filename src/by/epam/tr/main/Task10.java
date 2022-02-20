package by.epam.tr.main;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите четное количество элементов массива");
		a=sc.nextInt();
		while ((a<=0) || (a%2!=0)) {
			System.out.println ("¬ведены неверные данные");
			System.out.println("¬ведите четное количество элементов массива");
			a=sc.nextInt();
		}
		int [] [] mas = new int [a] [a];
		for (int i=0; i<a; i++) {
			for (int j=0; j<a; j++) {
			if (i%2==0) {
				mas [i] [j] = j+1;
				}
			else {
				mas [i] [j] = mas.length-j;
				}
			}
		}
			for(int i = 0; i < mas.length; i++){
				for(int j = 0; j < mas[i].length; j++){
					System.out.printf("%3d", mas[i][j]);
				}
				System.out.println();
			}
		}
		}
		
	
