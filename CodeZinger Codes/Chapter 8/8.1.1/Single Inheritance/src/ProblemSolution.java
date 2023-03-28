import java.util.Scanner;

public class ProblemSolution extends Base {
    long solution(int N1, int N2) {
        int additionResult = addition(N1, N2);
        int subtractionResult = subtraction(N1, N2);
        return (long) additionResult * subtractionResult;
    }
}
class Base {
    public int addition(int N1, int N2) {
        return N1 + N2;
    }
    public int subtraction(int N1, int N2) {
        return N1 + N2;
    }
}
class DriverMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = scanner.nextInt();
        int N2 = scanner.nextInt();
        ProblemSolution ps = new ProblemSolution();
        System.out.println(ps.solution(N1,N2));
    }
}