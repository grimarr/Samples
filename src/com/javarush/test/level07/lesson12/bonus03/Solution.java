package com.javarush.test.level07.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(int[] array)
    {
        int tmp;
        for (int i = 1; i < array.length; i++)                  // выподнение итераций сортировки (метод пузырька)
        {
            for (int b=(array.length - 1); b >= i; b--)
            {
                if (array[b-1] < array[b])
                {
                    tmp = array[b];
                    array[b] = array[b - 1];
                    array[b - 1] = tmp;
                }
            }
        }
    }
}
