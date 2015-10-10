package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("1", new Date("JUNE 1 1980"));
        map.put("2", new Date("JUNE 1 1980"));
        map.put("3", new Date("JUNE 1 1980"));
        map.put("4", new Date("JUNE 1 1980"));
        map.put("5", new Date("JUNE 1 1980"));
        map.put("6", new Date("JUNE 1 1980"));
        map.put("7", new Date("JUNE 1 1980"));
        map.put("8", new Date("JUNE 1 1980"));
        map.put("9", new Date("JUNE 1 1980"));

        return map;
    }
    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        for (Map.Entry<String, Date> pair : map.entrySet())

            if (pair.getValue().getMonth() > 5 && pair.getValue().getMonth() < 9)
                map.remove(pair.getValue());

    }
}
