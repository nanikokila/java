package com.app.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharacterString {

	public void duplicateString(String str)
	{
		Map<Character,Integer> dupMap = new HashMap<Character, Integer>();
		char[] ch = str.toCharArray();
		for(Character c:ch)
		{
			if(dupMap.containsKey(c))
			{
				dupMap.put(c, dupMap.get(c)+1);
			}
			else
			{
				dupMap.put(c, 1);
			}
		}
		
		Set<Character> keys = dupMap.keySet();
		for(Character c: keys)
		{
			if(dupMap.get(c)>1)
			{
				System.out.println(c+" is "+dupMap.get(c)+"times");
			}
		}
	}
	public static void main(String[] args) {

		DuplicateCharacterString dp = new DuplicateCharacterString();
		dp.duplicateString("I love you Ramya");
	}

}
