import java.util.Optional;
import java.util.function.DoubleSupplier;
import java.util.function.Supplier;

import org.junit.Test;

public class SupplierTest {

	@Test
	public void supplier(){
		Supplier<Double> doubleSupplier1 = () -> Math.random();
		DoubleSupplier doubleSupplier2 = Math::random;

		System.out.println(doubleSupplier1.get());
		System.out.println(doubleSupplier2.getAsDouble());
	}

	@Test
	public void supplierWithOptional(){
		Supplier<Double> doubleSupplier = () -> Math.random();
		Optional<Double> optionalDouble = Optional.empty();
		System.out.println(optionalDouble.orElseGet(doubleSupplier));
	}

}
