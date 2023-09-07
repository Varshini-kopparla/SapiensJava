package SpringDemo.POC6;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CartFileStorage {
	
	private String filePath;
	
	public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void saveCartSummary(String summary) throws IOException {
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(summary);
        }
    }
    
    public String loadCartSummary() throws IOException {
        if (Files.exists(Paths.get(filePath))) {
            return new String(Files.readAllBytes(Paths.get(filePath)));
        }
        return "";
    }

}
