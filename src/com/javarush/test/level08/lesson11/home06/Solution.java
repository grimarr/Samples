package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args)
    {
        Human grandfather = new Human();
        Human grandmother = new Human();
        Human grandfather1 = new Human();
        Human grandmother1 = new Human();
        Human father = new Human();
        Human mother = new Human();
        Human kid1 = new Human();
        Human kid2 = new Human();
        Human kid3 = new Human();
        grandfather.name = "Дед";
        grandfather.sex = true;
        grandfather.age = 99;
        grandfather.children.add(father);
        grandmother.name = "Бабка";
        grandmother.sex = false;
        grandmother.age = 90;
        grandmother.children.add(father);
        grandfather1.name = "Дед";
        grandfather1.sex = true;
        grandfather1.age = 99;
        grandfather1.children.add(mother);
        grandmother1.name = "Бабка";
        grandmother1.sex = false;
        grandmother1.age = 90;
        grandmother1.children.add(mother);
        father.name = "Отец";
        father.sex = true;
        father.age = 50;
        father.children.add(kid1);
        father.children.add(kid2);
        father.children.add(kid3);
        mother.name = "Мать";
        mother.sex = false;
        mother.age = 50;
        mother.children.add(kid1);
        mother.children.add(kid2);
        mother.children.add(kid3);
        kid1.name = "Ребенок";
        kid1.sex = true;
        kid1.age = 20;
        kid2.name = "Ребенок2";
        kid2.sex = false;
        kid2.age = 5;
        kid3.name = "Ребенок3";
        kid3.sex = true;
        kid3.age = 2;
        ArrayList<Human> humans = new ArrayList<Human>();
        Collections.addAll(humans, grandfather,grandfather1,grandmother,grandmother1,father,mother,kid1,kid2,kid3);
        for (Human x : humans)
        System.out.println(x);
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
