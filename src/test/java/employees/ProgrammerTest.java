package employees;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProgrammerTest {

    @Test
    public void setWorkRate() {
        Programmer programmer = new Programmer();
        boolean actual = programmer.setWorkedHours(40);
        boolean expected = true;
        assertEquals(actual,expected);
    }

    @Test
    public void setWorkedHours() {
        Programmer programmer = new Programmer();
        boolean actual = programmer.setWorkedHours(160);
        boolean expected = true;
        assertEquals(expected,actual);
    }

    @Test
    public void getPercentWorkedHours() {
        Programmer programmer = new Programmer();
        programmer.setWorkedHours(100);
        double actual = programmer.getPercentWorkedHours();
        double expected = 62.5;
        assertEquals(expected,actual,0.1);
    }

    @Test
    public void getSalaryPerMonth() {
        Programmer programmer = new Programmer();
        programmer.setWorkRate(40000);
        programmer.setWorkedHours(200);
        double actual = programmer.getSalaryPerMonth();
        double expected =50000;
        assertEquals(expected,actual,0.1);
    }
}