package Java_Chall;

public class Reverse_Array {

	public static void main(String[] args) {
		int [] arr = {2,4,6,8,10};
		int [] Revarr =new int [arr.length];
		int j=0;
		for(int i=arr.length-1;i>=0;i--) {
			Revarr[j]=arr[i];
			System.out.print(Revarr[j]+" , ");
			j++;
		}
		
		
	

	}

}
