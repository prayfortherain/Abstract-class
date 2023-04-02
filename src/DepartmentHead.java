public class DepartmentHead extends Person {
    private String departmentName;

    public DepartmentHead(String fullName, int birthYear, double salary, String departmentName) {
        super(fullName, birthYear, salary);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public void printInfo() {
        System.out.println("Department head: " + fullName + ", born in " + birthYear + ", salary: " + salary + ", department name: " + departmentName);
    }
}
