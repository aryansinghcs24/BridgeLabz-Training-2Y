import java.util.Arrays;
import java.util.List;

abstract class CourseType {
    private final String name;
    public CourseType(String name) { this.name = name; }
    public String getName() { return name; }
}

class ExamCourse extends CourseType { public ExamCourse(String n) { super(n); } }
class AssignmentCourse extends CourseType { public AssignmentCourse(String n) { super(n); } }
class ResearchCourse extends CourseType { public ResearchCourse(String n) { super(n); } }

class Course<T extends CourseType> {
    private final T type;
    public Course(T type) { this.type = type; }
    public T getType() { return type; }
}

public class CourseManagement {
    public static void printCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) System.out.println(c.getName());
    }

    public static void main(String[] args) {
        List<ExamCourse> exams = Arrays.asList(new ExamCourse("Math"), new ExamCourse("Physics"));
        List<ResearchCourse> research = Arrays.asList(new ResearchCourse("AI"), new ResearchCourse("ML"));
        printCourses(exams);
        printCourses(research);
        Course<AssignmentCourse> ac = new Course<>(new AssignmentCourse("Programming"));
        System.out.println(ac.getType().getName());
    }
}
