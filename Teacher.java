public class Teacher {
    private int teacherID; // Changed to int based on your GUI logic [cite: 143]
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours;

    public Teacher(int teacherID, String teacherName, String address, String workingType, String employmentStatus) {
        this.teacherID = teacherID;
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
    }

    // Getters and the specific setWorkingHours method from your diagram 
    public int getTeacherID() { return teacherID; }
    public String getTeacherName() { return teacherName; }
    public void setWorkingHours(int hours) { this.workingHours = hours; }
    
    public void display() {
        System.out.println("ID: " + teacherID + " Name: " + teacherName + " Address: " + address);
    }
}
