import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}

@Retention(RetentionPolicy.RUNTIME)
@interface BugReports {
    BugReport[] value();
}
class Software {
    @BugReport(description = "NullPointerException in login")
    @BugReport(description = "ArrayIndexOutOfBounds in profile loading")
    void fixBugs() {
        System.out.println("Bugs fixed");
    }
}
public class RepeatableAnnotation {
    public static void main(String[] args) throws Exception {
        Method method = Software.class.getMethod("fixBugs");
        BugReports reports = method.getAnnotation(BugReports.class);
        for (BugReport report : reports.value()) {
            System.out.println("Bug: " + report.description());
        }
    }
}
