package L7HomeWorkAccounting;

/**
 * Created by P-C on 19.12.2016.
 */
public class EmployeeHourlyRates extends Employee {
    double quantityOfHoursPerMonth;
    double quantityOfHoursPerYear;
    double currency;

    public EmployeeHourlyRates(String name, String position, double quantityOfHoursPerMonth, double quantityOfHoursPerYear, double currency) {
        super(name, position);
        this.quantityOfHoursPerMonth = quantityOfHoursPerMonth;
        this.quantityOfHoursPerYear = quantityOfHoursPerYear;
        this.currency = currency;
    }

    @Override
    double getMonthSalary() {
        return (quantityOfHoursPerMonth * 7*currency);
    }

    @Override
    double getYearSalary() {
        return (quantityOfHoursPerYear * 7*currency);
    }
}
