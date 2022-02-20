package by.epam.tr.main;

import java.util.Scanner;

public class Task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int a;
		int b;
		int c;
		int sum;
		
		System.out.println("¬ведите a");
		a = sc.nextInt();
		System.out.println("¬ведите b");
		b = sc.nextInt();
		System.out.println("¬ведите c");
		c = sc.nextInt();
		if (a==b) {
			sum = a + c;
			}
		else if (a==c) {
			sum = a + b;
			}
		else if (b==c) {
			sum = a + b;
			}
		else if (a==b & a==c) {
			sum=a+b;
			}
		if (c<a & c<b & a>b) {
			sum = a + c;
			}
		else if (b<a & b<c & c<a) {
			sum = a + b;
			}
		else  {
			sum = b + c;
			}
		System.out.println("sum="+sum);
	}

}
