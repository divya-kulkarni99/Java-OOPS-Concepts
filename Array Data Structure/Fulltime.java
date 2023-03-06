import java.util.List;

public class Fulltime extends Student {
    //List for extra scores
    public List<Integer> extraExamScores;

    public Fulltime(String studentName, int NUID, List<Integer> quizScores, List<Integer> extraExamScores) {
        super(studentName, NUID, quizScores);
        this.extraExamScores = extraExamScores;
    }

    public List<Integer> printExamScores() {
        return extraExamScores;
    }
}