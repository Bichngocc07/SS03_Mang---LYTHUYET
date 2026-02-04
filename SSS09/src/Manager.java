public class Manager extends Employee {
    private String department;

    public Manager(String name, double baseSalary, String department) {
        super(name, baseSalary); 
        this.department = department;
    }

    @Override
    public double calculateSalary() {
        return 0;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Phòng ban: " + department);
    }
}

