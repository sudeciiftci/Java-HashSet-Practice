import java.util.HashSet;
import java.util.Scanner;

public class CarRentalSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashSet<String> cars = new HashSet<>();

        int option = 0;

        while (option != 6) {

            System.out.println("""
                    
                    ===== Car Rental System =====
                    1. Add car
                    2. Remove car
                    3. Check car
                    4. Show available cars
                    5. Count cars
                    6. Exit
                    """);

            System.out.print("Choose an option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {

                case 1: {

                    System.out.print("Enter license plate: ");
                    String plate = scanner.nextLine().toUpperCase();

                    if (plate.isEmpty()) {
                        System.out.println("License plate cannot be empty.");
                    } else {

                        boolean added = cars.add(plate);

                        if (added) {
                            System.out.println("Car added successfully.");
                        } else {
                            System.out.println("Car already exists.");
                        }
                    }

                    break;
                }

                case 2: {

                    System.out.print("Enter license plate: ");
                    String plate = scanner.nextLine().toUpperCase();

                    boolean removed = cars.remove(plate);

                    if (removed) {
                        System.out.println("Car removed successfully.");
                    } else {
                        System.out.println("Car not found.");
                    }

                    break;
                }

                case 3: {

                    System.out.print("Enter license plate: ");
                    String plate = scanner.nextLine().toUpperCase();

                    if (cars.contains(plate)) {
                        System.out.println("Car found.");
                    } else {
                        System.out.println("Car not found.");
                    }

                    break;
                }

                case 4: {

                    if (cars.isEmpty()) {
                        System.out.println("No cars are currently available.");
                    } else {

                        System.out.println("Available cars:");

                        for (String car : cars) {
                            System.out.println("- " + car);
                        }
                    }

                    break;
                }

                case 5: {

                    System.out.println("Total cars: " + cars.size());

                    break;
                }

                case 6: {

                    System.out.println("Exiting the system...");

                    break;
                }

                default:

                    System.out.println("Invalid option. Please choose a number between 1 and 6.");
            }
        }

        scanner.close();
    }
}