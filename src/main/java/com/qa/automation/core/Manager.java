package com.qa.automation.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Manager extends Employee {
    private final List<Employee> team;

    public Manager(String name, double salary) {
        super(name, salary);
        team = new ArrayList<>();
    }

    public void addTeamMember(Employee e) {
        if (e == null) throw new IllegalArgumentException("Team member cannot be null");
        team.add(e);
    }

    public List<Employee> getTeam() {
        return Collections.unmodifiableList(team);
    }

    @Override
    public String getRole() {
        return "Manager";
    }

    public int getTeamSize() {
        return team.size();
    }

    public void printTeam() {
        System.out.println(getName() + "'s team:");
        for (Employee e : team) {
            System.out.println(" - " + e);
        }
    }

    public void giveRaiseToAll(double percent) {
        for (Employee e : team) {
            e.increaseSalaryByPercent(percent);
        }
    }

    public void giveRaiseToRole(String targetRole, double percent) {
        if (targetRole == null) throw new IllegalArgumentException("Target Role required");
        for (Employee e : team) {
            if (targetRole.equals(e.getRole())) {
                e.increaseSalaryByPercent(percent);
            }
        }
    }

    public List<Employee> getTeamSortedBySalaryDescending() {
        List<Employee> copy = new ArrayList<>(team);
        copy.sort(Comparator.comparingDouble(Employee::getSalary).reversed());
        return Collections.unmodifiableList(copy);
    }
}
