package Java_Chall;

import java.util.HashMap;
import java.util.Map;

public class Num_Occurance {

	public static void main(String[] args) {
	int [] arr = {2,3,3,5,8,4,9,2,14,16,14,17,11,16,11};
	Map <Integer,Integer> map = new HashMap<>();
	   for (int x :arr) {
		   map.put(x,map.getOrDefault(x, 0)+1);
	   }
	   for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+ " Repeated "+entry.getValue()+" Times");
		}
	

	}

}
