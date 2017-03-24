package data;

import java.util.*;

public class SystemPropertiesTest {
	public static void main(String[] args) {
		Properties systemProperties = System.getProperties();
		System.out.println(systemProperties);
		System.out.println("------------------------------------------");
		systemProperties.list(System.out);

	}
}
