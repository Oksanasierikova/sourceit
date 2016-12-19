package L7HomeWorkAccounting;

/**
 * Created by P-C on 19.12.2016.
 */
public class EmployeeHourlyRates extends Employee {
    double quantityOfHoursPerMonth;
    double quantityOfHoursPerYear;

    public EmployeeHourlyRates(String name, String position, Double quantityOfHoursPerMonth, Double quantityOfHoursPerYear) {
        super(name, position);
        this.quantityOfHoursPerMonth = quantityOfHoursPerMonth;
        this.quantityOfHoursPerYear = quantityOfHoursPerYear;
    }

    @Override
    double getMonthSalary() {
        return quantityOfHoursPerMonth * 7;
    }

    @Override
    double getYearSalary() {
        return quantityOfHoursPerYear * 7;
    }
}
