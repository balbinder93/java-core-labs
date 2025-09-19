package com.qa.automation.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {

    @Test
    void testDeveloperRole() {
        Employee dev = new Developer("Alice", 80000, "Java");
        assertEquals("Developer", dev.getRole());
        assertEquals("Alice", dev.getName());
        assertEquals(80000, dev.getSalary());
    }

    @Test
    void testTesterRole() {
        Employee tester = new Tester("Bob", 60000, "Selenium");
        assertEquals("Tester", tester.getRole());
        assertEquals("Bob", tester.getName());
        assertEquals(60000, tester.getSalary());
    }

    @Test
    void testPolymorphism() {
        Employee emp1 = new Developer("Charlie", 90000, "Python");
        Employee emp2 = new Tester("Dana", 70000, "Playwright");

        // Polymorphism in action
        assertEquals("Developer", emp1.getRole());
        assertEquals("Tester", emp2.getRole());
    }
}
