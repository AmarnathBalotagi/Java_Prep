package Strings_ques;

public class swapFirstandLastLetters {

	public static void main(String[] args) {
		String name = "AMAR";
		
		char[] ch = name.toCharArray();
		
		char temp = ch[0];
		ch[0]=ch[ch.length-1];
		ch[ch.length-1]=temp;
		
		String swapped =new String(ch);
		System.out.println("After Swapped: "+swapped);
	}

}
