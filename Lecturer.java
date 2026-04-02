public class Lecturer extends Teacher {
    private String department;
    private int yearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;

    public Lecturer(int teacherID, String teacherName, String address, String workingType, String employmentStatus, String department, int yearsOfExperience) {
        super(teacherID, teacherName, address, workingType, employmentStatus);
        this.department = department;
        this.yearsOfExperience = yearsOfExperience;
        this.gradedScore = 0;
        this.hasGraded = false;
    }

    public String gradeAssignment(int gradedScore, String department, int yearsOfExperience) {
        if (yearsOfExperience >= 5 && this.department.equals(department)) {
            this.gradedScore = gradedScore;
            this.hasGraded = true;
            return "Graded successfully.";
        } else {
            return "Cannot grade assignments due to insufficient experience or department mismatch.";
        }
    }
}
