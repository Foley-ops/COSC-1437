import java.util.Scanner;

abstract class Shape {
    abstract void printArea(int n);
}
class Square extends Shape {
    void printArea(int n) {
        int area = n * n;
        System.out.println(area);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        s.close();

        Shape square = new Square();
        square.printArea(n);
    }
}