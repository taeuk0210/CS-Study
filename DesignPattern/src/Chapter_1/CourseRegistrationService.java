package Chapter_1;

public class CourseRegistrationService {

    public void register(Student student, Course course) {
        course.enrollStudent(student);
        System.out.println("Register course");
    }
}
