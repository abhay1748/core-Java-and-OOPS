import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Double basicSalary;
        Double netSalary;
        Double grossSalary;
        Double HRA, TA, MA, PF, tax;
        System.out.println("Enter your basic salary");
        Scanner sc = new Scanner(System.in);
        basicSalary = sc.nextDouble();
        HRA = 0.5 * basicSalary;
        TA = 0.3 * basicSalary;
        MA = 0.25 * basicSalary;
        PF = 0.1 * basicSalary;
        grossSalary = basicSalary + HRA + TA + MA;
        tax = 0.1 * grossSalary;
        netSalary = grossSalary - tax - PF;
        System.out.println("Your Net Salary is " + netSalary);
    }
}
