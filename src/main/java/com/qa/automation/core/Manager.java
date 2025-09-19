package com.qa.automation.core;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
    private final List<Employee> team;

    public Manager(String name, double salary) {
        super(name, salary);
        team = new ArrayList<>();
    }

    public void addTeamMember(Employee e) {
        team.add(e);
    }

    public List<Employee> getTeam() {
        return team;
    }

    @Override
    public String getRole() {
        return "Manager";
    }

    public int getTeamSize() {
        return team.size();
    }
}
