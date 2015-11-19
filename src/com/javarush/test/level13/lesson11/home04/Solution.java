package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        String fileName = buff.readLine();
        OutputStream outputStream = new FileOutputStream(fileName);

        while (true)
        {
            String str = buff.readLine();
            for (char o : str.toCharArray())
                outputStream.write(o);
                outputStream.write(System.getProperty("line.separator").getBytes()); // ok..ok..ok..%)
            if (str.equals("exit"))
                break;
        }
        outputStream.close();
    }
}
