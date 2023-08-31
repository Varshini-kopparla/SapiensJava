/*4.	Create your own exception class using the extends keyword. 
 * Write a constructor for this class that takes a String argument and 
 * stores it inside the object with a String reference. Write a method 
 * that displays the stored String. Create a try-catch clause to exercise 
 * your new exception.*/

package Day3.Ques4;

public class UserDefinedExceptionDemo {

	public void userdefinedDemo() {
		// TODO Auto-generated method stub
		try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (UserDefinedDivideByZeroException e) {
            System.out.println("Caught custom exception: " + e.getMessage());
        }

	}

	private static int divide(int dividend, int divisor) throws UserDefinedDivideByZeroException {
		// TODO Auto-generated method stub
		if (divisor == 0) {
            throw new UserDefinedDivideByZeroException("Division by zero is not allowed.");
        }
        return dividend / divisor;
	}
	

}
