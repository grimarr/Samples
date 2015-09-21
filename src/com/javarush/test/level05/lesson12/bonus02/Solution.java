package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int minimum;
	int a = minimum = Integer.parseInt(reader.readLine());
	for (int i = 1; i < 5; i++)
	{
		a = Integer.parseInt(reader.readLine());
		minimum = min(minimum, a);
        }
	System.out.println("Minimum = " + minimum);
    }

    public static int min(int a, int b)
    {
    	return a < b ? a : b;
    }
}
