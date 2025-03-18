package EmployeeObjects;

import EmployeeObjects.*;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestingAnnotations {
    public static void main(String[] args) {
        // Create employee objects
        HourlyEmployee hourlyEmployee = new HourlyEmployee();
        SalaryEmployee salaryEmployee = new SalaryEmployee();
        CommissionEmployee commissionEmployee = new CommissionEmployee();

        // Array of employee objects
        Object[] employees   = {hourlyEmployee, salaryEmployee, commissionEmployee};

        // Count annotated employee types
        int employeeTypeCount = 0;

        for (Object employee : employees) {
            if (employee.getClass().isAnnotationPresent(EmployeeType.class)) {
                employeeTypeCount++;
            }
        }

        System.out.println("You have " + employeeTypeCount + " employee types");


        for (Object employee : employees) {
            Class<?> clazz = employee.getClass();


            for (Field field : clazz.getDeclaredFields()) {
                if (field.isAnnotationPresent(payRate.class)) {
                    field.setAccessible(true);
                    try {
                        System.out.println("Employee pay rate: $" + field.get(employee));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}