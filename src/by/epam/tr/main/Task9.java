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
		while (x<=0) {System.out.println("������� ���������� ��������� ������� a");
		x=sc.nextInt();
		}
		while (y <= 0) {System.out.println("������� ���������� ��������� ������� b");
		y = sc.nextInt();
		}
		a = new int [x];
		b = new int [y];
		c = new int [a.length+b.length];
		
		System.out.println("������� ����� �������� k ������� a �� 1 �� " + (x-1) + ", ����� �������� ����� �������� ������ b");
		k = sc.nextInt();
		while (k<=0 | k>=x) {
			System.out.println("k �� ����������� �������� ���������");
			System.out.println("������� �������� �������� k ������� a �� 1 �� " + (x-1) + ", ����� �������� ����� �������� ������ b");
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
