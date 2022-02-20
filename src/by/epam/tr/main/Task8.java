package by.epam.tr.main;

import java.util.Random;
import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		int[] a;
		int n;
		int k;
		long sum=0;
		Random rand = new Random();		
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите длину массива");
		n = sc.nextInt();
		while  (n<=0) {
			System.out.println("Количество элементов массива не может быть ранво нулю или отрицательному числу. Введите корректное значение");
			n = sc.nextInt();
		}
		a = new int[n];
		System.out.println("Введите K");
		k = sc.nextInt();
		if (k == 0) {
			System.out.println("Введите K"); 
			k = sc.nextInt();
		}
		for (int i=0; i<a.length; i++) {
			a[i] = 1+rand.nextInt(2147483647)+1; 
			System.out.println("a[" + i + "]=" + a[i]);
		if (a[i]%k == 0) {
			sum=sum+a[i];
		}
		}
		System.out.println("sum=" +sum);
	}

}
