package EmployeeObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommissionEmployeeTest {



    @Test
    public void testIncreaseSales() {
        // Initialize the CommissionEmployee object
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", 0.0265);
        emp.increaseSales();
        double sales = emp.setSales(50.00) + 100 ;
        assertEquals(sales, emp.increaseSales(50.00));
        // sales and set sales are working added a setter sales

    }

    @Test
    void testAnnualRaise() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", 0.0265);
        emp.annualRaise();
        emp.annualRaise();
        assertEquals(0.0305, emp.getRate());
    } //check this later it seems off

    @Test
    void testHolidayBonus() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);
        assertEquals(emp.holidayBonus(),0);// check to make sure that zero is given as holiday bonus (that sucks)
    }
}