package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        Map<String, Cat> map = new HashMap<String, Cat>();
        map.put("Ivan", new Cat("Ivan"));
        map.put("Basilio", new Cat("Basilio"));
        map.put("Sven", new Cat("Sven"));
        map.put("Ule", new Cat("Ule"));
        map.put("Geir", new Cat("Geir"));
        map.put("Stein", new Cat("Stein"));
        map.put("Fluffy", new Cat("Fluffy"));
        map.put("Magnus", new Cat("Magnus"));
        map.put("Olaf", new Cat("Olaf"));
        map.put("Brygge", new Cat("Brygge"));
        return  map;


    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        Set<Cat> catSet = new HashSet<Cat>(map.values());
        return catSet;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
