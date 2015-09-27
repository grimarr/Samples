package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int[] bigArr = new int[20];
        int[] smArr0 = new int[bigArr.length/2];
        int[] smArr1 = new int[bigArr.length/2];

        for (int i = 0; i < bigArr.length; i++)
            bigArr[i] = Integer.parseInt(buff.readLine());
        for (int i = 0; i < smArr0.length; i++)
            smArr0[i] = bigArr[i];
        for (int i = smArr1.length, a = 0; i < bigArr.length; i++, a++)
            smArr1[a] = bigArr[i];
        for (int small : smArr1)
            System.out.println(small);
    }
}
