package HW_7.Task2;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(001, "Dima", 19, 4.1));
        students.add(new Student(002, "Anton", 20, 4.5));
        students.add(new Student(003, "Vika", 18, 4.3));
        students.add(new Student(004, "Igor", 21, 3.5));
        students.add(new Student(005, "Olha", 23, 4.7));
        System.out.println("All students : ");
        StudentHandler.printAllStudents(students);
        Student newStudent = new Student(006, "Oleh", 17, 3.7);
        students = StudentHandler.addStudent(students, newStudent);
        System.out.println("After adding: ");
        StudentHandler.printAllStudents(students);
        Student found = StudentHandler.findStudentByName(students, "Anton");
        System.out.println("Found: " + found);
        Student notFound = StudentHandler.findStudentByName(students, "There is no such thing.");
        System.out.println("Not found result: " + notFound);
        students = StudentHandler.removeStudentById(students, 001);
        System.out.println("After removal: ");
        StudentHandler.printAllStudents(students);

    }
}
