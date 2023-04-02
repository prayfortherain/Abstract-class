public class Main {
    public static void main(String[] args) {
        Director director = new Director("John Smith", 1970, 100000, 10);
        DepartmentHead departmentHead = new DepartmentHead("Jane Doe", 1980, 50000, "Sales");
        Worker worker = new Worker("Alex Johnson", 1990, 25000, "Sales Representative");

        director.printInfo();
        departmentHead.printInfo();
        worker.printInfo();
    }
}