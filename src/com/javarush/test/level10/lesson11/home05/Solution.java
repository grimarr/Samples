package com.javarush.test.level10.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


/* Количество букв
Ввести с клавиатуры 10 строчек и подсчитать в них количество различных букв (для 33 букв алфавита).  Вывести результат на экран.
Пример вывода:
а 5
б 8
в 3
г 7
…
я 9
*/

public class Solution
{
    public static void main(String[] args)  throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        //ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        //создать список значений и занулить его
        ArrayList<Integer> values = new ArrayList<Integer>();
        for (int i = 0; i < alphabet.size(); i++)
            values.add(0);

        // для каждой записи строк изменить список значений
        for (String j : list)
            for (int i = 0; i < alphabet.size(); i++)
                values.set(i, values.get(i) + counts(j, alphabet.get(i)));

        for (int i = 0; i < alphabet.size(); i++) {
            System.out.println(alphabet.get(i) + " " + values.get(i));
        }

    }
        // метод счетчика соответсвия буквы в слове заданной букве
        public static int counts(String words, char check)
        {
            int count = 0;
            for (int i = 0; i < words.length(); i++)
                if(words.charAt(i) == check)
                    count++;
            return count;

    }

}
