package io.main;

import java.io.IOException;
import java.util.Scanner;

import io.exception.TooManyProductsException;
import io.model.Car;
import io.model.Product;
import io.model.Shop;
import io.model.Vehicle;
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
		NotificationService notificationService = new NotificationService();
		ShopService shopService = new ShopService(notificationService);
		ProductService productService = new ProductService();

		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Please type one of the following commands: add, view, view notifications, create folder etc. or exit");
			String line = scanner.nextLine();
			switch (line) {
				case "add": {
					addProduct(shop, productService, shopService, scanner);
					break;
				}
				case "view": {
					shopService.printProductsDetails(shop);
					break;
				}
				case "exit": {
					System.out.println("Bye bye!");
					System.exit(0);
					break;
				}
				case "create folder": {
					System.out.println("Please provide the folder name:");
					String folderName = scanner.nextLine();
					try {
						notificationService.createFolder(folderName);
					} catch (IOException e) {
						System.out.println("Cannot create folder with name " + folderName);
					}
					break;
				}
				case "create file": {
					System.out.println("Please provide the file name:");
					String fileName = scanner.nextLine();
					try {
						notificationService.createFile(fileName);
					} catch (IOException e) {
						System.out.println("Cannot create file with name " + fileName);
					}
					break;
				}
				case "delete file": {
					System.out.println("Please provide the file name to be deleted:");
					String fileName = scanner.nextLine();
					try {
						notificationService.deleteFile(fileName);
					} catch (IOException e) {
						System.out.println("Cannot delete file with name " + fileName);
					}
					break;
				}
				case "list": {
					System.out.println("Please provide the folder name:");
					String folderName = scanner.nextLine();
					try {
						notificationService.listFolder(folderName);
					} catch (IOException e) {
						System.out.println("Cannot list files from folder with name " + folderName);
					}
					break;
				}
				case "view notifications":
					notificationService.viewNotifications(scanner.nextLine());
					break;
				default:
					System.out.println("This command doesn't exist.");
			}
		}
	}

	private static void addProduct(Shop shop,
			ProductService productService,
			ShopService shopService,
			Scanner scanner) {
		System.out.println("Please choose a product type: ");
		String productType = scanner.nextLine();
		switch (productType) {
			case "bicycle": {
				System.out.println("Please specify the bicycle details: name/price/stock/model/limitedEdition/height");
				try {
					Product product = productService.buildBicycle(scanner.nextLine());
					shopService.addProduct(shop, product);
				} catch (NumberFormatException e) { //multi-catch: catch(NumberFormatException | ArrayIndexOutOfBoundsException e)
					System.out.println("Invalid inputs for product creation. The product was not added to the shop.");
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Not enough inputs for product creation. The product was not added to the shop.");
				} catch (TooManyProductsException e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			case "car": {
				System.out.println("Please specify the car details: " +
						"name/price/stock/model/limitedEdition/color/transmission/power/numberOfCylinders");
				try {
					Product product = productService.buildCar(scanner.nextLine());
					shopService.addProduct(shop, product);
				} catch (NumberFormatException e) { //multi-catch: catch(NumberFormatException | ArrayIndexOutOfBoundsException e)
					System.out.println("Invalid inputs for product creation. The product was not added to the shop.");
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Not enough inputs for product creation. The product was not added to the shop.");
				} catch (TooManyProductsException e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			case "equipment": {
				System.out.println("Please specify the equipment details: name/price/stock/supplierName/supplierCountry");
				try {
					Product product = productService.buildEquipment(scanner.nextLine());
					shopService.addProduct(shop, product);
				} catch (NumberFormatException e) { //multi-catch: catch(NumberFormatException | ArrayIndexOutOfBoundsException e)
					System.out.println("Invalid inputs for product creation. The product was not added to the shop.");
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("Not enough inputs for product creation. The product was not added to the shop.");
				} catch (TooManyProductsException e) {
					System.out.println(e.getMessage());
				}
				break;
			}
			default:
				System.out.println("This product type doesn't exist.");
		}
	}
}

