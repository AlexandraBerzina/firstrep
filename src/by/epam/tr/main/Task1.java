package by.epam.tr.main;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int a;
		int b;
		int c;
		int d;
		int sum1;
		int sum2;
		
		System.out.println("Введите x");
		int x = sc.nextInt();
		while ((x<1000 & x>-1000) | (x<-9999) | (x>9999)){
			System.out.println("Вычисление невозможно");
		    System.out.println("Введите x");
		    x = sc.nextInt();
		}
		
		if (x>=1000 & x<=9999) {		
		a = x/1000;
		b = (x-a*1000)/100;
		sum1 = a+b;
		c=(x-a*1000-b*100)/10;
		d=x-a*1000-b*100-c*10;
		sum2 = c+d;
		}
		
		else {
		a = Math.abs(x/1000);
		b = (Math.abs(x)-a*1000)/100;
		sum1 = a+b;
		c = (Math.abs(x)-a*1000-b*100)/10;
		d = Math.abs(x)-a*1000-b*100-c*10;
		sum2 = c+d;
		} 
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);			
		System.out.println("sum1="+sum1);
		System.out.println("sum2="+sum2);
		if (sum1==sum2) {
			System.out.println("true");
			}
		else {
			System.out.println("false");
			}
	}
}
	

