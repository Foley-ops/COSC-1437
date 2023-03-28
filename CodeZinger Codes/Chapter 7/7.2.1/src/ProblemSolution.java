import java.util.*;
public class ProblemSolution{

    public static void main(String[] args){
        ProblemSolution problemSolution = new ProblemSolution();
        int result = problemSolution.solution();
        System.out.println(result);
    }
    public int solution() {
        Student student = new Student();
        return student.getNum();
    }
}
class Student {
    private int num;

    public int getNum() {
        return 10001; }
}