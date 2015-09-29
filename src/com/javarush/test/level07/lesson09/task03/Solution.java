package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> words = new ArrayList<String>();
        Collections.addAll(words, "мама", "мыла", "раму");
        for (int i = 1; i <= 5; i = i + 2)
            words.add(i, "именно");
        for (String x : words)
            System.out.println(x);
    }
}
