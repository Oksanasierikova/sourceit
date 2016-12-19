package L7HomeWorkAccounting;

/**
 * Created by P-C on 19.12.2016.
 */
public class Accounting {
    public static void main(String[] args) {

        Employee[] emp1 = new Employee[4];
        emp1[0] = new EmployeeMonthlyRates("Иванова Елена Львовна", "зам директора",  4500);
        emp1[1] = new EmployeeHourlyRates("Вакуленко Дмитрий Владимирович", "дизайнер",  100,  1200, 27.6);
        emp1[2] = new EmployeePersentage("Коренькова Анна Павловна", "менеджер по продажам ",  50000, 690000);
        emp1[3] = new EmployeePersAndRate("Татьяна Сергеевна", "менеджер по продажам", 1000, 50000, 690000);

        for (int i = 0; i < emp1.length; i++) {
            System.out.println(emp1[i].name + ", " + emp1[i].position + " оклад " + emp1[i].getMonthSalary() + " грн в месяц");
            System.out.println(emp1[i].name + ", " + emp1[i].position + " оклад " + emp1[i].getYearSalary() + " грн в год");
        }
    }
}
