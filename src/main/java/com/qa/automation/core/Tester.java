package com.qa.automation.core;

public class Tester extends Employee {

    private final String testingTool;

    public Tester(String name, double salary, String testingTool) {
        super(name, salary);
        this.testingTool = testingTool;
    }

    public String getTestingTool() {
        return testingTool;
    }

    @Override
    public String getRole() {
        return "Tester";
    }
}
