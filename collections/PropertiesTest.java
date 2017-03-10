package collections;

import java.io.*;
import java.util.*;

public class PropertiesTest {
	public static void main(String[] args) {
		Properties file = new Properties();

		try {
			FileOutputStream propsOutputStream = 
					new FileOutputStream("test.properties");
			FileInputStream joesInputStream = 
					new FileInputStream("test.properties");
			// store properties with setProperty
			file.setProperty("prompt.1", "Do you like Friday?");
			file.setProperty("prompt.2", "Would you want a daily action?");
			file.setProperty("prompt.3", "Enter your name:");

			// save properties file with comments at top.
			file.store(propsOutputStream, "Prompts for some app...");
			// show content
			System.out.println(file);
			// load properties file
			file.load(joesInputStream);
			// unformatted output
			System.out.println(file);
			// formatted output
			file.list(System.out);
			// get property
			String s = file.getProperty("prompt.3");
			System.out.println(s);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
