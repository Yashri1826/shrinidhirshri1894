package MVN_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ReadPropertyFile {

	@Test
	public static String filereader(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/config.properties");
		Properties property=new Properties();
		property.load(fis);
		return property.getProperty(key);
		
		
	}
		

	

}
