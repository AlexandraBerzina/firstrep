package by.epam.tr.main;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double a;
		double b;
		double c;
		double a1;
		double b1;
		double c1;
		
		
		System.out.println("¬ведите значение a");
		a = sc.nextDouble();
		System.out.println("¬ведите значение b");
		b = sc.nextDouble();
		System.out.println("¬ведите значение c");
		c = sc.nextDouble();
		
		if (a>=0) {a1=Math.pow(a, 2);}
		else {a1=Math.pow(a, 4);} 
		
		if (b>=0) {b1=Math.pow(b, 2);} 
		else {b1=Math.pow(b, 4);} 
		
		if (c>=0) {c1=Math.pow(c, 2);}
		else {c1=Math.pow(c, 4);}
		
		System.out.println("a1="+a1);
		System.out.println("b1="+b1);
		System.out.println("c1="+c1);
	}
}
