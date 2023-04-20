public class ProblemSolution {
    public int[] solution(int[] A, int N, int order) {
        for (int i = 1; i < N; i++) {
            int key = A[i];
            int j = i - 1;

            if (order == 0) { // Ascending order
                while (j >= 0 && A[j] > key) {
                    A[j + 1] = A[j];
                    j = j - 1;
                }
            } else { // Descending order
                while (j >= 0 && A[j] < key) {
                    A[j + 1] = A[j];
                    j = j - 1;
                }
            }
            A[j + 1] = key;
        }
        return A;
    }
}
