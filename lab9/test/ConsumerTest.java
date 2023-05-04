import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

import org.junit.Test;

public class ConsumerTest {

	@Test
	public void whenNamesPresentConsumeAll(){
		Consumer<String> printConsumer = t -> System.out.println(t);
		Stream<String> cities = Stream.of("Sydney", "Dhaka", "New York", "London");
		cities.forEach(printConsumer);
	}

	@Test
	public void whenNamesPresentUseBothConsumer(){
		List<String> cities = Arrays.asList("Sydney", "Dhaka", "New York", "London");

		Consumer<List<String>> upperCaseConsumer = list -> {
			for(int i=0; i< list.size(); i++){
				list.set(i, list.get(i).toUpperCase());
			}
		};
		Consumer<List<String>> printConsumer = list -> list.stream().forEach(System.out::println);

		upperCaseConsumer.andThen(printConsumer).accept(cities);
	}

}
