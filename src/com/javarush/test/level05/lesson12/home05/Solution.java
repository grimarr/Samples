package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/
import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String i;
        int a = 0, b;
            while (true)
            {
                i = buff.readLine();
                if (i.equals("сумма")) break;
                b = Integer.parseInt(i); // вызовет ошибку если поставить перед проверкой на "сумма"
                a = a + b;
            }
        System.out.println(a);
    }
}
