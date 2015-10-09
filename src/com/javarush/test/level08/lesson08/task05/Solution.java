package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

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
				put("0","11");
				put("1","aaa");
				put("2","1111");
				put("3","sss");
				put("4","1111");
				put("5","sss");
				put("6","a");
				put("7","1111");
				put("8","553");
				put("9","11");
			}};
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
		HashSet<String> set = new HashSet<String>();
		HashSet<String> set1 = new HashSet<String>();

		for (String value : map.values()) {
			if (!set1.add(value)) {
				set.add(value);
			}
		}
		for (String aSet : set) removeItemFromMapByValue(map, aSet);
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
