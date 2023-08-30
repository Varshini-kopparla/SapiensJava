package Day2;
import java.text.SimpleDateFormat;
import java.util.*;

import Day2.Questions.SubClass;
import Day2.Questions.Ques10.E10FileRW;
import Day2.Questions.Ques2.SubClass2;
import Day2.Questions.Ques3.SubClass3;
import Day2.Questions.Ques4.E4Monkey;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//Take choice of question to run
		System.out.println("Enter the question to run : ");
		int n = sc.nextInt();
		switch(n) {
		
		case 1:
			System.out.println("Enter your choice for Square-1,Circle-2,Hexagon-3 : ");
			int choice = sc.nextInt();
			SubClass subClass = new SubClass(choice);
			subClass.start();
			break;
		case 2:
			System.out.println("Enter your choice 1 or 2 : ");
			int choice2 = sc.nextInt();
			SubClass2 subClass2 = new SubClass2(choice2);
			subClass2.start();
			break;
		case 3:
			System.out.println("Enter your choice Employee-1, Manager-2");
			int choice3= sc.nextInt();
			SubClass3 subClass3= new SubClass3(choice3);
			subClass3.start();
			break;
		case 4:
			System.out.println("Question 4 ");
			E4Monkey monkey = new E4Monkey();
	        monkey.jump();
	        monkey.bite();
	        break;
		case 5:
			System.out.println("Split a string at ':' ");
			String input = "Quote: The Quick brown fox jumps over a lazy dog";
	        String[] parts = input.split(":");
	        
	        for (String part : parts) {
	            System.out.println(part);
	        }
	        break;
		case 6:
			System.out.println("Length of the string ");
			String str = "SAPIENS TECHNOLOGIES";
			System.out.println(str.length());
			break;
		case 7:
			int pos = 0;
	        int neg = 0;
	        int odd = 0;
	        int even = 0;
	        int zero = 0;

			for(int i=0;i<=20;i++) {
				int n1 = sc.nextInt();
				if (n1 > 0) {
		            pos++;
		        } else if (n1 < 0) {
		            neg++;
		        } else {
		            zero++;
		        }

		        if (n1 % 2 == 0) {
		            even++;
		        } else {
		            odd++;
		        }
		           
			}
			sc.close();
			
			System.out.println("No.of positive numbers: " + pos);
	        System.out.println("No.of negative numbers: " + neg);
	        System.out.println("No.of odd numbers: " + odd);
	        System.out.println("No.of even numbers: " + even);
	        System.out.println("No.of 0s: " + zero);
	        break;
	        
		case 9:
			System.out.println("Date and time Question ");
			Date currentDate = new Date();
	        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	        String formattedDate = dateFormat.format(currentDate);
	        System.out.println("Current full date and time: " + formattedDate);
	        break;
	        
		case 10:
			String text = "The Quick Brown Fox Jumps Over a Lazy Dog.";
			E10FileRW ee = new E10FileRW();
			ee.fileReadWrite(text);
			break;
			
		default:  
			System.out.println("Invalid Choice");
		}	
		sc.close();

	}

}
