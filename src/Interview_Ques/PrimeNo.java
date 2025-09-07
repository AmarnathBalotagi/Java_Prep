package Interview_Ques;

public class PrimeNo {

	public static void main(String[] args) {

		int num=247;
		boolean isPrimec=true;
		if (num<=1) {isPrimec=false;}
		else {
		for(int i=2; i<num/2;i++) {
			if(num%i==0) {isPrimec=false; break;}
			
				}
		}
		if(isPrimec)System.out.println(num +" is a Prime No");
		else {System.out.println(num +" is a not Prime No");}
	}

}
