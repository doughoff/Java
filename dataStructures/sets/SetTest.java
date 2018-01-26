package dataStructures.sets;

import java.util.*;
import static dataStructures.SystemFontNames.*;
public class SetTest {
	public static void main(String[] args) {
		// create list and check size
		List<String> fonts;
		fonts = 
			new ArrayList<String>(fontList);
		System.out.printf("List has %d fonts %n", fonts.size());
		
		// add fonts names twice and check size
		fonts.addAll(fontList);
		System.out.printf("List now has %d fonts %n", 
				fonts.size());
		
		// transfer list to set and check size
		Set<String> fontSet =
				new HashSet<String>(fonts);
		System.out.printf("Set has %d fonts %n", fontSet.size());
		
		// query - select fonts with Arial in it
		for (String font : fontSet) {
			if (font.contains("Arial")) {
				System.out.println(font);
			}
		}
		// select Arial fonts with lambda
		Set<String> fontSet2 = new HashSet<String>(fontSet);
		System.out.println("---fontSet2 before Arial filter---");
		System.out.println(fontSet2);
		fontSet2.removeIf(font->!font.contains("Arial"));
		System.out.println("---fontSet2 after Arial filter---");
		System.out.println(fontSet2);
		
		// shuffle the List and show
		Collections.shuffle(fonts);
		System.out.println("---Shuffled ----------------");
		System.out.println(fonts);
		// put in TreeSet and show
		Set<String> orderedFonts = new TreeSet<String>(fonts);
		System.out.println("Ordered tree set-------------");
		System.out.println(orderedFonts);
		
		
		
		
		
		
		
	}
}
