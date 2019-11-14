package entity;

import org.junit.Test;

import static org.junit.Assert.*;

public class ManagerTest {

    @Test
    public void setWorkRate() {
        Manager manager = new Manager();
        boolean actual = manager.setWorkedHours(40);
        boolean expected = true;
        assertEquals(actual,expected);
    }

    @Test
    public void setWorkedHours() {
        Manager manager = new Manager();
        boolean actual = manager.setWorkedHours(160);
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    public void getPercentWorkedHours() {
        Manager manager = new Manager();
        manager.setWorkedHours(100);
        double actual = manager.getPercentWorkedHours();
        double expected = 62.5;
        assertEquals(expected,actual,0.1);
    }

    @Test
    public void getSalaryPerMonth() {
        Manager manager = new Manager();
        manager.setWorkRate(40000);
        manager.setWorkedHours(100);
        double actual = manager.getSalaryPerMonth();
        double expected =25000;
        assertEquals(expected,actual,0.1);
    }

    @Test
    public void getSalaryPerMonthOverWork() {
        Manager manager = new Manager();
        manager.setWorkRate(40000);
        manager.setWorkedHours(200);
        double actual = manager.getSalaryPerMonth();
        double expected =40000;
        assertEquals(expected,actual,0.1);
    }
}