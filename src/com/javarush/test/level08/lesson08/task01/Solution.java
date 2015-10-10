package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;
import java.util.Set;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        return new HashSet<String>(){{
            add("Лось0");
            add("Лось1");
            add("Лось2");
            add("Лось3");
            add("Лось4");
            add("Лось5");
            add("Лось6");
            add("Лось7");
            add("Лось8");
            add("Лось9");
            add("Лось10");
            add("Лось11");
            add("Лось12");
            add("Лось13");
            add("Лось14");
            add("Лось15");
            add("Лось16");
            add("Лось17");
            add("Лось18");
            add("Лось19");
        }};
    }
}
