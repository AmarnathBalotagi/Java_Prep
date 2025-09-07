package Interview_Ques;

public class Factorial {

	public static void main(String[] args) {
		int num = 5;
		int temp = num;
		int fact =1;
		while (temp>0) {
			fact = fact*temp;
			temp --;
			
		}
		System.out.println(fact +" is the factorial of "+num);
	}
		
	}


