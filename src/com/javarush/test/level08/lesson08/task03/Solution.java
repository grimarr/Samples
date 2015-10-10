package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("1", "Иванов");
        map.put("2", "Иванов");
        map.put("3", "Зелинский");
        map.put("4", "Иван0");
        map.put("5", "Плескачевский");
        map.put("6", "Иван0");
        map.put("7", "Угольников");
        map.put("8", "Барсук");
        map.put("9", "Степанов");
        map.put("Зепп", "Бренниган");
    return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int counter = 0;

        for (Map.Entry<String, String> pair : map.entrySet())
        {
            if (name.equals(pair.getValue()))
                counter++;
        }
        return counter;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int counter = 0;

        if (map.containsKey(familiya))
                counter++;

        return counter;
    }
    public static void main(String[] args)
    {
        HashMap<String, String> map = createMap();
        getCountTheSameFirstName(map,"a");
        getCountTheSameLastName(map,"1");
    }
}
