/*2.	Define an object reference and initialize it to null. Try to call 
 * a method through this reference. Now wrap the code in a try-catch
 *  clause to catch the exception.*/

package Day3.Ques2;

public class NullReferenceExample {

	@SuppressWarnings("null")
	public void nullreferenceDemo() {
		try {
            SomeClass obj = null; // Initializing reference to null
            obj.someMethod(); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
		
	}

}
