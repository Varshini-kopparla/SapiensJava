package Day1.Ques1.Ques2;



public class E2MissingLetter {
	
	public String MissingLettersTest(String[] arr) {
		int temp = arr[0].charAt(0) + 1;
		for (int i = 1; i < arr.length; i++, temp++)
		      if (arr[i].charAt(0) != temp)
		        return String.valueOf((char) temp);
		return "";
	}

}
