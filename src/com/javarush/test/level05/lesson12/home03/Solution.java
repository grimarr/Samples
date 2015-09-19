package com.javarush.test.level05.lesson12.home03;

/* Создай классы Dog, Cat, Mouse
Создай классы Dog, Cat, Mouse. Добавь по три поля в каждый класс, на твой выбор.
Создай объекты для героев мультика Том и Джерри. Так много, как только вспомнишь.
Пример:
Mouse jerryMouse = new Mouse(“Jerry”, 12 , 5), где 12 - высота в см, 5 - длина хвоста в см.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Mouse jerryMouse = new Mouse("Jerry", 12 , 5);
        Cat tomCat = new Cat("Tom", 65536, "grey");
        Mouse nibblesMouse = new Mouse("Nibbles", 8, 4);
        Cat butchCat = new Cat("Butch", 3, "black");
        Dog spykeDog = new Dog("Spyke", "Bulldog", "blue");
        Dog tykeDog = new Dog("Tyke", "Bulldog", "blue");
        Cat topsyCat = new Cat("Topsy", 0, "brown");

    }

    public static class Cat
    {
        String name;
        int died;
        String color;

        public Cat(String name, int died, String color)
        {
            this.name = name;
            this.died = died;
            this.color = color;
        }
    }
    public static class Dog
    {
        String name;
        String type;
        String color;

        public Dog(String name, String died, String color)
        {
            this.name = name;
            this.type = died;
            this.color = color;
        }
    }

    public static class Mouse
    {
        String name;
        int height;
        int tail;

        public Mouse(String name, int height, int tail)
        {
            this.name = name;
            this.height = height;
            this.tail = tail;
        }
    }
}
