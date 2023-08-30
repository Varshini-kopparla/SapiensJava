package Day1.Ques1.Ques3;

import java.util.Arrays;
import java.util.Comparator;

public class E3OrderStrings {
	public String sortByWordLength(String input) {
        String[] words = input.split(" ");
        
        Arrays.sort(words, Comparator.comparingInt(String::length).thenComparing(String::compareTo));
        
        return String.join(" ", words);
    }

}
