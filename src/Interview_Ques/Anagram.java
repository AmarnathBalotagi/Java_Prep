package Interview_Ques;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s = "Night";
		String s1 = "Thiny";
		
		char[] org_word = s.toLowerCase().toCharArray();
		char[] vali_word = s1.toLowerCase().toCharArray();
		Arrays.sort(org_word);
		Arrays.sort(vali_word);
		
		if (s.length()==s1.length()){
			for(int i=0;i<org_word.length;i++) {
				
				if(org_word[i]==vali_word[i]){
					
					continue;
				  }
				else {
					System.out.println(s +" & "+s1+ " are not anagram ");
					
				}
				
			}
			
			
		}
		else {
			System.out.println(s +" & "+s1+ " are not anagram ");}
		System.out.println(s +" & "+s1+ " are  anagram ");

	}

}
