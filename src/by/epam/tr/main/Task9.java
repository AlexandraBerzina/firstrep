package by.epam.tr.main;

import java.util.Random;
import java.util.Scanner;

public class Task9 {

	public static void main(String[] args) {
		int [] a;
		int [] b;
		int [] c;
		int k;
		int x=0;
		int y=0;
		Scanner sc = new Scanner(System.in);
		while (x<=0) {System.out.println("¬ведите количество элементов массива a");
		x=sc.nextInt();
		}
		while (y <= 0) {System.out.println("¬ведите количество элементов массива b");
		y = sc.nextInt();
		}
		a = new int [x];
		b = new int [y];
		c = new int [a.length+b.length];
		
		System.out.println("¬ведите номер элемента k массива a от 1 до " + (x-1) + ", после которого будет вставлен массив b");
		k = sc.nextInt();
		while (k<=0 | k>=x) {
			System.out.println("k не принадлежит заданому диапазону");
			System.out.println("¬ведите значение элемента k массива a от 1 до " + (x-1) + ", после которого будет вставлен массив b");
			k = sc.nextInt();
		}
		for (int i=0; i<=k; i++) {
					c[i]=a[i];
			}
			for (int i=k+1; i<c.length; i++) {
				for (int j=0; j<b.length; j++) {
					c[i]=b[j];
			      }
	}
			k++;
		for (int i=k+b.length; i<c.length; i++)	{
			c[i]=a[k];
			k++;
						}
		
 }

}
