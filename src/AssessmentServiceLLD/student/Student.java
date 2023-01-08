package AssessmentServiceLLD.student;

import AssessmentServiceLLD.assessment.Assessment;
import AssessmentServiceLLD.assessment.StudentAssessmentModel;
import AssessmentServiceLLD.users.User;

import java.util.ArrayList;
import java.util.List;

public class Student extends User {
    private String studentEnrolledCourse;

    private List<StudentAssessmentModel> myAssessments;

    public Student(String name, String course) {
        super(name);
        this.myAssessments = new ArrayList<>();
        this.studentEnrolledCourse = course;
    }

    public void assignAssessmentToStudent(StudentAssessmentModel assessment){
        myAssessments.add(assessment);
    }
}
