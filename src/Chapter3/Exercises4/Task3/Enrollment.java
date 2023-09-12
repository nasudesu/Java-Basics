package Chapter3.Exercises4.Task3;

import java.io.Serializable;

public class Enrollment implements Serializable {
    String student;
    String coure;
    String enrollmentDate;

    public Enrollment(String student, String coure, String enrollmentDate) {
        this.student = student;
        this.coure = coure;
        this.enrollmentDate = enrollmentDate;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public String getCoure() {
        return coure;
    }

    public void setCoure(String coure) {
        this.coure = coure;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }
}
