package by.epam.tr.main;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double a;
		double b;
		double c;
		double x;
		System.out.println("������� a");
		a = sc.nextDouble();
		while (a==0) {
			System.out.println("������ �� ���� ������");
			System.out.println("������� a");
			a = sc.nextDouble();
		}
		System.out.println("������� b");
		b = sc.nextDouble();
		System.out.println("������� c");
		c = sc.nextDouble();
		if ((Math.pow(b, 2)+(4*a*c))<0) {
			System.out.println("���������� ����������");
			}
			else {
		x = ((b + Math.sqrt(Math.pow(b, 2) + (4*a*c))) / (2*a)) - (Math.pow(a, 3)*c) + Math.pow(b, -2);
				System.out.println(x);
	}
	}
}
