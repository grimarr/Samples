package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;


/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом, каждая строка должна заканчиваться пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String string = bufferedReader.readLine();

        char[] chars = string.toCharArray();
        int countVow = 0;
        int i = 0;
        int j = 0;

        for (Character x: chars)
        {
            if (isVowel(x))
                countVow++;
        }
        char[] vows = new char[countVow*2];
        char[] oth = new char[(chars.length - countVow)*2];

        for (Character x: chars)
        {
            if (isVowel(x))
            {
                vows[i] = x;
                i++;
                vows[i] = ' ';
                i++;
            }
            else if (!Character.isWhitespace(x))
            {
                oth[j] = x;
                j++;
                oth[j] = ' ';
                j++;
            }

        }
            System.out.println(new String(vows));
            System.out.print(new String(oth));
    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);

        for (char d : vowels)
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
