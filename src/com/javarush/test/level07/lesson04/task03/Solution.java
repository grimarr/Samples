package com.javarush.test.level07.lesson04.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 2 массива
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк,
индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
Вывести содержимое массива чисел на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        String[] str = new String[10];
        int[] lst = new int[10];

        for (int i = 0; i < str.length; i++)
            str[i] = buff.readLine();
        for (int i = 0; i < str.length; i++)
            lst[i] = str[i].length();
        for (int num : lst)
            System.out.println(num);

    }
}
