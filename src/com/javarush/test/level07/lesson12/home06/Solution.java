package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human).
Создай объекты и заполни их так, чтобы получилось:
Два дедушки, две бабушки, отец, мать, трое детей.
Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<Human> family = new ArrayList<>();

        Human grandpa1 = new Human("Семён", true, 99);
        Human grandpa2 = new Human("Лёша", true, 89);
        Human grandma1 = new Human("Алеся", false, 29);
        Human grandma2 = new Human("Дуня", false, 19);
        Human father = new Human("Семен", true, 49, grandpa1, grandma1);
        Human mother = new Human("Аня", false, 59, grandpa2, grandma2);
        Human man1 = new Human("Семен", true, 9,father, mother);
        Human man2 = new Human("Семен", true, 12, father, mother);
        Human man3 = new Human("Семен", true, 99);

        Collections.addAll(family, grandpa1, grandpa2, grandma1, grandma2, father, mother, man1, man2, man3);

        for (Human x : family)
            System.out.println(x);
    }

    static class Human
    {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        Human (String name, boolean sex, int age){
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        Human (String name, boolean sex, int age, Human father, Human mother)
        {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }


        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
