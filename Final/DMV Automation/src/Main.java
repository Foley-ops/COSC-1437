import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Please enter full name: ");
        String name = s.nextLine();

        System.out.println("Please enter your current address: ");
        String address = s.nextLine();

        System.out.println("Please enter current issue date on ID (dd/MM/yyyy): ");
        String issueDate = s.nextLine();

        System.out.println("Please enter current ID number: ");
        int oldIDNum = s.nextInt();

        // need to add class for customer
        // need to make loop for ID number generation
    }
}