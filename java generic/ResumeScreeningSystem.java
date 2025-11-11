import java.util.Arrays;
import java.util.List;

abstract class JobRole {
    private final String title;
    public JobRole(String title) { this.title = title; }
    public String toString() { return title; }
}

class SoftwareEngineer extends JobRole { public SoftwareEngineer() { super("Software Engineer"); } }
class DataScientist extends JobRole { public DataScientist() { super("Data Scientist"); } }
class ProductManager extends JobRole { public ProductManager() { super("Product Manager"); } }

class Resume<T extends JobRole> {
    private final String candidate;
    private final T role;
    public Resume(String candidate, T role) { this.candidate = candidate; this.role = role; }
    public String toString() { return candidate + " - " + role; }
}

public class ResumeScreeningSystem {
    public static void processPipeline(List<? extends JobRole> roles) {
        for (JobRole r : roles) System.out.println(r);
    }

    public static void main(String[] args) {
        List<JobRole> roles = Arrays.asList(new SoftwareEngineer(), new DataScientist(), new ProductManager());
        processPipeline(roles);
        Resume<SoftwareEngineer> r = new Resume<>("Amol", new SoftwareEngineer());
        System.out.println(r);
    }
}
