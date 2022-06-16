package MVN_Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class working_with_Propertyfile {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./TestData/config.properties");
		Properties property=new Properties();
		property.load(fis);
		System.out.println(property.getProperty("URL"));
		

	}

}
