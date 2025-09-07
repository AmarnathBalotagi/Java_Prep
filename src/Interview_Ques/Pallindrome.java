package Interview_Ques;

public class Pallindrome {

	public static void main(String[] args) {
		int num = 24542;
		int reverse = 0;
		int temp = num;
			
		while(temp>0) {
		
			reverse = reverse*10+temp%10;
					temp = temp/10;
		}
		if(num==reverse) {System.out.println(num +" is a Palindrome");}
		else {System.out.println(num +" is  not Palindrome");}
	}

}
