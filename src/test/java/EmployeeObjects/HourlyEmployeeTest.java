package EmployeeObjects;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HourlyEmployeeTest {

    @Test
    public void testIncreaseHoursPositive() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(5);
        assertEquals(5, emp.getHoursWorked(), "Hours worked should be 5 after adding 5 hours.");
    }

    @Test
    public void testIncreaseHoursNegative() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(-3);
        assertEquals(0, emp.getHoursWorked(), "Hours worked should remain 0 after attempting to add negative hours.");
    }

    @Test
    public void testAnnualRaise() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.annualRaise();  // employee object has annual raise applied to it whic performs calculation
        assertEquals(34.49, emp.getWage(), "Wage should be 34.49 after annual raise.");  // this is testing the updated wage after the anuall raise is applied
    }

    @Test
    public void testCalculateWeeklyPayUnder40Hours() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(35);
        assertEquals(1149.75, emp.calculateWeeklyPay(), "Weekly pay should be 1149.75 for 35 hours worked.");
    }

    @Test
    public void testCalculateWeeklyPayOver40Hours() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(45);     // sends it off to the increase hours method
        double employee = emp.calculateWeeklyPay();
        double pay = Math.round(employee * 100.0) / 100.0;
        assertEquals(1560.38, pay);
    }                           // still holding to the object the value is
}