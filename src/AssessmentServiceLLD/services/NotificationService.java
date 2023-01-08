package AssessmentServiceLLD.services;

import AssessmentServiceLLD.assessment.Assessment;
import AssessmentServiceLLD.assessment.StudentAssessmentModel;
import AssessmentServiceLLD.student.Student;

import java.util.List;

public class NotificationService {
    public void notifyAllStudents(List<Student> assignees, StudentAssessmentModel studentAssessmentModel){
        for(Student student : assignees){
            student.assignAssessmentToStudent(studentAssessmentModel);
        }
    }
}
