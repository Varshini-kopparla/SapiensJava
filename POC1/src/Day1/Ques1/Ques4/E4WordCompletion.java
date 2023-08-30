package Day1.Ques1.Ques4;

public class E4WordCompletion {
	public boolean canComplete(String input, String word) {
        int inputIndex = 0; // Index to traverse the input string
        
        for (char ch : word.toCharArray()) {
            if (inputIndex < input.length() && ch == input.charAt(inputIndex)) {
                inputIndex++; // Move to the next character in the input string
            }
        }
        
        // If we have traversed the entire input string, it means we can complete the word
        return inputIndex == input.length();
    }

}
