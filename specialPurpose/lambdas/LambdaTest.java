package specialPurpose.lambdas;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LambdaTest {
	static int sum = 0;
	static String concat = "";
	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(1, 2, 3);
		ints.forEach((i) -> sum += i);
		ints.forEach( i  -> {sum += i;});
		System.out.println(sum);
		
		ArrayList<String> strings = new ArrayList(Arrays.asList("a", "b", "c"));
		strings.forEach(string -> concat += string);
		System.out.println(concat);
		
		Predicate<String> itHasB = 
				stringToTest -> (stringToTest.toLowerCase().contains("b"));
		
		List<String> filteredStrings = strings
				.stream()
				.filter(itHasB)
				.collect(Collectors.<String>toList());
		System.out.println(filteredStrings);
		
		strings.removeIf(itHasB);
		System.out.println(strings);
	}
}
