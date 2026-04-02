public class Tutor extends Teacher {
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;

    public Tutor(int teacherID, String teacherName, String address, String workingType, String employmentStatus, int workingHours, double salary, String specialization, String academicQualifications, int performanceIndex) {
        super(teacherID, teacherName, address, workingType, employmentStatus);
        setWorkingHours(workingHours);
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this.isCertified = false;
    }

    public String setSalary(double newSalary, int newPerformanceIndex) {
        if (newPerformanceIndex > 5 && getWorkingHours() > 20) {
            this.salary = newSalary;
            this.performanceIndex = newPerformanceIndex;
            this.isCertified = true;
            return "Salary updated successfully.";
        } else {
            return "Salary update conditions not met.";
        }
    }
}
