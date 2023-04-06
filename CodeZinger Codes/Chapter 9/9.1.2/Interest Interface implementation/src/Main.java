import java.util.*;
interface Interest {
    static final double rate = 25;
    double simpleInterest();
    double compInterest();
}

class Bank implements Interest{
    private int principal;
    private float year;

    public Bank (int principal, float year) {
        this.principal = principal;
        this.year = year;
    }
    public double simpleInterest() {
        return principal * year * rate / 100;
    }
    public double compInterest() {
        return principal * Math.pow(( 1 + rate / 100 ), year) - principal;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int principal = s.nextInt();
        float year = s.nextFloat();
        Bank bank = new Bank(principal, year);
        System.out.println(String.format("%.2f", bank.simpleInterest()));
        System.out.println(String.format("%.2f", bank.compInterest()));
    }
}