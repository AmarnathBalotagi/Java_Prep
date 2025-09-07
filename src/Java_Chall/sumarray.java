package Java_Chall;

import java.util.HashMap;
import java.util.Map;

public class sumarray {

	public static void main(String[] args) {
		int[] arr = {-5, 6, 7, 8, 9, 20, 11, 4};
		
		int sum = 15;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				int go =arr[i]+arr[j];
					if(go==sum) {
						System.out.println(arr[i] +" & "+arr[j]+" is equal to "+sum);
					}
				
				
			}
			
			
		}
		Map<Integer, Integer> map = new HashMap<>();
		for (int k = 0; k < arr.length; k++) {
			int value = sum-arr[k];
			if (map.containsKey(value)) {
				System.out.println(arr[k]+" "+value);
			}
			map.put(arr[k], k);
		}

	}

}
