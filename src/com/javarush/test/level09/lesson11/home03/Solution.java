package com.javarush.test.level09.lesson11.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Метод в try..catch
Вводить с клавиатуры числа. Код по чтению чисел с клавиатуры вынести в отдельный метод readData.
Обернуть все тело (весь код внутри readData, кроме объявления списка, где будут храниться числа и BufferedReader - а)
этого метода в try..catch.
Если пользователь ввёл какой-то текст, вместо ввода числа, то метод должен перехватить исключение и вывести
на экран все введенные числа в качестве результата.
Числа выводить с новой строки сохраняя порядок ввода.
*/

public class Solution
{
    public static void main(String[] args) throws IOException {
        readData();
    }

    public static void readData() throws IOException {
        BufferedReader a = new BufferedReader( new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<Integer>();

        for (;;)
        {
            try {
                list.add(Integer.parseInt(a.readLine()));
            }
            catch (NumberFormatException e) {
                break;
            }
        }
        for (int x : list)
            System.out.println(x);
    }
}
