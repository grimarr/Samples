package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
				
	return new HashMap<String, String>() 
			{{
				put("0","1111");
				put("1","1111");
				put("2","1111");
				put("3","1111");
				put("4","1111");
				put("5","1111");
				put("6","1111");
				put("7","1111");
				put("8","553");
				put("9","11");
			}};
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
		HashMap<String, List<String>> reversed = new HashMap<String, List<String>>();
				
		for(Map.Entry<String, String> pair : map.entrySet()){
			reversed.put(pair.getValue(), new ArrayList<String>(Arrays.asList(pair.getKey()))); // ошибка вот тут в заполнении листа
		}
        System.out.println(reversed);
        HashMap<String, List<String>> copy = new HashMap<String, List<String>>(reversed);

		for(Map.Entry<String, List<String>> pairCopy : copy.entrySet())
		{
			if (pairCopy.getValue().size() > 1)
			reversed.remove(pairCopy.getKey());
		}
		map.clear();
		for(Map.Entry<String, List<String>> pairSort : reversed.entrySet()){
		map.put(pairSort.getValue().toString(), pairSort.getKey());
		}
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
	public static void main(String[] args)
	{
		HashMap<String, String> map = createMap();
		removeTheFirstNameDuplicates(map);
		System.out.println(map);
	}
}
