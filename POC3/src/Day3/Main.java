package Day3;

import java.util.Scanner;

import Day3.Ques1.Q1ExceptionExample;
import Day3.Ques2.NullReferenceExample;
import Day3.Ques3.ArrayExceptionExample;
import Day3.Ques4.UserDefinedExceptionDemo;
import Day3.Ques5.MultiExceptionDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Question number: ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			Q1ExceptionExample q1exceptionExample = new Q1ExceptionExample();
			q1exceptionExample.exceptionDemo();
			break;
		case 2:
			NullReferenceExample nullref = new NullReferenceExample();
			nullref.nullreferenceDemo();
		case 3:
			ArrayExceptionExample arrayExceptionExample = new ArrayExceptionExample();
			arrayExceptionExample.arrayExceptionDemo();
			break;
		case 4:
			UserDefinedExceptionDemo userdefinedExceptiondemo = new UserDefinedExceptionDemo();
			userdefinedExceptiondemo.userdefinedDemo();
			break;
		case 5:
			MultiExceptionDemo multiExceptiondemo = new MultiExceptionDemo();
			multiExceptiondemo.multiException();
			break;
		default:
			System.out.println("Invalid Choice ");
		}

	}

}
