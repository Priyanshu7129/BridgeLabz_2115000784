abstract class CourseType {
    private String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseName() {
        return courseName;
    }
    public abstract void evaluate();
}
class ExamCourse extends CourseType {
    public ExamCourse(String courseName) {
        super(courseName);
    }
    @Override
    public void evaluate() {
        System.out.println("Evaluating through exams for " + getCourseName());
    }
}
class AssignmentCourse extends CourseType {
    public AssignmentCourse(String courseName) {
        super(courseName);
    }
    @Override
    public void evaluate() {
        System.out.println("Evaluating through assignments for " + getCourseName());
    }
}
class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName) {
        super(courseName);
    }
    @Override
    public void evaluate() {
        System.out.println("Evaluating through research for " + getCourseName());
    }
}
class Course<T extends CourseType> {
    private T courseType;

    public Course(T courseType) {
        this.courseType = courseType;
    }
    public T getCourseType() {
        return courseType;
    }
    public void startCourse() {
        System.out.println("Starting course: " + courseType.getCourseName());
        courseType.evaluate();
    }
}
public class UniversityCourseManagement {
    public static void main(String[] args) {
        Course<ExamCourse> examCourse = new Course<>(new ExamCourse("Mathematics"));
        Course<AssignmentCourse> assignmentCourse = new Course<>(new AssignmentCourse("History"));
        Course<ResearchCourse> researchCourse = new Course<>(new ResearchCourse("Physics"));

        examCourse.startCourse();
        assignmentCourse.startCourse();
        researchCourse.startCourse();
    }
}
