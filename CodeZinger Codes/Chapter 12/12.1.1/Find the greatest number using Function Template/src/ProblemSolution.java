public class ProblemSolution {
    public <T extends Comparable<T>> T solution(T N1, T N2) {
        // Return the greater value
        return (N1.compareTo(N2) > 0) ? N1 : N2;
    }
}