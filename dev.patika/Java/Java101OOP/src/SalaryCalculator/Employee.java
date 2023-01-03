package SalaryCalculator;

public class Employee {

    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax;
    double bonus;
    double raiseSalary;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary
                - (this.tax = calculateTax(salary, 0.03))
                + (this.bonus = calculateBonus(workHours, 40))
                + (this.raiseSalary = raiseSalary(salary, 2021, hireYear));
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double calculateTax(double salary, double taxRate) {
        return
                salary > 1000 ? salary * taxRate : 0.00;
    }

    double calculateBonus(int workHours, int mandatoryHours) {
        return
                workHours > 40 ? (workHours - mandatoryHours) * 30 : 0.00;
    }

    double raiseSalary(double salary, int presentYear, int hiredYear) {
        int workedYears = presentYear - hiredYear;
        if (workedYears < 10) {
            return salary * 0.05;
        } else if (workedYears < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    @Override
    public String toString() {
        return "*** Employee Salary Info ***" + "\n" +
                "=====================================" + "\n" +
                "Name:\t\t\t " + name + "\n" +
                "Hired Year:\t\t " + hireYear + "\n" +
                "Worked Hours:\t " + workHours + "\n" +
                "-------------------------------------" + "\n" +
                "Bonus:\t\t\t " + bonus + "\n" +
                "Tax(-):\t\t\t " + tax + "\n" +
                "Salary Increase: " + raiseSalary + "\n" +
                "-------------------------------------" + "\n" +
                "Salary:\t\t\t " + salary + "\n" +
                "=====================================";
    }
}
