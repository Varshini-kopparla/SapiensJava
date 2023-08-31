/*5.	Create three new types of exceptions. Write a class with a method 
 * that throws all three. In main( ), call the method but only use a single 
 * catch clause that will catch all three types of exceptions.*/

package Day3.Ques5;

public class MultiExceptionDemo {
	
	public void multiException() {
		try {
            performTask();
        } catch (TaskFailedException e) {
            System.out.println("Caught task failed exception: " + e.getMessage());
        }
    }
	
	public static void performTask() throws TaskFailedException {
        int choice = (int) (Math.random() * 3) + 1; // Randomly select an operation

        if (choice == 1) {
            throw new DatabaseException("Database connection failed.");
        } else if (choice == 2) {
            throw new NetworkException("Network error occurred.");
        } else {
            throw new PermissionException("Permission denied.");
        }
    }

}
