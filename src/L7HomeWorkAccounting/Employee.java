package L7HomeWorkAccounting;

/**
 * Created by P-C on 19.12.2016.
 */
abstract class Employee {
    String name;
    String position;

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    abstract double getMonthSalary();

    abstract double getYearSalary();
}
