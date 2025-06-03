import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double baseSalary = sc.nextDouble();
        double sales = sc.nextDouble();
        double bonus = sales * 0.15;

        Employee emp = new Employee(name, baseSalary, bonus);
        emp.printInfo();
        sc.close();
    }
}
