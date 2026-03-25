package companies.interview.questions;
/******************************************************************************
String s = “Loveleen sharmaa haaas interview processes"
Write a Java program that processes each word in the string according to the following rules: 
1.If a word contains a vowel (a, e, i, o, u) that are each repeated 3 times or more, then replace the vowel with 0. 
2.If a word contains a consonant that are each repeated 3 times or more, then replace the consonants with 1. 
3.If a word has no repeated characters, then replace the word with 10.
*******************************************************************************/
public class WissenTech2 {
    public static void main(String[] args) {
        String s = "Loveleen sharmaa haaas interview processes";
        String p = updatedString(s);
        System.out.println("For a given string: " + s);
        System.out.println("The Updated string is: " + p);
    }
    public static String updatedString(String s) {
        String[] words = s.split(" ");
        StringBuilder finalResult = new StringBuilder();
        for (String word : words) {
            // 1. Track character frequencies
            int[] freq = new int[256];
            boolean hasRepeats = false;
            for (char c : word.toCharArray()) {
                freq[c]++;
                if (freq[c] > 1) hasRepeats = true;
            }
            // Rule 3: No repeated characters -> replace word with "10"
            if (!hasRepeats) {
                finalResult.append("10 ");
                continue;
            }
            // Rules 1 & 2: Check for characters repeated 3+ times
            StringBuilder updatedWord = new StringBuilder();
            String vowels = "aeiouAEIOU";
            for (char c : word.toCharArray()) {
                if (freq[c] >= 3) {
                    if (vowels.indexOf(c) != -1) {
                        updatedWord.append('0'); // Rule 1: Vowel repeated 3+ times
                    } else if (Character.isLetter(c)) {
                        updatedWord.append('1'); // Rule 2: Consonant repeated 3+ times
                    } else {
                        updatedWord.append(c);
                    }
                } else {
                    updatedWord.append(c);
                }
            }
            finalResult.append(updatedWord.toString()).append(" ");
        }
        return finalResult.toString().trim();
    }
}