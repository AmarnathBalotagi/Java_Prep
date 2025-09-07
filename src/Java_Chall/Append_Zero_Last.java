package Java_Chall;

public class Append_Zero_Last {
	public static void main(String[] args) {
		
	
	int[] arr = {1, 5, 0, 3, 0, 2, 0, 0};
	int m=0;
	int n=arr.length-1;
	int[] a1 = new int[arr.length];
	for (int i=0; i < arr.length;i++) {
		if ( arr[i]!=0) {
			a1[m]=arr[i];
			m++;
		}
		else {
			a1[n]=arr[i];
			n--;
		}
	}
	for (int y :a1) {System.out.print(y +" ");}

	}
	}
