package Lesson7HomeWorkAccounting;

public class Accounting {

    public static void main(String[] args) {
        NameOfEmployee[] names = new NameOfEmployee[2];
        names[0] = new EmployeeMonthRate("Иванова Елена Львовна", "зам директора");
        names[1] = new EmployeeHourlyRates("Вакуленко Дмитрий Владимирович", "дизайнер");


        for (NameOfEmployee name : names) {
            if (name instanceof MonthlyRates) {
                MonthlyRates salary = (MonthlyRates) name;
                double salaryMonth = salary.calcMonthSalary(4500);
                System.out.println(names[0].fullName + ", " + names[0].position +  ", месячный доход " + salaryMonth + " грн");
            }
             if (name instanceof MonthlyRates) {
                MonthlyRates salary = (MonthlyRates) name;
                double salaryYear = salary.calcYearSalary(4500);
                System.out.println(names[0].fullName + ", " + names[0].position +  ", ежегодный доход " + salaryYear + " грн");
            }
            if (name instanceof HourlyRates) {
                HourlyRates salary = (HourlyRates) name;
                double salaryMonth = salary.calcMonthSalary(100);
                System.out.println(names[1].fullName + ", " + names[1].position +  ", месячный доход " + salaryMonth + " $");
            }
            if (name instanceof HourlyRates) {
                HourlyRates salary = (HourlyRates) name;
                double salaryYear = salary.calcYearSalary(1200);
                System.out.println(names[1].fullName + ", " + names[1].position +  ", месячный доход " + salaryYear + " $");
            }
        }


    }
}
