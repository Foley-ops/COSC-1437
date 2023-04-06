import java.util.Scanner;

abstract class Bank {
    public double calculateSimpleInterest(double amount, int years) {
        return amount * years;
    }
}
class BankA extends Bank {

}
class BankB extends Bank {

}
class BankC extends Bank {

}
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

    }
}