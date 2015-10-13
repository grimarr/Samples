package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char[] aS = s.toCharArray();
            for (int i = 0; i < aS.length;)
                if (Character.isAlphabetic(aS[i])){
                    aS[i] = Character.toUpperCase(aS[i]);

                            for (int o = i; o < aS.length; )
                                if (Character.isAlphabetic(aS[o]))
                                {o++; i = o;}
                                else {
                                    i = o;
                                    break;
                                }
                }
                else i++;

        System.out.println(new String (aS));
    }
}



