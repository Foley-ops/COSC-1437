public class ProblemSolution {
    public int solution(int[] A, int N, int E) {
        int left = 0;
        int right = N - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (A[mid] == E) {
                return mid;
            }

            if (A[mid] < E) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Element not found
    }
}
