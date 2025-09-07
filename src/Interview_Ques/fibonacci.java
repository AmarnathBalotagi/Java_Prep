package Interview_Ques;

public class fibonacci {

	public static void main(String[] args) {
		int num =10;
		int a=0,b=1;
		
		for(int i=0;i<num;i++) {
			 
			 System.out.print(a+" ");
			    int temp=a+b; a=b; b=temp;	
		}

	}
}
