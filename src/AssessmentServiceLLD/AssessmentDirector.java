package AssessmentServiceLLD;

import AssessmentServiceLLD.faculty.Faculty;
import AssessmentServiceLLD.question.Question;
import AssessmentServiceLLD.question.QuestionBank;
import AssessmentServiceLLD.student.Student;
import AssessmentServiceLLD.student.StudentDB;

import java.util.logging.Logger;

public class AssessmentDirector{
    public static void main(String[] args) {

        //Creating Student Database
        StudentDB studentDB = new StudentDB();
        Student student1 = new Student("Harvendra", "Java");
        Student student2 = new Student("Vishal", "Java");
        Student student3 = new Student("Raja", "Java");
        studentDB.addStudentToDb(student1);
        studentDB.addStudentToDb(student2);
        studentDB.addStudentToDb(student3);

        //Creating QuestionBank
        QuestionBank questionBank = new QuestionBank();
        Question question1 = new Question("What is Oops", "Java", 10);
        Question question2 = new Question("What is Abstraction", "Java", 8);
        Question question3 = new Question("WHat is Lambda Function in Java", "Java", 15);
        questionBank.addQuestionToBank(question1);
        questionBank.addQuestionToBank(question2);
        questionBank.addQuestionToBank(question3);


        Faculty faculty = new Faculty("Faculty", "Java");
        faculty.createAssessment();
        faculty.publishAllAssessment();

    }
}
