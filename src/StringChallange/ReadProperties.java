package StringChallange;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	public static void main(String[] args) throws IOException {
		
		
		
		Properties prop = new Properties();
		
		FileInputStream fis = new FileInputStream("D:\\eclipse-workspace\\JavaProgram\\src\\config.properties");
		
		prop.load(fis);

		System.out.println("Base URL: " + prop.getProperty("url"));
		System.out.println("uesrname:"+prop.getProperty("username"));
	}
}
