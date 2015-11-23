package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(buff.readLine()));
        List<Integer> stringList = new ArrayList<Integer>();
        List<Integer> list = new ArrayList<Integer>();
        String s;
        while ((s=reader.readLine())!=null)
            stringList.add(Integer.parseInt(s));

        Collections.sort(stringList);
        for (Integer x : stringList)
        if (x%2 == 0)
            list.add(x);
        for (Integer x : list)
        System.out.println(x);
        reader.close();

    }
}
