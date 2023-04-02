public abstract class Person {
    protected String fullName;
    protected int birthYear;
    protected double salary;

    public Person(String fullName, int birthYear, double salary) {
        this.fullName = fullName;
        this.birthYear = birthYear;
        this.salary = salary;
    }

    public String getFullName() {
        return fullName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public double getSalary() {
        return salary;
    }

    public abstract void printInfo();
}
