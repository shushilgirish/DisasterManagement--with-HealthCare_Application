package Business.Hospital.Model;


public class PharmaDepartment {
    // Attributes
    private int departmentId;
    private String departmentName;

    // Constructor
    public PharmaDepartment(int departmentId, String departmentName) {
        this.departmentId = departmentId;
        this.departmentName = departmentName;
    }

    // Getters and Setters
    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    // Optional: Override toString for display purposes
    @Override
    public String toString() {
        return "Department ID: " + departmentId + ", Name: " + departmentName;
    }
}
