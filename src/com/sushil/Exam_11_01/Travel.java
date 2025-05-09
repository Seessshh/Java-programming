package com.sushil.Exam_11_01;
import java.util.Scanner;

// Custom Exceptions
class InvalidPackageException extends RuntimeException {
    public InvalidPackageException(String message) {
        super(message);
    }
}

class InsufficientSeatsException extends Exception {
    public InsufficientSeatsException(String message) {
        super(message);
    }
}

// HolidayPackage Interface
interface HolidayPackage {
    void reserveSeats(int seats) throws InvalidPackageException, InsufficientSeatsException;
    int getAvailableSeats();
    String getPackageDetails();
}

// HolidayPackage Class
class HolidayPackageImpl implements HolidayPackage {
    private String packageName;
    private int totalSeats;
    private int availableSeats;

    public HolidayPackageImpl(String packageName, int totalSeats) {
        this.packageName = packageName;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
    }

    @Override
    public void reserveSeats(int seats) throws InvalidPackageException, InsufficientSeatsException {
        if (seats <= 0) {
            throw new InvalidPackageException("Invalid number of seats. Please enter a positive value.");
        }
        if (seats > availableSeats) {
            throw new InsufficientSeatsException("Insufficient seats available.");
        }
        availableSeats -= seats;
    }

    @Override
    public int getAvailableSeats() {
        return availableSeats;
    }

    @Override
    public String getPackageDetails() {
        return "Package Name: " + packageName + ", Available Seats: " + availableSeats;
    }
}

// Customer Class
class Customer {
    private String name;
    private HolidayPackage reservedPackage;

    public Customer(String name) {
        this.name = name;
    }

    public HolidayPackage getReservedPackage() {
        return reservedPackage;
    }

    public void reservePackage(HolidayPackage packageObj) {
        this.reservedPackage = packageObj;
    }
}

// ReservationSystem Class
public class Travel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HolidayPackageImpl pongalVillage = new HolidayPackageImpl("Pongal Village", 10);
        // Add more packages as needed

        Customer customer = new Customer("John Doe");

        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Reserve Seats");
            System.out.println("2. Check Package Details");
            System.out.println("3. Check Available Seats");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                choice = 0; // Reset choice for invalid input
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter the number of seats: ");
                    try {
                        int seats = Integer.parseInt(scanner.nextLine());
                        pongalVillage.reserveSeats(seats);
                        customer.reservePackage(pongalVillage);
                        System.out.println("Seats reserved successfully.");
                    } catch (InvalidPackageException | InsufficientSeatsException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    if (customer.getReservedPackage() != null) {
                        System.out.println(customer.getReservedPackage().getPackageDetails());
                    } else {
                        System.out.println("No package reserved yet.");
                    }
                    break;
                case 3:
                    System.out.println("Available Seats for Pongal Village: " + pongalVillage.getAvailableSeats());
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
