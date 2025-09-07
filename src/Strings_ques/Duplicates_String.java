package Strings_ques;

import java.util.HashMap;
import java.util.Map;

public class Duplicates_String {

	public static void main(String[] args) {
		String s = "java is fun and java is powerful is is java is";
		String [] str = s.split(" ");
		Map <String,Integer>map= new HashMap<>();
		for (String m : str) {
			map.put(m, map.getOrDefault(m, 0)+1);
			
		}
		String Nodup="";
		for (Map.Entry<String, Integer> entry:map.entrySet()) {
		
			if(entry.getValue()<2) {
				
				Nodup = Nodup+entry.getKey()+"  ";
			}
			else {System.out.println("these are duplicates : "+entry.getKey()+" repeated "+entry.getValue()+" Times");}
		}
		System.out.println(Nodup);
	
	}

}
