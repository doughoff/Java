package dataStructures;

import java.awt.GraphicsEnvironment;
import java.util.*;

public class SystemFontNames {
	// use with: import static SystemFontNames.*
	static String[] fontNamesInSystemArray;
	static List<String> fontNamesAsList;
	static List<String> doubleFontNamesList;
	static {
		fontNamesInSystemArray = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		fontNamesAsList = Arrays.asList(fontNamesInSystemArray);
		doubleFontNamesList = new ArrayList<String>(fontNamesAsList);
		doubleFontNamesList.addAll(fontNamesAsList);
	}

	public static void main(String[] args) {
//		System.out.println(fontNamesAsList);
		ListIterator<String> fontNamesIterator = fontNamesAsList.listIterator();
		while (fontNamesIterator.hasNext()) {
			System.out.printf("Font #%d: %s%n", fontNamesIterator.nextIndex() + 1, fontNamesIterator.next());

		}
		System.out.println("Double font list has " + doubleFontNamesList.size());
	}

}
