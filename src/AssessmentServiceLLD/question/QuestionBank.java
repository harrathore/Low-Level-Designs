package AssessmentServiceLLD.question;

import java.util.ArrayList;
import java.util.List;

public class QuestionBank {
    private static List<Question> allQuestions;
    private static int questionCount;

    static {
        allQuestions = new ArrayList<>();
        questionCount = 0;
    }

    public void addQuestionToBank(Question question){
        allQuestions.add(question);
        questionCount++;
    }

    public int getNumberOfQuestions(){
        return allQuestions.size();
    }

    public List<Question> getQuestionsBasedOnFilter(){
        return this.allQuestions;
    }

}
