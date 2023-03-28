import java.util.Scanner;
import java.text.NumberFormat;

public class FutureValueApp {

    @SuppressWarnings("resource")
	public static void main(String[] args) {
        System.out.println("The Future Value Calculator\n");
        Scanner sc = new Scanner(System.in);

        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            System.out.print("Enter monthly investment:   ");
            double monthlyInvestment = Double.parseDouble(sc.nextLine());
            System.out.print("Enter yearly interest rate: ");
            double interestRate = Double.parseDouble(sc.nextLine());
            System.out.print("Enter number of years:      ");
            int years = Integer.parseInt(sc.nextLine());

            // convert yearly values to monthly values
            double monthlyInterestRate = interestRate / 12 / 100;
            int months = years * 12;

            // calculate the future value
            double futureValue = 0.0;
            for (int i = 1; i <= months; i++) {
                futureValue = (futureValue + monthlyInvestment) * 
                              (1 + monthlyInterestRate);
            }

            // format the result and display it to the user
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            System.out.println("Future value:               "
                    + currency.format(futureValue));
            System.out.println();

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        System.out.println("Bye!");
    }
}