import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.junit.Test;

public class PredicateTest {

	@Test
	public void testPredicate(){
		List<String> names = Arrays.asList("John", "Smith", "Samueal", "Catley", "Sie");
		Predicate<String> nameStartsWithS = str -> str.startsWith("S");
		List<String> result = names.stream().filter(nameStartsWithS).toList();
		result.forEach(System.out::println);
	}

	@Test
	public void testPredicateAndComposition(){
		List<String> names = Arrays.asList("John", "Smith", "Samueal", "Catley", "Sie");
		Predicate<String> startPredicate = str -> str.startsWith("S");
		Predicate<String> lengthPredicate = str -> str.length() >= 5;
		names.stream().filter(startPredicate.and(lengthPredicate)).forEach(System.out::println);
	}

}
