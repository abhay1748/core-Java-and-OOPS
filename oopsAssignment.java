import java.util.Scanner;

class Salary {
    private double annualSalary;
    private double tax;

    public double grossSalary() {
        System.out.println("Enter your Monthly basic salary");
        try (Scanner sc = new Scanner(System.in)) {
            double basicSalary = sc.nextDouble();
            double hra = 0.5 * basicSalary;
            double da = 0.15 * basicSalary;
            double ta = 0.2 * basicSalary;
            double ma = 0.2 * basicSalary;
            double gs = basicSalary + hra + ta + da + ma;
            annualSalary = 12 * basicSalary;
            return gs;
        }
    }

    public double totalTax() {
        if (annualSalary > 500000) {
            tax = 0.10 * annualSalary;
        } else if (annualSalary > 700000) {
            tax = 0.20 * annualSalary;
        } else if (annualSalary > 900000) {
            tax = 0.30 * annualSalary;
        }
        double as = annualSalary - tax;
        return as;
    }
}

public class oopsAssignment {

    public static void main(String[] args) {
        Salary s1 = new Salary();
        System.out.println("your gross salary is " + s1.grossSalary());
        System.out.println("your annual salary after tax is " + s1.totalTax());

    }

}
