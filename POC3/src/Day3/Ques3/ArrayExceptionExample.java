//3.	Write code to generate and catch an ArraylndexOutOfBoundsException.

package Day3.Ques3;

public class ArrayExceptionExample {

	public void arrayExceptionDemo() {
		
		int[] arr = { 1, 2, 3, 4, 5 };

        for (int i = 0; i <= arr.length; i++) {
            try {
                int value = arr[i]; // This might throw an ArrayIndexOutOfBoundsException
                System.out.println("Value at index " + i + ": " + value);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException is caught: " + e.getMessage());
            }
        }

	}

}
