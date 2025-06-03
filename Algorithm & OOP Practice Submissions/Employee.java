class Employee {
    private String name;
    private double baseSalary;
    private double bonus;

    public Employee(String name, double baseSalary, double bonus) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    public double calculateTotalSalary() {
        return baseSalary + bonus;
    }

    public void printInfo() {
        System.out.printf("TOTAL = R$ %.2f\n", calculateTotalSalary());
    }
}
