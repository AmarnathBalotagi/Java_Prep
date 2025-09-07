package Java_Chall;

public class asc_bubblesort {

	public static void main(String[] args) {
		int [] arr = {3,12,5,9,15,18,22,44,33,7899,7899};
		
		for(int i=0;i<arr.length;i++) {
			for (int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j]=temp;
				}
				
			}	
		}
		for(int x :arr) {System.out.print(x+"  ");}

	}

}
