import java.util.Scanner;
// Your program will be evaluated by this Main class and several test cases.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        int A[] = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = s.nextInt();
        }

        ProblemSolution problemSolution = new ProblemSolution();
        System.out.println(problemSolution.solution(A, N));
    }
}
public class ProblemSolution {
    public int solution(int[] A, int N) {

        //write code here
    }
}