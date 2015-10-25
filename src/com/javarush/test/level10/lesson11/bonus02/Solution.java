package com.javarush.test.level10.lesson11.bonus02;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит с клавиатуры пару (число и строку) и выводит их на экран.
Новая задача: Программа вводит с клавиатуры пары (число и строку), сохраняет их в HashMap.
Пустая строка – конец ввода данных. Числа могу повторяться. Строки всегда уникальны. Введенные данные не должны потеряться!
Затем программа выводит содержание HashMap на экран.

Пример ввода:
1
Мама
2
Рама
1
Мыла

Пример вывода:
1 Мама
2 Рама
1 Мыла
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, ArrayList<String>> mapa = new HashMap<Integer, ArrayList<String>>();

        //запускаем бесконечный цикл ввода пар
        for (;;) {
            String first = reader.readLine(); //ввод числа и проверка на пустоту
            if (first.isEmpty())
                break;
            String name = reader.readLine();
            int id = Integer.parseInt(first);

            // заполнение мапы
            if (!mapa.containsKey(id)) {
                ArrayList<String> ls = new ArrayList<String>();
                ls.add(name);
                mapa.put(id, ls);
            }
            else{
                ArrayList<String> ls = mapa.get(id);

                // проверка на уникальность строки
                if (!ls.contains(name)) {
                    ls.add(name);
                    mapa.put(id, ls);
                }
            }
        }

        // поиск самого длинного списка строк
        int i = 0;
        for (Map.Entry<Integer, ArrayList<String>> pair : mapa.entrySet())
            if (pair.getValue().size() > i)
                i = pair.getValue().size();

        // вывод мапы
        for (int x = 0;x < i; x++) {
            for (Map.Entry<Integer, ArrayList<String>> pair : mapa.entrySet()) {
                if (!pair.getValue().isEmpty()) {
                    System.out.println(pair.getKey() + " " + pair.getValue().get(0));
                    pair.getValue().remove(0);
                }
            }
        }
    }
}
