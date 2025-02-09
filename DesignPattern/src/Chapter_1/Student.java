package Chapter_1;

public class Student {

    public void register(CourseRegistrationService crs,
                         Course course) {
        crs.register(this, course);
    }
}
