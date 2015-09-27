package com.javarush.test.level07.lesson06.task01;

import java.util.ArrayList;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        ArrayList<String> lst = new ArrayList<String>();
        lst.add(0, "ololo");
        lst.add(1, "loooool");
        lst.add(2, "omfg");
        lst.add(3, "deeeergod");
        lst.add(4, "Wooow");

        System.out.println(lst.size());

        for (int i = 0; i < 5; i++)
            System.out.println(lst.get(i));
    }
}
