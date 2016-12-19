package L7HomeWorkAccounting;

/**
 * Created by P-C on 19.12.2016.
 */
public class Accounting {
    public static void main(String[] args) {
//        EmployeeMonthlyRates[] employees = new EmployeeMonthlyRates[1];
//        employees[0] = new EmployeeMonthlyRates("Иванова Елена Львовна", "зам директора");
        Employee empMonth = new EmployeeMonthlyRates("Иванова Елена Львовна", "зам директора", (double) 4500);
        Employee empHour = new EmployeeHourlyRates("Вакуленко Дмитрий Владимирович", "дизайнер", (double) 100, (double) 1200);

        empMonth.getMonthSalary();
        empMonth.getYearSalary();
        System.out.println(empMonth.name + ", " + empMonth.position + " оклад " + empMonth.getMonthSalary() + " грн в месяц");
        System.out.println(empMonth.name + ", " + empMonth.position + " оклад " + empMonth.getYearSalary() + " грн в год");

        empHour.getMonthSalary();
        empHour.getYearSalary();
        System.out.println(empHour.name + ", " + empHour.position + " оклад " + empHour.getMonthSalary() + " $ в месяц");
        System.out.println(empHour.name + ", " + empHour.position + " оклад " + empMonth.getYearSalary() + " $ в год");
    }
}
