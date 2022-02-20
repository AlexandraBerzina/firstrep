package by.epam.tr.main;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		double a;
		double b;
		double c;
		double s; 
		double p;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите длину катета a");
		a = sc.nextDouble();
		while (a<=0) {
			System.out.println("¬ведены некорректные значени€");
			System.out.println("¬ведите длину катета a");
			a = sc.nextDouble();
		}
		b = sc.nextDouble();
		while (b<=0) {
			System.out.println("¬ведены некорректные значени€");
			System.out.println("¬ведите длину катета b");
			b = sc.nextDouble();
		}
		c=Math.sqrt(Math.pow(a, 2)+Math.pow(b, 2));
		s = (a * b) / 2;
		System.out.println("s="+s);
		p = a + b +c;
		System.out.println("S="+s);

	}
	}


