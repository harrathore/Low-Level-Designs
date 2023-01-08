package AssessmentServiceLLD.faculty;

import AssessmentServiceLLD.assessment.Assessment;
import AssessmentServiceLLD.question.Question;
import AssessmentServiceLLD.question.QuestionBank;
import AssessmentServiceLLD.student.Student;
import AssessmentServiceLLD.student.StudentDB;
import AssessmentServiceLLD.users.User;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends User {
    private String subject;
    private List<Assessment> myCreatedAssessment;
    private StudentDB studentDB;
    private QuestionBank questionBank;

    public Faculty(String name, String subject) {
        super(name);
        this.subject = subject;
        myCreatedAssessment = new ArrayList<>();
        studentDB = new StudentDB();
        questionBank = new QuestionBank();
    }

    public void createAssessment(){
        Assessment assessment = new Assessment(this.getUserId());
        List<Student> myStudents = studentDB.getStudentBasedOnFilter();
        List<Question> questions = questionBank.getQuestionsBasedOnFilter();
        for(Question question : questions){
            assessment.addQuestionToAssessment(question);
        }
        for(Student student : myStudents){
            assessment.addStudentToAssessment(student);
        }
        myCreatedAssessment.add(assessment);
    }

    public void publishAllAssessment(){
        for(Assessment assessment : myCreatedAssessment){
            assessment.publishAssessment(assessment.getCreatedBy());
        }
    }
}
