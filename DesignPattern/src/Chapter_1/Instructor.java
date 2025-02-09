package Chapter_1;

import java.util.ArrayList;
import java.util.List;

public class Instructor {
    private List<Course> courses = new ArrayList<>();

    public void addCourse(Course course) {
        courses.add(course);
    }
}
