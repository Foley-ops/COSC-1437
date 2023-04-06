import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int principal = s.nextInt();
        float year = s.nextFloat();
        Bank bank = new Bank(principal, year);

        double simpleInterest = bank.simpleInterest();
        double compInterest = bank.compInterest();


        System.out.println(String.format("%.2f", simpleInterest));
        System.out.println(String.format("%.2f", compInterest));
    }
}