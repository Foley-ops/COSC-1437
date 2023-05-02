import java.util.Scanner;

// Custom exception classes
class TooColdException extends Exception {
    public TooColdException(String message) {
        super(message);
    }
}

class TooHotException extends Exception {
    public TooHotException(String message) {
        super(message);
    }
}

// Customer class
public class Customer {

    public int giveCupOfCoffee(int temperature) throws TooColdException, TooHotException {
        if (temperature < 35) {
            throw new TooColdException("Too Cold");
        } else if (temperature > 60) {
            throw new TooHotException("Too Hot");
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Customer customer = new Customer();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the coffee temperature: ");
        int temperature = scanner.nextInt();

        try {
            int result = customer.giveCupOfCoffee(temperature);
            System.out.println(result);
        } catch (TooColdException e) {
            System.out.println(e.getMessage());
        } catch (TooHotException e) {
            System.out.println(e.getMessage());
        }
    }
}
