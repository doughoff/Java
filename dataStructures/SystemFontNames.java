package dataStructures;

import java.awt.GraphicsEnvironment;
import java.util.*;

public class SystemFontNames {
	public static List<String> fontList;
	static {
		String[] fontNamesInSystemArray = 
				GraphicsEnvironment
				.getLocalGraphicsEnvironment()
				.getAvailableFontFamilyNames();
		SystemFontNames.fontList = Arrays.asList(fontNamesInSystemArray);
	}
	
}
