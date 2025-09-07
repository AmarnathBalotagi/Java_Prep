package Java_Chall;

import java.util.Iterator;

public class Higest_LowestinArray {

	public static void main(String[] args) {
		int [] arr = {12,2,6,8,13,18,422};
		int max = arr[0];
		int min = arr[0];
		for (int i :arr) {
			if(i>max) {max=i;}
			if(i<min) {min=i;}
		}
		
		System.out.println(max);
		System.out.println(min);
	
		
		

	}

}
