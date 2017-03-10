package collections;

import java.util.*;

public class SystemProps {
	public static void main(String[] args) {
		Properties systemProperties = System.getProperties();
		System.out.println(systemProperties);
		System.out.println("------------------------------------------");
		systemProperties.list(System.out);

	}
}
