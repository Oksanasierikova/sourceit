package Lesson7HomeWorkAccounting;

/**
 * Created by P-C on 18.12.2016.
 */
public class EmployeeHourlyRates extends NameOfEmployee implements HourlyRates {

    public EmployeeHourlyRates(String fullName, String position) {
        super(fullName, position);
    }

    @Override
    public double calcMonthSalary( int quantityOfHoursInMonth) {
        return 7*quantityOfHoursInMonth;
    }

    @Override
    public double calcYearSalary(int quantityOfHoursInYear) {
        return 7*quantityOfHoursInYear;
    }
}
