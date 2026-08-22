package HW_7.Task2;

import java.util.List;

public class StudentHandler {
    public static List<Student> addStudent(List<Student> students, Student student) {
        students.add(student);
        return students;
    }

    public static List<Student> removeStudentById(List<Student> students, int id) {
        for (int i = students.size() - 1; i >= 0; i--) {
            if (students.get(i).getId() == id) {
                students.remove(i);
            }
        }
        return students;
    }

    public static Student findStudentByName(List<Student> students, String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                return students.get(i);
            }
        }
        System.out.println("A student with a name " + name + "not found");
        return null;
    }

    public static void printAllStudents(List<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
}