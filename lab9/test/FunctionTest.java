import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.Test;

public class FunctionTest {

	@Test
	public void testFunctions(){
		List<String> names = Arrays.asList("Smith", "Gourav", "Heather", "John", "Catania");
		Function<String, Integer> nameMappingFunction = String::length;
		List<Integer> nameLength = names.stream().map(nameMappingFunction).collect(Collectors.toList());
		System.out.println(nameLength);
	}

}
