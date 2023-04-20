import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int order = s.nextInt();
        int N = s.nextInt();

        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }

        ProblemSolution problemSolution = new ProblemSolution();
        int[] sortedArray = problemSolution.solution(A, N, order);

        for (int num : sortedArray) {
            System.out.print(num + " ");
        }
    }
}