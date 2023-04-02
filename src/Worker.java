public class Worker extends Person {
    private String position;

    public Worker(String fullName, int birthYear, double salary, String position) {
        super(fullName, birthYear, salary);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public void printInfo() {
        System.out.println("Worker: " + fullName + ", born in " + birthYear + ", salary: " + salary + ", position: " + position);
    }
}
