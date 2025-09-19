package com.qa.automation.core;

public class OrganizationApp {
    public static void main(String[] args) {
        Manager mgr = new Manager("Eve", 100000);
        Developer dev = new Developer("Alice", 80000, "Java");
        Tester tester = new Tester("Bob", 60000, "Selenium");

        mgr.addTeamMember(dev);
        mgr.addTeamMember(tester);

        mgr.printTeam();
    }
}
