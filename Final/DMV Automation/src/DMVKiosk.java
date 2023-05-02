import java.util.Scanner;

public class DMVKiosk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Obtain user input
        System.out.println("Enter your full name:");
        String name = scanner.nextLine();

        System.out.println("Enter your date of birth (yyyy-MM-dd):");
        String dateOfBirth = scanner.nextLine();

        System.out.println("Enter your ID number:");
        String idNumber = scanner.nextLine();

        System.out.println("Enter your current ID/license issue date (yyyy-MM-dd):");
        String oldIssueDate = scanner.nextLine();

        System.out.println("Enter your current ID/license expiration date (yyyy-MM-dd):");
        String oldExpirationDate = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Create a Person object with the user's input
        Person user = new Person(name, dateOfBirth, idNumber, oldIssueDate, oldExpirationDate);

        // Update user's ID number, issue date, and expiration date
        user.setIdNumber(user.generateNewIdNumber());
        user.updateIssueAndExpirationDates();

        // Print updated information
        System.out.println("\nUpdated ID/license information:");
        System.out.println(user.toString());
    }
}
