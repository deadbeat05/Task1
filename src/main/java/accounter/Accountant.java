package accounter;

import abstract_class.Employee;
import employees.Manager;
import employees.Programmer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Accountant {
    public static void main(String[] args) {
        int maxWorkRate=40000;
        int minWorkRate=20000;
        int maxWorkedHours=160;
        int minWorkedHours=80;
        Random random= new Random();
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Programmer());
        employees.add(new Manager());
        employees.add(new Programmer());
        employees.add(new Programmer());
        employees.add(new Manager());
        for (Employee employee:employees) {
            employee.setWorkRate(random.nextInt(maxWorkRate-minWorkRate)+minWorkRate);
            employee.setWorkedHours(random.nextInt(maxWorkedHours-minWorkedHours)+minWorkedHours);
            System.out.println(employee.getSalaryPerMonth());
        }
    }
}
