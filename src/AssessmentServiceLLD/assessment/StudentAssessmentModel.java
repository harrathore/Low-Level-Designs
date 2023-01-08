package AssessmentServiceLLD.assessment;

import AssessmentServiceLLD.question.Question;

import java.util.List;

public class StudentAssessmentModel {
    private String createdBy;
    List<Question> allQuestions;
    private int maximumTimeAllotted;

    public StudentAssessmentModel(String createdBy, List<Question> questionList, int maximumTimeAllotted){
        this.createdBy = createdBy;
        this.allQuestions = questionList;
        this.maximumTimeAllotted = maximumTimeAllotted;
    }

}
