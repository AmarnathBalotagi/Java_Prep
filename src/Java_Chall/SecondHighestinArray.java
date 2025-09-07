package Java_Chall;

import java.util.Arrays;
import java.util.Iterator;

public class SecondHighestinArray {

	public static void main(String[] args) {
		int [] arr = {3,12,5,9,15,18,22,44,33,7899,7899};
		int fmax =arr[0];
		int smax =arr[0];
		for(int i :arr) {
			if (i>fmax) {
				smax=fmax;
				fmax=i;
		
			}
			else if (i>smax && i!=fmax) {
				smax=i;
				
			}
			
		}
		
System.out.println("First max : "+fmax);
System.out.println("Second max : "+smax);
	}

}
