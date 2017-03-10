package collections;

import java.awt.GraphicsEnvironment;
import java.util.*;

public class FontNames {
	public static List<String> list;
	static {
		String[] fontNamesInSystemArray = 
				GraphicsEnvironment
				.getLocalGraphicsEnvironment()
				.getAvailableFontFamilyNames();
		FontNames.list = Arrays.asList(fontNamesInSystemArray);
	}
	
}
