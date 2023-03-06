import java.util.*;

public class Session {
    private List<Fulltime> fList;
    private List<Parttime> pList;
    private double averageScores = 0;

    public Session(){
        this.fList = new ArrayList<Fulltime>();
        this.pList = new ArrayList<Parttime>();

    }


    public void addFullTimeStudent(Fulltime student) {

        fList.add(student);
    }

    public void addPartTimeStudent(Parttime student) {

        pList.add(student);
    }

    public double getAvgQuizScore() {

        return averageScores;
    }

    public List<Fulltime> getfList() {

        return fList;
    }

    public List<Parttime> getpList() {

        return pList;
    }


    public void printPartTimeStudentNames() {
        for (Parttime s : pList) {
            System.out.println(s.getName());
        }
    }

    public void printFullTimeStudentScores() {
        for (Fulltime s : fList) {
            System.out.println("Exam scores for full time " + s.getName() + " is " + s.printExamScores());
        }
    }
    public void averageScores(Student student, List<Integer> quizScore) {
        for (int quizScores : quizScore) {
            averageScores += quizScores;
        }
        double result = averageScores / quizScore.size();

        System.out.println("Average Score for student with NUID" +student.getNUID()+" is "+result);
    }

    public void printQuizScores(Student student, List<Integer> quizScores) {

        Collections.sort(quizScores);
        System.out.println("Quiz scores in ascending order for " + student.getName() + " with NUID" +student.getNUID()+ "\n " + quizScores);
    }
}
