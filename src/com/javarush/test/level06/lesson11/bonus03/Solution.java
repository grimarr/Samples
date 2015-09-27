package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[5];
        int tmp;

        for (int i = 0; i < a.length; i++)                  // можно ли использовать foreach?!
        {
            a[i] = Integer.parseInt(reader.readLine());
        }

       for (int i = 1; i < a.length; i++)                  // выподнение 4 итераций сортировки (метод пузырька)
        {
            for (int b=(a.length - 1); b >= i; b--)         // выполнение итераций проверки условия
            {
                if (a[b-1] > a[b])  // если номер в предыдущей ячейке массива больше текущего, то меняем их местами, в противном случае продолжаем
                {
                    tmp = a[b];
                    a[b] = a[b - 1];
                    a[b - 1] = tmp;
                }
            }
        }

        for (int num : a) {             //foreach
            System.out.println(num);
        }
    }
}
