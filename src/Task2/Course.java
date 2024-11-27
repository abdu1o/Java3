package Task2;

public class Course {

    private String name;
    private int semester;
    private int finalGrade;

    public Course(String name, int semester, int finalGrade) {
        this.name = name;
        this.semester = semester;
        this.finalGrade = finalGrade;
    }

    public String getName() {
        return name;
    }

    public int getSemester() {
        return semester;
    }

    public int getFinalGrade() {
        return finalGrade;
    }

    public boolean isPassed() {
        return finalGrade >= 60;
    }

    @Override
    public String toString() {
        return String.format("Course: %s, Semester: %d, Final Grade: %s", name, semester, finalGrade >= 0 ? finalGrade : "Not Passed");
    }
}
