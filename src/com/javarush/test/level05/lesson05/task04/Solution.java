package com.javarush.test.level05.lesson05.task04;
import com.javarush.test.level05.lesson05.task02.Cat;
/* ������� ��� ������� ���� Cat
� ������ main ������� ��� ������� ���� Cat � ��������� �� �������.
������������ ����� Cat �� ������ ������. ����� Cat ��������� �� ����.
*/

public class Solution {
    public static void main(String[] args) {
        Cat one = new Cat("Punchy", 1, 2, 15);
		Cat two = new Cat("Basic", 3, 7, 5);
		Cat three = new Cat("Tumblr", 4, 2, 12);
		
		if (one.fight(two))			
		System.out.println(one.getName() + " wins");
		else System.out.println(two.getName() + " wins");
		
		if (one.fight(three))			
		System.out.println(one.getName() + " wins");
		else System.out.println(three.getName() + " wins");
		
		if (two.fight(three))			
		System.out.println(two.getName() + " wins");
		else System.out.println(three.getName() + " wins");
    }
}
