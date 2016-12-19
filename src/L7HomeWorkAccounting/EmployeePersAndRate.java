package L7HomeWorkAccounting;

/**
 * Created by P-C on 19.12.2016.
 */
public class EmployeePersAndRate extends Employee {
    double rate;
    double cashMonth;
    double cashYear;


    public EmployeePersAndRate(String name, String position, double rate, double cashMonth, double cashYear) {
        super(name, position);
        this.rate = rate;
        this.cashMonth = cashMonth;
        this.cashYear = cashYear;
    }

    @Override
    double getMonthSalary() {
        return (rate + cashMonth*0.03);
    }

    @Override
    double getYearSalary() {
        return (12*rate + cashYear*0.03);
    }
}
