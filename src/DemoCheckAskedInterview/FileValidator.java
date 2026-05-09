package DemoCheckAskedInterview;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileValidator {

	public static void main(String[] args) {
		String filePath = "input.txt";

		
		
		try {
			
			// Read the file line by line
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			
			String line;
			
			int lineNumber = 1;

			while ((line = reader.readLine()) != null) {
				System.out.println("Line " + lineNumber + ": " + line);

				// Validate: Check if the line contains the word "Selenium"
				if (line.contains("Selenium")) {
				
				System.out.println("   ✅ Found 'Selenium' on line " + lineNumber);
				
				}

				lineNumber++;
			}

			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
