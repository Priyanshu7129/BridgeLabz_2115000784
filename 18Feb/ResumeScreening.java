import java.util.*;
abstract class JobRole {
    private String roleName;

    public JobRole(String roleName) {
        this.roleName = roleName;
    }
    public String getRoleName() {
        return roleName;
    }
    public abstract void screenResume();
}
class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() {
        super("Software Engineer");
    }
    @Override
    public void screenResume() {
        System.out.println("Screening resume for " + getRoleName());
    }
}
class DataScientist extends JobRole {
    public DataScientist() {
        super("Data Scientist");
    }
    @Override
    public void screenResume() {
        System.out.println("Screening resume for " + getRoleName());
    }
}
class ProductManager extends JobRole {
    public ProductManager() {
        super("Product Manager");
    }
    @Override
    public void screenResume() {
        System.out.println("Screening resume for " + getRoleName());
    }
}
class Resume<T extends JobRole> {
    private T jobRole;

    public Resume(T jobRole) {
        this.jobRole = jobRole;
    }
    public T getJobRole() {
        return jobRole;
    }
    public void processResume() {
        jobRole.screenResume();
    }
}
class ResumeScreeningPipeline {
    public static void screenResumes(List<? extends JobRole> jobRoles) {
        for (JobRole jobRole : jobRoles) {
            jobRole.screenResume();
        }
    }
}
public class ResumeScreening {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> softwareEngineerResume = new Resume<>(new SoftwareEngineer());
        Resume<DataScientist> dataScientistResume = new Resume<>(new DataScientist());
        Resume<ProductManager> productManagerResume = new Resume<>(new ProductManager());

        List<JobRole> jobRoles = new ArrayList<>();
        jobRoles.add(softwareEngineerResume.getJobRole());
        jobRoles.add(dataScientistResume.getJobRole());
        jobRoles.add(productManagerResume.getJobRole());

        ResumeScreeningPipeline.screenResumes(jobRoles);
    }
}
