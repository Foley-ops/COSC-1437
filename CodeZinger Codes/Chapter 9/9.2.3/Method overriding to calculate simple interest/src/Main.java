import java.util.Scanner;

abstract class Bank {
    abstract double calculateSimpleInterest(double amount, int years);
    public double calculateInterest(double amount, int time, double rate) {
        return amount * time * rate / 100;
    }
}
class BankA extends Bank {
    private static final double RATE = 10;

    @Override
    double calculateSimpleInterest(double amount, int time) {
        return calculateInterest(amount, time, RATE);
    }
}
class BankB extends Bank {
    private static final double RATE = 9;

    @Override
    double calculateSimpleInterest(double amount, int time) {
        return calculateInterest(amount, time, RATE);
    }
}
class BankC extends Bank {
    private static final double RATE = 7;

    @Override
    double calculateSimpleInterest(double amount, int time) {
        return calculateInterest(amount, time, RATE);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        double amount = s.nextDouble();
        int time = s.nextInt();
        s.close();

        Bank bank;
        switch (choice) {
            case 1:
                bank = new BankA();
                break;
            case 2:
                bank = new BankB();
                break;
            case 3:
                bank = new BankC();
                break;
            default:
                throw new IllegalArgumentException("Invalid choice");
        }

        double interest = bank.calculateSimpleInterest(amount, time);
        System.out.println(interest);
    }
}