package less4.service;

import less4.model.Student;
import less4.model.StudentGroup;

import java.util.Collections;
import java.util.List;

public class StudentGroupService {

    private StudentGroup studentGroup;

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public void addStudent(Student student) {
        studentGroup.students.add(student);
    }

    public List<Student> sort() {
        Collections.sort(studentGroup.students);
        return studentGroup.students;
    }
}