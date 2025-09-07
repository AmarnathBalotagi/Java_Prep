package Strings_ques;

import java.util.ArrayList;
import java.util.List;

public class reverse_words_in_Senetence {

	public static void main(String[] args) {
		
		String sen = " you never really knew me";
		
		 String [] strarr = sen.split(" ");
		 List <String>list = new ArrayList<>();
		 
		 for(String s : strarr) {
			 StringBuffer rev = new StringBuffer(s).reverse();
			  list.add(rev.toString());
			 
		 }
		 StringBuffer rev_Sen = new StringBuffer(sen).reverse();
		 System.out.println("Reverse of each word : "+list);
		 System.out.println("Senetence Reversed: "+rev_Sen);
		 

	}

}
