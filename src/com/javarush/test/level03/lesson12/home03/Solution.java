package com.javarush.test.level03.lesson12.home03;

/* Я буду зарабатывать $50 в час
Ввести с клавиатуры число n.
Вывести на экран надпись «Я буду зарабатывать $n в час».
Пример:
Я буду зарабатывать $50 в час
*/
import java.io.*;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
      BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String m = buff.readLine();
        int n = Integer.parseInt(m);
        System.out.println("Я буду зарабатывать $" + n + " в час");//напишите тут ваш код
    }
}