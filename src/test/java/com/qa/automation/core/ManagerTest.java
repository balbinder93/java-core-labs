package com.qa.automation.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    void testManagerRole() {
        Manager mgr = new Manager("Eve", 100000);

        assertEquals("Manager", mgr.getRole());
        assertEquals("Eve", mgr.getName());
        assertEquals(100000, mgr.getSalary());
        assertEquals(0, mgr.getTeamSize());
    }

    @Test
    void testAddTeamMembers() {
        Manager mgr = new Manager("Eve", 100000);

        Developer dev = new Developer("Alice", 80000, "Java");
        Tester tester = new Tester("Bob", 60000, "Selenium");

        mgr.addTeamMember(dev);
        mgr.addTeamMember(tester);

        assertEquals(2, mgr.getTeamSize());
        assertTrue(mgr.getTeam().contains(dev));
        assertTrue(mgr.getTeam().contains(tester));
    }
}