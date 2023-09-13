package Chapter3.Exercises4.Task3;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        Student student = new Student(1, "John", 21);
        Course course = new Course("ABC", "Math", "Kim");
        Enrollment enrollment = new Enrollment(student, course, "12.12.2023");
        try {
            FileOutputStream fileOut = new FileOutputStream("enrollments.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(enrollment);
            objectOut.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Enrollment enrollment1 = null;
        try {
            FileInputStream fileIn = new FileInputStream("enrollments.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            enrollment1 = (Enrollment) objectIn.readObject();
            objectIn.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        assert enrollment1 != null;
        System.out.println(enrollment1.getStudent().getName());
        System.out.println(enrollment1.getCourse().getCourseName());
        System.out.println(enrollment1.getEnrollmentDate());


    }
}
