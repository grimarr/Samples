package com.start.lessions;
import com.javarush.test.level05.lesson05.task02.Cat;

public class Basic
{
	public static void main(String[] args) {
		System.out.println("byte 0�55");
		System.out.println("short 0x55ff");
		System.out.println("int 1000000");
		System.out.println("long 0xffffffffL");
		System.out.println("char 'a'");
		System.out.println("float .25f");
		System.out.println("double .00001234");
		System.out.println("boolean true");
	
	/*  � ���������� q � w �������� ��� ����������� �����. 
		�������� ���������, ��������� �� ����� ��������� ������� q �� w � ��������.*/
		int q = 5, w = 3;
		System.out.println("q / w = " + q / w + " and " + q % w);
		
	/*  � ���������� n �������� ����������� ���������� �����. 
		�������� ���������, ����������� � ��������� �� ����� ����� ���� ����� n.*/
		int n = 99;
		System.out.println("Sum n = " + (n / 10 + n % 10));
		
	/*  � ���������� m �������� ������������ ����� � ��������� ������� ������. 
		�������� ���������, ����������� ����� m �� ���������� ������ � ��������� ��������� �� �����.*/
		double m = 12.57;
		m = m + 0.5;
		System.out.println("m = " + (int) m);
		
	/*	� ���������� n �������� ����������� ���������� �����. 
		C������� ���������, ����������� � ��������� �� ����� ����� ���� ����� n.*/
		n = 101;
		n = (n / 10) / 10 + (n / 10) % 10 + (n % 10) % 10;
		System.out.println("Sum n = " + n);
	
	/*	�������� ���������, ������� ����� ������������ 
		� �������� �� ����� ������������ ��������������� ����� �� ���������� [-3;3).*/
		System.out.println("random is " + ((float) Math.random() * 6 - 3));  // Min + (int)(Math.random() * ((Max - Min) + 1))


		// ������ �������� ��� MATH https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html

	/*  ������� ���������, ����������� � ���������� �� �����, 
		�������� �� ����� ����� ���������� � ���������� n, ������ ���� ��������.	*/
		if ((n % 2) == 0)
			System.out.println(n + " is even");
		else
			System.out.println(n + " is uneven");
		
	/*	������� ���������, ��������� �� ����� ��������� � 10 �� ���� �����, 
		���������� � ���������� m � o. ��������, ����� ����� 8,5 � 11,45 ��������� � ������ 11,45.*/
		m = 8.5;
		double o = 11.45;
		if (Math.abs(10 - m) >= Math.abs(10 - o))        // ���������� Math.abs - ������ �����()
			System.out.println(o + " is near to 10");
		else
			System.out.println(m + " is near to 10");

		if ((10 - m) < 0)                                // �� ���������� Math.abs - ������ �����()
			m = -m;
		if ((10 - o) < 0)
			o = -o;
		if ((10 - m) >= (10 - o))
			System.out.println(o + " is near to 10");
		else
			System.out.println(m + " is near to 10");
				
	/* 	� ��� ���������� a, b � c �������� ��� ������������ �����. 
		������� ���������, ������� ����� �������� � �������� �� ����� ������������ ����� ����������� ��������� ax?+bx+c=0, ���� ��������, ��� ������ ���.*/
		float a = 1.8f, b = 3.8f, c = -4.6f;
		double d = (b * b) - (4 * a * c);
		if (d > 0)
			System.out.println("D>0, there's two sqrt! the first is " + ((-b + Math.sqrt(d)) / (2 * a)) + " and the second is " + ((-b - Math.sqrt(d)) / (2 * a)));
		if (d == 0)
			System.out.println("D=0, only one sqrt! " + (-b / (2 * a)));
		if (d < 0)
			System.out.println("there's no sqrt! d < 0");

	/* ������� ���������, ������� ����� ��������� ������ �� �������� ��������� �� ������� [5;155]
		����� ����� � �������� (25;100) � �������� ��������� �� �����.*/

		q = 5 + (int) (Math.random() * ((155 - 5) + 1)); // ��� �� �������� ������?! min+(int)Math.random()*((max-min)+1)
		if (q > 25 && q < 100)
			System.out.println("Destroyed! (25;100) " + q);
		else
			System.out.println("Miss! (25;100) " + q);
	/* ������� ���������, ��������� �� ����� �������� ��������������� ���������� ����������� ����� � ��� ���������� �����.*/

		q = 100 + (int) Math.random() * (999 - 100) + 1;
		System.out.print(q);
		int lit1 = q / 100, lit2 = (q / 10) % 10, lit3 = (q % 10) % 10;
		if (lit1 >= lit2 && lit1 >= lit3)
			System.out.println(" the biggest is " + lit1);
		else if (lit2 >= lit1 && lit2 >= lit3)
			System.out.println(" the biggest is " + lit2);
		else if (lit3 >= lit1 && lit3 >= lit2)
			System.out.println(" the biggest is " + lit3);
	
	/*	� ��� ���������� a, b � c ���� �������� ������������� ��� ����� ������� �������� ����� ����� �����.
		������� ���������, ������� ���������� ����� � ���������� ����� �������, ����� ��� ������ �� �����
		������������������ a, b � c ��������� ������ ������������.
	*/

		int a1 = 1, b1 = 20, c1 = 13;
		System.out.println(min(a1,b1,c1) + " " + mid(a1,b1,c1) + " " + max(a1,b1,c1));

		Cat cat1 = new Cat();
		cat1.setName("Wooow");
		cat1.setAge(10);
		cat1.setWeight(4);
		cat1.setStrength(6);
		Cat cat2 = new Cat();
		cat2.setName("awwww");
		cat2.setAge(2);
		cat2.setWeight(4);
		cat2.setStrength(5);
		System.out.println(cat1.fight(cat2));
		System.out.println(cat2.fight(cat1));
	}
		public static int min(int xx, int yy, int zz){
			if (xx <= yy && xx <= zz)
				return xx;
			else if (yy <= xx && yy <= zz)
				return yy;
			else 
				return zz;
		}
		public static int mid(int xx, int yy, int zz){
			if ((xx >= yy && xx <= zz) || (xx <= yy && xx >= zz))
				return xx;
		else if ((yy >= xx && yy <= zz) || (yy <= xx && yy >= zz))
				return yy;
			else 
				return zz;
		}
		public static int max(int xx, int yy, int zz){
			if (xx >= yy && xx >= zz)
				return xx;
			else if (yy >= xx && yy >= zz)
				return yy;
			else 
				return zz;
		}
		


	
}