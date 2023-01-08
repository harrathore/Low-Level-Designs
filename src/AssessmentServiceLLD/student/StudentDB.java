package AssessmentServiceLLD.student;

import java.util.ArrayList;
import java.util.List;

public class StudentDB {
    private List<Student> allStudents;
    private int studentsCount;

    public StudentDB(){
        allStudents = new ArrayList<>();
        this.studentsCount = 0;
    }

    public void addStudentToDb(Student student){
        this.allStudents.add(student);
        studentsCount++;
    }

    public List<Student> getStudentBasedOnFilter(){
        return this.allStudents;
    }
}
