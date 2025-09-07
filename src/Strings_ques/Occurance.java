package Strings_ques;

import java.util.HashMap;
import java.util.Map;

public class Occurance {

	public static void main(String[] args) {
		String s = "pneumonoultramicroscopicsilicovolcanoconiosis";
		char[] ch = s.toCharArray();
		Map <Character,Integer> map = new HashMap<>();
		
		for(char c :ch) {
			map.put(c, map.getOrDefault(c,0)+1);
			
		}
		
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+ " Repeated "+entry.getValue()+" Times");
		}
		

	}

}
