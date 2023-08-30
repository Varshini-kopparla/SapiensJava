package Day2.Questions.Ques10;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E10FileRW {
	public static void fileReadWrite(String text) {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            writer.write(text);
            System.out.println("Text has been written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read from the file using BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader("output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read from file: " + line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		
	}

}
