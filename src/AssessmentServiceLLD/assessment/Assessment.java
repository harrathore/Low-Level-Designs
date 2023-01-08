package AssessmentServiceLLD.assessment;

import AssessmentServiceLLD.enums.AssessmentStatus;
import AssessmentServiceLLD.faculty.Faculty;
import AssessmentServiceLLD.question.Question;
import AssessmentServiceLLD.services.NotificationService;
import AssessmentServiceLLD.student.Student;

import java.util.ArrayList;
import java.util.List;

public class Assessment {
    private String assessmentId;
    private String createdBy;
    private List<Question> questionList;
    private List<Student> studentList;
    private AssessmentStatus status;
    private NotificationService notificationService;

    public Assessment(String createdBy){
        this.assessmentId = "Assessment-" + createdBy + "@123";
        this.createdBy = createdBy;
        this.questionList = new ArrayList<>();
        this.studentList = new ArrayList<>();
        this.status= AssessmentStatus.DRAFT;
        this.notificationService = new NotificationService();
    }

    public void addQuestionToAssessment(Question question){
        if(this.status.equals(AssessmentStatus.DRAFT)){
            this.questionList.add(question);
        }
    }

    public void addStudentToAssessment(Student student){
        if(this.status.equals(AssessmentStatus.DRAFT)){
            this.studentList.add(student);
        }
    }

    public String getCreatedBy(){
        return this.createdBy;
    }

    public boolean publishAssessment(String facultyId){
        if(this.createdBy.equals(facultyId)){
            this.status = AssessmentStatus.PUBLISHED;
            StudentAssessmentModel studentAssessmentModel = new StudentAssessmentModel(
                    this.createdBy, this.questionList, 180);
            notificationService.notifyAllStudents(this.studentList, studentAssessmentModel);
            return true;
        }else{
            return false;
        }
    }
}
//This is comment by harvendra(adda's account)
