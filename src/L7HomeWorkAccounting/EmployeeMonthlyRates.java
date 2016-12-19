package L7HomeWorkAccounting;

/**
 * Created by P-C on 19.12.2016.
 */
public class EmployeeMonthlyRates extends Employee {

    double salaryPerMonth;

    public EmployeeMonthlyRates(String name, String position, double salaryPerMonth) {
        super(name, position);
        this.salaryPerMonth = salaryPerMonth;
    }

    @Override
    double getMonthSalary() {
        return salaryPerMonth;
    }

    @Override
    double getYearSalary() {
        return salaryPerMonth * 12;
    }
}
