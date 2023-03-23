package io.main;

import java.util.Scanner;

import io.exception.TooManyProductsException;
import io.model.Shop;
import io.service.NotificationService;
import io.service.ProductService;
import io.service.ShopService;

/*
    Exceptions -- try catch finally, throw, throws

            	Throwable

    	Error                  		Exception

StackOverflowError
VirtualMachineError
OutOfMemoryError

						RuntimeException        checked exceptions - checked at compile-time.

						NullPointerException,           IOException,
						IllegalArgumentException,       SqlException
						ArithmeticException
	 */

public class Main {

	/*TODO Add the following use cases to the application:
   - save the notifications in a file with the name notifications.txt, in a resources/notifications folder
   - create a folder for the notifications
  ==== create folder <folder name> ====
   - create a file for the notifications
   create file <filename>
   - delete the file
   delete notification file <filename>
   - view all notification files
   list <folder name>
   - view all notifications from a file
   view notifications <filename>
	 */
	public static void main(String[] args) {
		Shop shop = new Shop();
		ShopService shopService = new ShopService(new NotificationService());
		ProductService productService = new ProductService();

		Scanner scanner = new Scanner(System.in);

		addProduct(shop, productService, shopService, scanner);

	}

	public static void addProduct(Shop shop,
									ProductService productService,
									ShopService shopService,
									Scanner scanner) {
		while (true) {
			System.out.println("Please type one of the following commands: add, view or exit");
			String line = scanner.nextLine();
			switch (line) {
				case "add":
					System.out.println("Please choose a product type: ");
					String productType = scanner.nextLine();
					switch (productType) {
						case "bicycle": {
							System.out.println("Please specify the bicycle details: name/price/stock/model/limitedEdition/height");
							try {
								shopService.addProduct(shop, productService.buildBicycle(scanner.nextLine()));
							} catch (TooManyProductsException e) {
								System.out.println(e.getMessage());
								e.getStackTrace();
							} catch (NullPointerException e) {
								System.out.println("The reference does not exist, dummy");
							} catch (NumberFormatException | ArrayIndexOutOfBoundsException e) { //multi-catch
								System.out.println("Invalid inputs for product creation. The product was not added to the shop.");
							}
							break;
						}
						case "car": {
							System.out.println("Please specify the car details: " +
									"name/price/stock/model/limitedEdition/color/transmission/power/numberOfCylinders");
							shopService.addProduct(shop, productService.buildCar(scanner.nextLine()));
							break;
						}
						case "equipment": {
							System.out.println("Please specify the equipment details: name/price/stock/supplierName/supplierCountry");
							shopService.addProduct(shop, productService.buildEquipment(scanner.nextLine()));
							break;
						}
						default:
							System.out.println("This product type doesn't exist.");
					}
					break;
				case "view":
					shopService.printProductsDetails(shop);
					break;
				case "exit":
					System.out.println("Bye bye!");
					System.exit(0);
					break;
				default:
					System.out.println("This command doesn't exist.");
			}

		}
	}
}

