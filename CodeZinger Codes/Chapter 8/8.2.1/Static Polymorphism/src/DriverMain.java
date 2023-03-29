import java.util.Scanner;

public class DriverMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N1 = s.nextInt();
        int N2 = s.nextInt();
        int N3 = s.nextInt();
        ProblemSolution ps = new ProblemSolution();
        System.out.println(ps.solution(N1, N2));
        System.out.println(ps.solution(N1, N2, N3));
    }
}
