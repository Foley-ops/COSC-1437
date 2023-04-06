import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int principle = s.nextInt();
        float year = s.nextFloat();
        Interest bank = new Bank(principle, year);
        System.out.println(String.format("%.2f", bank.simpleInterest()));
        System.out.println(String.format("%.2f", bank.compInterest()));
    }
}