import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        List<List<Integer>> quizscores = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            List<Integer> score = new ArrayList<Integer>();
            for (int j = 0; j < 15; j++) {
                if(i%7==0){
                    score.add(30+i);
                }else{
                    score.add(30-i);
                }

            }
            quizscores.add(score);
        }

        Session printSessions = new Session();
        for (int i = 1; i <= 10; i++) {

            Parttime parttimeStudent = new Parttime("PartTimeStudent" + i,10000-i, quizscores.get(i-1));
            printSessions.addPartTimeStudent(parttimeStudent);
            printSessions.printQuizScores(parttimeStudent, parttimeStudent.getQuizScore());
            printSessions.averageScores(parttimeStudent, parttimeStudent.getQuizScore());

        }
        for(int i =11;i<=20;i++){

            List<Integer> extraExamScore = new ArrayList<Integer>(Arrays.asList(30+i,90-i));
            Fulltime fulltimeStudent = new Fulltime("FullTimeStudent"+i,10000-i, quizscores.get(i-1), extraExamScore);
            printSessions.addFullTimeStudent(fulltimeStudent);
            printSessions.printQuizScores(fulltimeStudent, fulltimeStudent.getQuizScore());
            printSessions.averageScores(fulltimeStudent, fulltimeStudent.getQuizScore());

        }
        printSessions.printPartTimeStudentNames();
        printSessions.printFullTimeStudentScores();

    }
}