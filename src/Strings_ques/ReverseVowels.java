package Strings_ques;

public class ReverseVowels {
    public static void main(String[] args) {
        String str = "StringBuilder";
        char[] arr = str.toCharArray();

        int i = 0, j = arr.length - 1;
        String vowels = "AEIOUaeiou";

        while (i < j) {
            // move i forward until we find a vowel
            while (i < j && vowels.indexOf(arr[i]) == -1) {
                i++;
            }
            // move j backward until we find a vowel
            while (i < j && vowels.indexOf(arr[j]) == -1) {
                j--;
            }

            // swap vowels at i and j
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        System.out.println("After reversing vowels: " + new String(arr));
    }
}

