import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }

        int E = s.nextInt(); // Read the element to search

        ProblemSolution problemSolution = new ProblemSolution();
        System.out.println(problemSolution.solution(A, N, E));
    }
}

