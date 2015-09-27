package com.javarush.test.level07.lesson04.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Массив из чисел в обратном порядке
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Расположить элементы массива в обратном порядке.
4. Вывести результат на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));

        int[] array = new int[10];
        int tmp;
        int a = array.length;

        for (int i = 0; i < a; i++)
            array[i] = Integer.parseInt(buff.readLine());

        for (int i = 1; i <= (a/2); i++)
        {
            tmp = array[i - 1];
            array[i - 1] = array[a - i];
            array[a - i] = tmp;
        }

        for (int num : array)
            System.out.println(num);

    }
}
