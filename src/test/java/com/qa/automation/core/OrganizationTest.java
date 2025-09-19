package com.qa.automation.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class OrganizationTest {

    @Test
    void testManagerWithTeam() {
        Manager mgr = new Manager("Eve", 100000);
        Developer dev = new Developer("Alice", 80000, "Java");
        Tester tester = new Tester("Bob", 60000, "Selenium");

        mgr.addTeamMember(dev);
        mgr.addTeamMember(tester);

        assertEquals("Manager", mgr.getRole());
        assertEquals(2, mgr.getTeam().size());
        assertEquals("Developer", mgr.getTeam().get(0).getRole());
        assertEquals("Tester", mgr.getTeam().get(1).getRole());
    }

    @Test
    void testPolymorphism() {
        Employee emp = new Developer("Charlie", 90000, "Python");
        assertEquals("Developer", emp.getRole()); // runtime polymorphism
    }

    @Test
    void testEmployeeValidation() {
        assertThrows(IllegalArgumentException.class, () -> new Employee("", 1000));
        assertThrows(IllegalArgumentException.class, () -> new Employee("Name", -1));
    }

    @Test
    void testManagerTeamImmutableView() {
        Manager mgr = new Manager("Eve", 100000);
        Developer dev = new Developer("Alice", 80000, "Java");
        mgr.addTeamMember(dev);
        assertThrows(UnsupportedOperationException.class, () -> mgr.getTeam().add(new Tester("T", 1, "t")));
    }
}

