package by.epam.tr.main;

import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a;
		double b;
		double x;
		double h;
		double f;
		
		System.out.println("������� �������� a");
		a = sc.nextDouble();
		System.out.println("������� �������� b");
		b = sc.nextDouble();
		System.out.println("������� �������� x");
		x = sc.nextDouble();
		System.out.println("������� �������� h");
		h = sc.nextDouble();
		
		if (x>=a & x<=b) {		
		    System.out.println("---------------------------------");
		    System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "f");
		    System.out.println("---------------------------------");
		    f=Math.pow(Math.sin(x), 2)-Math.cos(2*x);
		    System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, f);
		    while (x + h <= b) {
		    	x=x+h;
				f = Math.pow(Math.sin(x), 2) - Math.cos(2*x);
			    System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, f);
		        }
		
		    }
		else {
			System.out.println("�������� ���������� x ��������� ��� ������� [a,b] ���� b<a");
		}
	}
}

