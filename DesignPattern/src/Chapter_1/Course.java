package Chapter_1;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private List<Student> students = new ArrayList<>();
    private CourseMaterial courseMaterial;

    public Course(CourseMaterial courseMaterial) {
        this.courseMaterial = courseMaterial;
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }
}
