package L7HomeWorkAccounting;

/**
 * Created by P-C on 19.12.2016.
 */
public class EmployeePersentage extends Employee {
    double cashMonth;
    double cashYear;

    public EmployeePersentage(String name, String position, double cashMonth, double cashYear) {
        super(name, position);
        this.cashMonth = cashMonth;
        this.cashYear = cashYear;
    }

    @Override
    double getMonthSalary() {
        return (cashMonth*0.05);
    }

    @Override
    double getYearSalary() {
        return (cashYear*0.05);
    }
}
