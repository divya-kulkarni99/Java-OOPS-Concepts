import java.util.List;

public class Student {
    String studentName;
    int NUID;
    List<Integer> quizScores;

    public Student(String studentName, int NUID, List<Integer> quizScores) {
        this.studentName = studentName;
        this.NUID = NUID;
        this. quizScores =  quizScores;;
    }

    public String getName() {
        return studentName;
    }

    public int getNUID() {
        return NUID;
    }

    public List<Integer> getQuizScore() {
        return quizScores;
    }

}
