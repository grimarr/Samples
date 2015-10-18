package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
        if (Character.isAlphabetic(aS[0])) {
            aS[0] = Character.toUpperCase(aS[0]);
            for (int i = 1; i < aS.length; i++) {
                if (Character.isAlphabetic(aS[i]) && !Character.isAlphabetic(aS[i - 1]))
                    aS[i] =  Character.toUpperCase(aS[i]);
            }
        }
        else
            for (int i = 1; i < aS.length; i++) {
                if (Character.isAlphabetic(aS[i]) && !Character.isAlphabetic(aS[i - 1]))
                    aS[i] =   Character.toUpperCase(aS[i]);
            }

        System.out.println(new String (aS));
    }
}
