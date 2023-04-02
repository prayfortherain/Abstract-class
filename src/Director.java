public class Director extends Person {
    private int numberOfSubordinates;

    public Director(String fullName, int birthYear, double salary, int numberOfSubordinates) {
        super(fullName, birthYear, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    @Override
    public void printInfo() {
        System.out.println("Director: " + fullName + ", born in " + birthYear + ", salary: " + salary + ", number of subordinates: " + numberOfSubordinates);
    }
}
