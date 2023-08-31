/* 1.	Create a class with a main( ) that throws an object of class Exception 
 * inside a try block. Give the constructor for Exception a String argument. 
 * Catch the exception inside a catch clause and print the String argument. 
 * Add a finally clause and print a message to prove you were there*/

package Day3.Ques1;

public class Q1ExceptionExample {
	
	public void exceptionDemo() {
		
        try {
            throw new CustomException("This is a custom exception.");
        } catch (CustomException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }
    }

}
