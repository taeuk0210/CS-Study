package Chapter_1;

public class Grade {
    private Student student;
    private double score;

    public Grade(Student student, double score) {
        this.student = student;
        this.score = score;
    }

    public double getScore() {
        return score;
    }
}
