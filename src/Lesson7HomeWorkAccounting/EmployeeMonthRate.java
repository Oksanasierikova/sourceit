package Lesson7HomeWorkAccounting;

/**
 * Created by P-C on 18.12.2016.
 */
public class EmployeeMonthRate extends NameOfEmployee implements MonthlyRates {


    public EmployeeMonthRate(String fullName, String position) {
        super(fullName, position);
    }

    @Override
    public double calcMonthSalary(double monthSalary) {
        return monthSalary;
    }

    @Override
    public double calcYearSalary(double monthSalary) {
        return monthSalary * 12;
    }
}
