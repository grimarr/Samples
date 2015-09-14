package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        int one = Integer.parseInt(buff.readLine()), two = Integer.parseInt(buff.readLine()), three = Integer.parseInt(buff.readLine());
        if ((one >= two && one <= three) || (one <= two && one>= three))
            System.out.println(one);
        else if ((two >=one && two <= three) || (two <= one && two >= three))
            System.out.println(two);
        else
            System.out.println(three);
    }
}
