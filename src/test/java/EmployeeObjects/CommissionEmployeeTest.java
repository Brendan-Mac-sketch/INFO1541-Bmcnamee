package EmployeeObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommissionEmployeeTest {

    CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);

    @Test
    void testIncreaseSales() {
        emp.increaseSales();
        assertEquals("Sales", emp.getSales());

    }

    @Test
    void testAnnualRaise() {
    }

    @Test
    void testHolidayBonus() {
    }
}