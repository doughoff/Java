package data;

import java.awt.GraphicsEnvironment;
import java.util.*;

public class SystemFontNames {
	public static List<String> list;
	static {
		String[] fontNamesInSystemArray = 
				GraphicsEnvironment
				.getLocalGraphicsEnvironment()
				.getAvailableFontFamilyNames();
		SystemFontNames.list = Arrays.asList(fontNamesInSystemArray);
	}
	
}
