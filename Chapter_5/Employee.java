public class Employee {
    private int employeeNumber;
    private double payRate;
    private double houseWorked;
    final double MAX_PAY_RATE = 60.00;
    final double MAX_EMPLOYEE_NUMBER = 9999;
    


    public Employee(double payRate, double houseworked) {
        this.employeeNumber = 4;
        this.payRate = payRate;
        this.houseWorked = houseworked;
    }

    public double calculateRegularPay(double hoursWorked) {
        if (hoursWorked < 40) {
            return hoursWorked * payRate;
        } else {
            return 40 * payRate;
        }
    }

    public double calculateOvertimePay(double hoursWorked) {
        if (hoursWorked > 40) {
            double overtimeHours = hoursWorked - 40;
            return overtimeHours * payRate * 1.5;
        }
        return 0;
    }
}