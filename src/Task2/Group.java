package Task2;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Group {
    private List<Student> students;

    public Group() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Student> getFailingStudents() {
        return students.stream()
                .filter(Student::hasDebts)
                .toList();
    }

    public List<Student> getSuccessfulStudents() {
        return students.stream()
                .filter(student -> !student.hasDebts())
                .toList();
    }

    public String getMostFailedCourse() {

        java.util.Map<String, Integer> failureCount = new java.util.HashMap<>();

        for (Student student : students) {
            for (Course course : student.getCourses()) {
                if (!course.isPassed()) {
                    failureCount.put(course.getName(), failureCount.getOrDefault(course.getName(), 0) + 1);
                }
            }
        }
        String mostFailedCourse = "No courses with failures";
        int maxFailures = 0;

        for (java.util.Map.Entry<String, Integer> entry : failureCount.entrySet()) {
            if (entry.getValue() > maxFailures) {
                maxFailures = entry.getValue();
                mostFailedCourse = entry.getKey();
            }
        }

        return mostFailedCourse;
    }
}
