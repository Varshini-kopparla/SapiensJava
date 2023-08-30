package Day1.Ques1;


public class E1Bingo {
	
	public boolean getResult(int[] arr) {
		boolean ans = false;
		for (int i = 0; i < arr.length; i++) {
		    if (arr[i] == 9) {
		        ans = true;
		        break;
		    }
		}
		return ans;
	}

}
