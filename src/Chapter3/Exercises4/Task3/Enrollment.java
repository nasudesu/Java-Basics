package Chapter3.Exercises4.Task3;

import java.io.Serializable;

public class Enrollment implements Serializable {
    Student student;
    Course course;
    String enrollmentDate;

    public Enrollment(Student student, Course course, String enrollmentDate) {
        this.student = student;
        this.course = course;
        this.enrollmentDate = enrollmentDate;
    }

    public Student getStudent() {
        return student;
    }
    public Course getCourse() {
        return course;
    }
    public String getEnrollmentDate() {
        return enrollmentDate;
    }
    @Override
    public String toString() {
        return "Student: "+this.student+" course: "+this.course+" Enrollment: "+this.enrollmentDate;
    }
}
