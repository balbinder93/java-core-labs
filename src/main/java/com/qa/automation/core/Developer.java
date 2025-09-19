package com.qa.automation.core;

public class Developer extends Employee {

    private final String programmingLang;

    public Developer(String name, double salary, String programmingLang) {
        super(name, salary);
        if (programmingLang == null || programmingLang.isBlank())
            throw new IllegalArgumentException("Programming language required");
        this.programmingLang = programmingLang;
    }

    public String programmingLang() {
        return programmingLang;
    }

    @Override
    public String getRole() {
        return "Developer";
    }
}
