package main;
import model.*;

public class Example3 {
	//Builder design pattern
	public static void main(String[] args) {
		//with builder implemented by us
		Car car = new Car.Builder()
				.withColor("blue")
				.build();

		Car car2 = new Car.Builder()
				.withColor("white")
				.withPrice(15000)
				.build();

		Car car3 = new Car.Builder()
				.withColor("black")
				.withPrice(1000)
				.withModel("Toyota Corolla")
				.build();

		//with builder generated by Lombok
//		Equipment equipment = Equipment.builder()
//				.supplierName("Supplier")
//				.supplierCountry("USA")
//				.build();
	}
}
