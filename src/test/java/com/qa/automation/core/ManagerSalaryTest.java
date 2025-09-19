package com.qa.automation.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

class ManagerSalaryTest {

    @Test
    void testGiveRaiseToAll() {
        Manager mgr = new Manager("M", 120000);
        Developer dev = new Developer("Dev", 80000, "Java");
        Tester tester = new Tester("Test", 60000, "Selenium");

        mgr.addTeamMember(dev);
        mgr.addTeamMember(tester);

        mgr.giveRaiseToAll(10.0); // +10%

        assertEquals(88000.0, dev.getSalary(), 0.001);
        assertEquals(66000.0, tester.getSalary(), 0.001);
    }

    @Test
    void testGiveRaiseToRole() {
        Manager mgr = new Manager("M", 120000);
        Developer dev1 = new Developer("Dev1", 80000, "Java");
        Developer dev2 = new Developer("Dev2", 90000, "Python");
        Tester tester = new Tester("Test", 60000, "Selenium");

        mgr.addTeamMember(dev1);
        mgr.addTeamMember(dev2);
        mgr.addTeamMember(tester);

        mgr.giveRaiseToRole("Developer", 5.0); // only developers get +5%

        assertEquals(80000 * 1.05, dev1.getSalary(), 0.001);
        assertEquals(90000 * 1.05, dev2.getSalary(), 0.001);
        assertEquals(60000, tester.getSalary(), 0.001);
    }

    @Test
    void testGetTeamSortedBySalaryDescending() {
        Manager mgr = new Manager("M", 120000);
        Developer dev = new Developer("Dev", 80000, "Java");
        Tester tester = new Tester("Test", 60000, "Selenium");
        Developer richDev = new Developer("RichDev", 150000, "Scala");

        mgr.addTeamMember(dev);
        mgr.addTeamMember(tester);
        mgr.addTeamMember(richDev);

        List<Employee> sorted = mgr.getTeamSortedBySalaryDescending();
        assertEquals(3, sorted.size());
        assertEquals("RichDev", sorted.get(0).getName());
        assertEquals("Dev", sorted.get(1).getName());
        assertEquals("Test", sorted.get(2).getName());
    }
}
