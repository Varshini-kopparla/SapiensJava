package Day1.Ques1;

import java.util.Scanner;

import Day1.Ques1.Ques2.E2MissingLetter;
import Day1.Ques1.Ques3.E3OrderStrings;
import Day1.Ques1.Ques4.E4WordCompletion;

public class Main {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Take choice of question to run
		System.out.println("Enter the question to run : ");
		int n = sc.nextInt();
		switch(n) {
		
		case 1:
			System.out.println("Bingo! Enter size of array and array elements ");
			int n1 = sc.nextInt();
			int[] arr = new int[n1];
			for (int i = 0; i<n1; i++) {
				arr[i]=sc.nextInt();
			}
			E1Bingo b = new E1Bingo();
			if (b.getResult(arr)== true)
				System.out.print("Bingo!");
			else
				System.out.println("There is no 9 in array");
			
			break;
		case 2:
			System.out.println("Enter letters: ");
			String n2 = sc.nextLine();
			String[] arr1 = new String[Integer.parseInt(n2)];
			for(int i=0;i<arr1.length;i++)
				arr1[i]=sc.nextLine();
			E2MissingLetter m = new E2MissingLetter();
			String result = m.MissingLettersTest(arr1);
			System.out.println(result);
			break;
		case 3:
			System.out.println("Enter a string :");
			String input = sc.nextLine();
			E3OrderStrings o = new E3OrderStrings();
			String sortedOutput = o.sortByWordLength(input);
	        System.out.println(sortedOutput);
	        break;
		case 4:
			E4WordCompletion w = new E4WordCompletion();
			System.out.println(w.canComplete("htrg", "heterogeneous")); 
	        System.out.println(w.canComplete("htrgs", "heterogeneous")); 
	        System.out.println(w.canComplete("htrgz", "heterogeneous"));
	        System.out.println(w.canComplete("hatrg", "heterogeneous")); 
	        break;
		
		default:
			System.out.println("Invalid Choice");
			
		}
		
		//sc.close();

	}



}
