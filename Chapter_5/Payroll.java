import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many hours did you work this week? ");
        double hoursWorked = scanner.nextDouble();

        System.out.print("What is your regular pay rate? ");
        double payRate = scanner.nextDouble();

        Employee employee = new Employee(payRate, hoursWorked);

        double regularPay = employee.calculateRegularPay(hoursWorked);
        double overtimePay = employee.calculateOvertimePay(hoursWorked);

        System.out.println("Regular pay is " + regularPay);
        System.out.println("Overtime pay is " + overtimePay);

    }
}