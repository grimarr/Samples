package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        ArrayList<String>[] list = new ArrayList[3];
        list[0] = new ArrayList<String>();
        list[0].add("FFFFUUUUU");
        list[0].add("FUFUFUFUFUFFFUUU");
        list[1] = new ArrayList<String>();
        list[1].add("OMG!!1");
        list[1].add("OMMMMMG!1one");
        list[2] = new ArrayList<String>();
        list[2].add("WTF?!");
        list[2].add("WWWTFF??!?!??!?!");
        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}