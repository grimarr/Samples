package com.javarush.test.level04.lesson16.home03;

import java.io.*;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int a = 0, b;
            while (true) {
                b = Integer.parseInt(buff.readLine());
                if (b == -1) {
                    a += b;
                    System.out.println(a);
                    break;
                }
                a += b;
            }
    }
}
