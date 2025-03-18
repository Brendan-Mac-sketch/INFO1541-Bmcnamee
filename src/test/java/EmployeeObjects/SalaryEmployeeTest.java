package EmployeeObjects;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class SalaryEmployeeTest {

    @Test
    void testCalculateWeeklyPay() {
    SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);
    assertEquals(1237.02, emp.calculateWeeklyPay());
    }

    @Test
    void testHolidayBonus() {
        SalaryEmployee emp = new SalaryEmployee("Steve", "Rodgers", 3781, "Sales", "Manager", 64325);
        double employee= emp.holidayBonus();
        double employed= Math.round(employee * 100) / 100.0;
        assertEquals(2164.54, employed);
    }
}