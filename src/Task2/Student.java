package Task2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Student {

    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Course> getCourses() {
        return courses;
    }

    public boolean hasDebts() {
        return courses.stream().anyMatch(course -> !course.isPassed());
    }

    public double getAverageGrade() {
        return courses.stream()
                .filter(Course::isPassed)
                .mapToInt(Course::getFinalGrade)
                .average()
                .orElse(0.0);
    }

    @Override
    public String toString() {
        return "Student: " + name;
    }
}
